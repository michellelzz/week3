<%--
  Created by IntelliJ IDEA.
  User: 33837
  Date: 2022/4/6
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp"%>
<h1>userinfo</h1>
<table>
    <tr>
        <td>id</td><td><%=request.getAttribute("id")%></td></tr><tr>
        <td>username</td><td><%=request.getAttribute("username")%></td></tr><tr>
        <td>password</td><td><%=request.getAttribute("password")%></td></tr><tr>
        <td>email</td><td><%=request.getAttribute("email")%></td></tr><tr>
        <td>birthday</td><td><%=request.getAttribute("birthday")%></td></tr><tr>
        <td>female</td><td><%=request.getAttribute("female")%></td></tr><tr>
        <td>male</td><td><%=request.getAttribute("male")%></td>

    </tr>


</table>

<%@ include file="footer.jsp"%>