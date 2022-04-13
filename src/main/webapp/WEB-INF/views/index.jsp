<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@include file="header.jsp"%>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello">HelloServlet week1</a>
<br/>
<a href="end">Student info servlet week2</a>
<br/>
<a href="exc1.jsp">RegisterServlet week3</a>
<br/>
<a href="config">config parameter week4</a>
<br/>
<a href="exc1.jsp">Register JDBC week4</a>
<br/>
<a href="index.jsp">include week5</a>
<br/>
<a href="login.jsp">login week5</a>

<h2>Welcome to My Online Shop Home Page</h2><br>
<form method= "get" target='_bLank' action="search">
    <input type= "text" name="txt" size="30">
    <select name= "search" >
        <option value= "baidu"> Baidu</option>
        <option value= "bing">Bing</option>
        <option value= "google">Google</option>
    </select>
    <input type= "submit" value="Search"/>

</form>


<%@include file="footer.jsp"%>
