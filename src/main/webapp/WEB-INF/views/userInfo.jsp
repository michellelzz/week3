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
User user=(User)request.getAttribute("user");
%>
<table>
    <tr>
        <td>id</td><td><%=user.getId()%></td></tr><tr>
        <td>username</td><td><%=user.getUsername()%></td></tr><tr>
        <td>password</td><td><%=user.getPassword()%></td></tr><tr>
        <td>email</td><td><%=user.getEmail()%></td></tr><tr>
        <td>birthday</td><td><%=user.getBirthday()%></td></tr><tr>
        <td>female</td><td><%=user.getFemale()%></td></tr><tr>
        <td>male</td><td><%=user.getMale()%></td>

    </tr>


</table>

<%@ include file="footer.jsp"%>