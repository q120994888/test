<%@page import="cn.bdqn.bean.News_Detail"%>
<%@page import="cn.bdqn.service.impl.NewsDeatilServiceImpl"%>
<%@page import="cn.bdqn.service.NewsDeatilService"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'doUpdate.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  
  
  <% 
    request.setCharacterEncoding("utf-8");
    NewsDeatilService service =new NewsDeatilServiceImpl();
    String id=request.getParameter("id");
 	 News_Detail detail =service.findById(id);
 	 
    detail.setTitle(request.getParameter("title"));
    detail.setContent(request.getParameter("content"));
    detail.setAuthor(request.getParameter("author")) ;
 	detail.setSummary(request.getParameter("summary"));
    
 	boolean flag =service.updateById(detail);
 	 if(flag){
 	 response.sendRedirect("main.jsp");
 	 }else{
  	 response.sendRedirect("update.jsp");
  	}  
   %>

   
  </body>
</html>
