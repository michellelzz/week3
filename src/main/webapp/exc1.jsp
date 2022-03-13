<%--
  Created by IntelliJ IDEA.
  User: 33837
  Date: 2022/3/6
  Time: 22:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="register" method="post">
    <table align="center">
        <tr>
            <td>新用户注册！ </td>
            <td>     </td>

        </tr>
        <tr>
            <td>UserName:</td>
            <td><input type="text" name=name autofocus="autofocus" ></td>
        </tr>
        <tr>
            <td>Password:</td>
            <td><input type="text" name=password ></td>
        </tr>
        <tr>
            <td>E-mail</td>
            <td><input type="text" value="Correct message format" name="email"></td>
        </tr>
        <tr>
            <td>Birthday</td>
            <td><input type="text" value="(yyyy-mm-dd)" name="birthday"></td>

        </tr>

        <tr>
            <td>gender</td>
            <td>
                <input type="radio" name="female">female <input type="radio" name="male">male
            </td>
        </tr>
        <tr>
            <td></td>
            <td>
                <input type="submit" value="submit">
                <input type="reset" value="reset">
            </td>
        </tr>
    </table>

</form>>
</body>
</html>
