<%@ page import="com.Wanyu.week10.demo.StringBean" %><%--
  Created by IntelliJ IDEA.
  User: 33837
  Date: 2022/5/30
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo-2-week 10</title>
</head>
<body>
<h1>use java code to access string bean class</h1>
<jsp:useBean id="bean" class="com.Wanyu.week10.demo.StringBean"/>

<%//com.Wanyu.week10.demo.StringBean bean=new StringBean();
  //bean.setMessage("Hello Mr bean- from java code");

%>
<jsp:setProperty name="bean" property="message" value='<%=request.getParameter("message")%>'/>
Message (using java code):<%=bean.getMessage()%>

<h2>use usebean to access stringBean class in jsp</h2>
message:(using getProperty):<jsp:getProperty name="bean" property="message"/>

</body>
</html>
