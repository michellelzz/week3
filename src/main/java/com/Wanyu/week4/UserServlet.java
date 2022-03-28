package com.Wanyu.week4;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;


@WebServlet(name = "UserServlet", value = "/user")
public class UserServlet extends HttpServlet {
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
        List<Map> list =new ArrayList<Map>();

        String idcard_w = request.getParameter("idcard_w");
        System.out.println(idcard_w);
        try {
            String sql ="SELECT * FROM usertable";


            ResultSet rs = st.executeQuery(sql);
            System.out.println("获取数据");
            while (rs.next()) {
                int id = rs.getInt("id");
                String username = rs.getString("username");
                String password = rs.getString("password");
                String male =rs.getString("male");
                String female=rs.getString("female");
                String  email = rs.getString("email");
                Date birthday = rs.getDate("birthday");


                Map map = new HashMap();
                map.put("id", id);
                map.put("username", username);
                map.put("password", password);
                map.put("email",email);
                map.put("birthday",birthday);
                map.put("female",female);
                map.put("male",male);


                System.out.println(map);
                list.add(map);
                System.out.println();
                for (Map map_1 :list) {
                    System.out.println(map_1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        request.setAttribute("users",list);
        request.getRequestDispatcher("User.jsp").forward(request,response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
