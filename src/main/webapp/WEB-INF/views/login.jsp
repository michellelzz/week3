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
<form action="Login" method="post">
    <table align="center">
    <tr>
        <td>UserName:</td>
        <td><input type="text" name="username" autofocus="autofocus" ></td>
    </tr>
    <tr>
        <td>Password:</td>
        <td><input type="text" name="password" ></td>
    </tr>
    <tr>
        <td></td>
        <td>
            <input type="submit" value="submit">
            <input type="reset" value="reset">
        </td>
    </tr>
        </table>
</form>
<%@include file="footer.jsp"%>

