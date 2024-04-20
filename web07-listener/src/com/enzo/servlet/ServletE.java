package com.enzo.servlet;


import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//ServletE�������������з�������
@WebServlet(urlPatterns = "/servletE", name = "servletEName")
public class ServletE extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("k1","v1");
        req.setAttribute("k2","v2");
        //����ת��
        req.getRequestDispatcher("servletF").forward(req,resp);
    }
}