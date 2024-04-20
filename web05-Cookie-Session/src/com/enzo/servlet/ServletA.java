package com.enzo.servlet;

import com.sun.net.httpserver.HttpServer;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.security.Provider;


@WebServlet("/servletA")
public class ServletA extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求中的参数
        String username = req.getParameter("username");
        //获取session对象
        HttpSession session = req.getSession();
        //获取session的id
        String id = session.getId();
        System.out.println(id);
        //判断session是不是新创建的session
        boolean aNew = session.isNew();
        System.out.println(aNew);
        //向session对象中存入数据
        session.setAttribute("username",username);
    }
}
