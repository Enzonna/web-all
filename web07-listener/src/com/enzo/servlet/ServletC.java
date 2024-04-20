package com.enzo.servlet;


import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

//ServletC������application���з�������
@WebServlet(urlPatterns = "/servletC", name = "servletCName")
public class ServletC extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //��application���з�������
        HttpSession session = req.getSession();
        session.setAttribute("k1","v1");
        session.setAttribute("k2","v2");
    }

}