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
    
    <title>My JSP 'relDelete.jsp' starting page</title>
    
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
 	String id=request.getParameter("id");
	NewsDeatilServiceImpl ndsi=new NewsDeatilServiceImpl();
	int rows=ndsi.delNews(Integer.parseInt(id));
 	if(rows>0){
 	out.print("删除成功！！");
 	}else{
 	out.print("删除失败！！");	
 	}
 
  %>
  </body>
</html>
