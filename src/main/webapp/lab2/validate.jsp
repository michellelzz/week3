<%@ page import="com.Wanyu.model.User" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/15/2021
  Time: 11:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>validate</title>
</head>
<body>

<%--Todo 1: Use <jsp:useBean> to create a Login bean instance in request scope --%>
<jsp:useBean id="login" class="com.Wanyu.week10.demo.StringBean" scope="session"></jsp:useBean>
<%--Todo 2: Use <jsp:setProperty> to set  beans' property username and password--%>
<%

%>


<%  //if (login.getUsername().equals("admin") && login.getPassword().equals("admin"))
    String username=request.getParameter("username");
    String password=request.getParameter("password");
    if("admin".equals(username)&&"admin".equals(password)){
%>
<jsp:setProperty property="username" name="login"></jsp:setProperty>
<jsp:setProperty property="password" name="login"></jsp:setProperty>
<%

        response.sendRedirect("welcome.jsp");
        //request.getRequestDispatcher("/Lab2/welcome.jsp").forward(request,response);
    }else{
        response.sendRedirect("login.jsp");
        //response.sendRedirect(request.getContextPath()+"/Lab2/login.jsp");
    }
%>



</body>
</html>