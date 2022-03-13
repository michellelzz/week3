package com.Wanyu.week2.demo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username =request.getParameter("username");
        String password =request.getParameter("password");
        String email =request.getParameter("email");
        String birthday =request.getParameter("birthday");
        String female =request.getParameter("female");
        String male =request.getParameter("male");

        PrintWriter writer= response.getWriter();
        writer.println("<br>"+username);
        writer.println("<br>"+password);
        writer.println("<br>"+email);
        writer.println("<br>"+birthday);
        writer.println("<br>"+female);
        writer.println("<br>"+male);
        writer.close();



    }
}
