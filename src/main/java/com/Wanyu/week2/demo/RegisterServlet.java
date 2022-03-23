package com.Wanyu.week2.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


public class RegisterServlet extends HttpServlet {
    Connection con=null;
    public void init() throws ServletException {


        // String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
        // String url="jdbc:sqlserver://localhost:1433;database=userwy;encrypt=false";//dabatbase name is rigth?
        //  String username="sa";
        // String password="123456";

  /*    ServletConfig config=getServletConfig();

        String driver= config.getInitParameter("driver");
        String url= config.getInitParameter("url");
        String username= config.getInitParameter("username");
        String password= config.getInitParameter("password");    */

        ServletContext context= getServletContext();
        String driver = context.getInitParameter("driver");
        String username = context.getInitParameter("username");
        String url = context.getInitParameter("url");
        String password = context.getInitParameter("password");

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url, username, password);
            System.out.println(con);
        }catch (ClassNotFoundException| SQLException e){
            e.printStackTrace();
        }


    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String username =request.getParameter("username");
        String password =request.getParameter("password");
        String email =request.getParameter("email");
        String birthday =request.getParameter("birthday");
        String female =request.getParameter("female");
        String male =request.getParameter("male");

        PrintWriter writer= response.getWriter();
        writer.println("<br>"+id);
        writer.println("<br>"+username);
        writer.println("<br>"+password);
        writer.println("<br>"+email);
        writer.println("<br>"+birthday);
        writer.println("<br>"+female);
        writer.println("<br>"+male);
        writer.close();

        try{
            PreparedStatement ps=con.prepareStatement("insert into usertable values('"+id+"','"+username+"','"+password+"','"+email+"','"+birthday+"','"+female+"','"+male+"')") ;
            ps.executeLargeUpdate();
            ps.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}