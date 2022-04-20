<%--
  Created by IntelliJ IDEA.
  User: 33837
  Date: 2022/4/20
  Time: 14:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>User Update</h1>

<%
User u=(User) session.getAttribute("user");
%>
<form action="register" method="post">
  <table align="center">
    <tr>
      <td>新用户注册！ </td>
      <td>     </td>
    </tr>
    <input type="hidden" name="id" value="<%=u.getId()%>">
    <tr>
      <td>id:</td>
      <td><input type="text" name="id"></td>
    </tr>
    <tr>
      <td>UserName:</td>
      <td><input type="text" name="username" autofocus="autofocus" value="<%=u.getUsername()%>"></td>
    </tr>
    <tr>
      <td>Password:</td>
      <td><input type="text" name="password" value="<%=u.getPassword()%>"></td>
    </tr>
    <tr>
      <td>E-mail</td>
      <td><input type="text" value="Correct message format" name="email" value="<%=u.getEmail()%>"></td>
    </tr>
    <tr>
      <td>Birthday</td>
      <td><input type="text" value="(yyyy-mm-dd)" name="birthday" value="<%=u.getBirthday()%>"></td>
    </tr>
    <tr>
      <td>gender</td>
      <td>
        <input type="radio" name="female" value="female"<%="female".equals(u.getFemale())?"check":""%>>female
        <input type="radio" name="male" value="female"<%="male".equals(u.getMale())?"check":""%>>male
      </td>
    </tr>
    <tr>
      <td></td>
      <td>
        <input type="submit" value="Save Changes">
        <input type="reset" value="reset">
      </td>
    </tr>
  </table>
</form>

<%@include file="footer.jsp"%>