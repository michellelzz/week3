<%--
  Created by IntelliJ IDEA.
  User: 33837
  Date: 2022/3/22
  Time: 21:53
  To change this template use File | Settings | File Templates.
--%>
<%@page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>
<head>
    <title>Title</title>
</head>

<body>
<form>
  <table border="1px">
    <tr>
      <th>id</th>
      <th>username</th>
      <th>password</th>
      <th>email</th>
      <th>birthday</th>
      <th>female</th>
      <th>male</th>
    </tr>
   <c:forEach items="${requestScope.users}" var="users">
      <tr>
        <td>${users.id} </td>
        <td>${users.username} </td>
        <td>${users.password} </td>
        <td>${users.email} </td>
        <td>${users.birthday} </td>
        <td>${users.female} </td>
        <td>${users.male} </td>
      </tr>
    </c:forEach>
  </table>
</form>

</body>
</html>
