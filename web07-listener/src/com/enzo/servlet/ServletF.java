package com.enzo.servlet;


import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

//ServletF�����������޸ĺ��Ƴ�����
@WebServlet(urlPatterns = "/servletF", name = "servletFName")
public class ServletF extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("k1","value1");
        req.removeAttribute("k2");
    }
}