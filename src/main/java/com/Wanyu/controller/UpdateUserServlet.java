package com.Wanyu.controller;

import com.Wanyu.dao.UserDao;
import com.Wanyu.model.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "UpdateUserServlet", value = "/UpdateUser")
public class UpdateUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/views/updateUser.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection con = (Connection) getServletContext().getAttribute("con");
        int id =Integer.parseInt(request.getParameter("id"));//get id <input type="hidden" name="id" />
        String username =request.getParameter("username");//get Username <input type="text" name="username" />
        String password =request.getParameter("password");//get  password <input type="password" name="password" />
        String email =request.getParameter("email");//get <input type="text" name="email" />
        String female =request.getParameter("female");//get <input type="radio" name="gender"/>
        String male =request.getParameter("male");
        Date birthdaty = Date.valueOf(request.getParameter("birthDate"));//get Birth Date <input type="text" name="birthDate" />
        
        User u=new User();
        u.setId(id);
        u.setUsername(username);
        u.setPassword(password);
        u.setEmail(email);
        u.setBirthday(birthdaty);
        u.setFemale(female);
        u.setFemale(male);
        UserDao dao =new UserDao();
        try{
            dao.updateUser(con,u);
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        request.getRequestDispatcher("WEB-INF/views/userInfo.jsp").forward(request,response);
    }
}

