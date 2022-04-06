package com.Wanyu.week6.demo;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.xml.ws.WebEndpoint;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
@WebListener
public class JDBCServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context=sce.getServletContext();
        String driver = context.getInitParameter("driver");
        String username = context.getInitParameter("username");
        String url = context.getInitParameter("url");
        String password = context.getInitParameter("password");

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, username, password);

            context.setAttribute("con",con);
        }catch (ClassNotFoundException| SQLException e){
            e.printStackTrace();
        }

        System.out.println("i am in contextInitialized");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("i am in contextDestroyed");
        sce.getServletContext().removeAttribute("con");
    }
}
