package com.Wanyu.week4;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
public class ConfigDemoServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response)
            throws IOException {
        PrintWriter writer= response.getWriter();
        writer.println("Name: Wanyu");
        writer.println("ID: 2020211001001425");
    }
    public void doPost(HttpServletRequest request,HttpServletResponse response){

    }

}

