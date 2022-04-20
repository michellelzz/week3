<%--
  Created by IntelliJ IDEA.
  User: 33837
  Date: 2022/3/28
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="header.jsp"%>
<%
    if (!(request.getAttribute("message")==null)){
        out.print(request.getAttribute("message"));
    }
%>
<%
 Cookie[] allCookies=request.getCookies();
 String username="",password="",rememberMeVal="";
 if (allCookies!=null){
     for (Cookie c:allCookies) {
         if (c.getName().equals("cUsername")){
             username=c.getValue();
         }
         if (c.getName().equals("cPassword")){
             password=c.getValue();
         }
         if (c.getName().equals("cRememberMe")){
            rememberMeVal=c.getValue();
         }
     }
 }
%>
<form action="Login" method="post">
    UserName:<input type="text" name="username" autofocus="autofocus" value="<%=username%>"><br/>
    Password:<input type="text" name="password" value="<%=password%>"><br/>
    <input type="checkbox" name="rememberMe" value="1"<%=rememberMeVal.equals("1") ?"checked":""%>checked/>RememberMe<br/>
    <input type="submit" value="submit">
    <input type="reset" value="reset">

</form>
<%@include file="footer.jsp"%>

