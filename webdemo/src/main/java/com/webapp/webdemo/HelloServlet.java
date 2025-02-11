package com.webapp.webdemo;
import javax.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet {
    public void service(HttpServletRequest req,HttpServletResponse res){
        System.out.println("In service");
    }
}
