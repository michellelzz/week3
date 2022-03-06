package com.Wanyu.week2.demo;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.PrintWriter;
    public class exec1 extends HttpServlet{
        public void doGet(HttpServletRequest request,HttpServletResponse response)
                throws IOException {
            PrintWriter writer= response.getWriter();
            writer.println("Name: Wanyu");
            writer.println("ID: 2020211001001425");
            writer.println("Date and Time: Sun Mar 6 19:47");
        }
        public void doPost(HttpServletRequest request,HttpServletResponse response){

        }

    }



