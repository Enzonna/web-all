package com.enzo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/servletB")
public class ServletB extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取session对象
        HttpSession session = req.getSession();
        //获取session的id
        String id = session.getId();
        System.out.println(id);
        //判断session是不是新创建的session
        boolean aNew = session.isNew();
        System.out.println(aNew);
        //从session中取出数据
        String username = (String) session.getAttribute("username");
        System.out.println(username);
    }
}

