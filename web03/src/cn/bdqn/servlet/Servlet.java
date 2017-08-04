package cn.bdqn.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.bdqn.bean.News_User;
import cn.bdqn.service.impl.UserServiceImpl;

public class Servlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		   request.setCharacterEncoding("utf-8");
		   
		    String name=request.getParameter("username");
		    String password=request.getParameter("password");    
		    UserServiceImpl usimpl=new UserServiceImpl();   	
		    News_User user=usimpl.login(name,password);
		    
		    
		    if(user!=null){   
		    
		    request.getSession().setAttribute("user", user);
		    
		    response.sendRedirect("main.jsp");
		     

		    }else{
		      response.sendRedirect("login.jsp");
		    }
		
		
	}

}
