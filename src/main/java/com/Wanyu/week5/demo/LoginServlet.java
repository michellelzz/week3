package com.Wanyu.week5.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

@WebServlet(name = "LoginServlet", value = "/Login")
public class LoginServlet extends HttpServlet {
    private static String jdbcDriver = "com.mysql.cj.jdbc.Driver";
    public static String jdbcUrl = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
    public static String jdbcUser = "root";
    public static String jdbcPwd = "root";
    private static Connection conn;
    public static Statement st;


    static {
        try {
            Class.forName(jdbcDriver);
            conn = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPwd);
            st = conn.createStatement();
        } catch (Exception e) {
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
        PrintWriter writer= response.getWriter();
        try {
            String sql ="SELECT * FROM usertable where username="+"'"+username+"'"+"and password="+"'"+password+"'";
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()==true){

                writer.println("Login success");
            }else {
                writer.println("error");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
