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
   //<%--Todo 1: Use <jsp:useBean> to create a Login bean instance in request scope --%>

   // <%--Todo 2: Use <jsp:setProperty> to set  beans' property username and password--%>



<%
   //todo 3: use if check username is admin and ppassword is admin
    if (login.getUsername().equals("admin") && login.getPassword().equals("admin"))
%>


    //<%--todo 4: use jsp:forward to welcome.jsp page--%>
    <jsp:forward page="welcome.jsp">
   // <%--todo 5: else part{ --%>





<%
// todo 6: print username or password error message

%>
    //<%--todo 7: use jsp:include login.jsp page --%>

    //<%--todo 8: close else --%>

</body>
</html>