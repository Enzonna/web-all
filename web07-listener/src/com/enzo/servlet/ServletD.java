package com.enzo.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

//ServletD用于向application域中修改和移除数据,并手动让session不可用
@WebServlet(urlPatterns = "/servletD", name = "servletDName")
public class ServletD extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        //修改
        session.setAttribute("k1","value1");
        //删除
        session.removeAttribute("k2");
        //手动让session不可用
        session.invalidate();
    }
}