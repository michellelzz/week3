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
import java.util.*;
import java.time.LocalDate;

@WebServlet(name = "UpdateUserServlet", value = "/UpdateUser")
public class UpdateUserServlet extends HttpServlet {
    Connection con =null;
    @Override
    public  void init() throws ServletException {
        super.init();
        con=(Connection) getServletContext().getAttribute("con");
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("WEB-INF/views/updateUser.jsp").forward(request,response);
    }

    /*@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        *//* Connection con = (Connection) getServletContext().getAttribute("con");*//*
        int id = Integer.parseInt(request.getParameter("id"));//get id <input type="hidden" name="id" />
        String username = request.getParameter("username");//get Username <input type="text" name="username" />
        String password = request.getParameter("password");//get  password <input type="password" name="password" />
        String email = request.getParameter("email");//get <input type="text" name="email" />
        String gender = request.getParameter("gender");//get <input type="radio" name="gender"/>
        String birthday = request.getParameter("birthday");//get Birth Date <input type="text" name="birthDate" />

        User u = new User();
        u.setId(id);
        u.setUsername(username);
        u.setPassword(password);
        u.setEmail(email);
        u.setBirthday(dateutil.converStringToUtil(birthday));
        u.setGender(gender);

        UserDao dao = new UserDao();
        try {
            int n = UserDao.updateUser(con, user);//updateUser(con,user);
            User updateUser = UserDao.findById(con, id);
            HttpSession session = request.getSession();
            session.removeAttribute("user");
            session.setAttribute("user", updateUser);
            request.getRequestDispatcher("WEB-INF/views/userInfo.jsp").forward(request, response);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }*/
}

