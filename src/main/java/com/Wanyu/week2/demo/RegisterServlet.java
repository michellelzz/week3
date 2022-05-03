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

@WebServlet(urlPatterns = {"/register"},loadOnStartup = 1)
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
/*

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

*/
     con= (Connection) getServletContext().getAttribute("con");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       //request.getRequestDispatcher("WEN-INF/views/register.jsp").forward(request,response);
        request.getRequestDispatcher("WEB-INF/views/register.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String username =request.getParameter("username");
        String password =request.getParameter("password");
        String email =request.getParameter("email");
        String birthday =request.getParameter("birthdate");
        String gender =request.getParameter("gender");




        try{
            PreparedStatement ps=con.prepareStatement("insert into usertable values('"+id+"','"+username+"','"+password+"','"+email+"','"+birthday+"','"+gender+"')") ;
            ps.executeLargeUpdate();
            ps.close();
            response.sendRedirect("login");
        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
