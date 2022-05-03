<%@ page import="com.Wanyu.model.User" %><%--
  Created by IntelliJ IDEA.
  User: 33837
  Date: 2022/4/6
  Time: 12:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="header.jsp"%>
<h1>userinfo</h1>
<%
User u=(User)session.getAttribute("user");
%>
<table>
    <tr>
        <td>id</td><td><%=u.getId()%></td></tr><tr>
        <td>username</td><td><%=u.getUsername()%></td></tr><tr>
        <td>password</td><td><%=u.getPassword()%></td></tr><tr>
        <td>email</td><td><%=u.getEmail()%></td></tr><tr>
        <td>birthday</td><td><%=u.getBirthday()%></td></tr><tr>
        <td>gender</td><td><%=u.getGender()%></td></tr><tr>
        <td><a href="UpdateUser.jsp">Update</a></td>
    </tr>
</table>

<%@ include file="footer.jsp"%>