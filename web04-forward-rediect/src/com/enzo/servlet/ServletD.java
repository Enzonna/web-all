package com.enzo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: ServletD
 * Package: com.enzo.servlet
 * Description:
 *
 * @Author ENZO
 * @Create 2024/3/9 17:37
 * @Version 1.0
 */
@WebServlet("/servletD")
public class ServletD extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数
        String username = req.getParameter("username");
        System.out.println(username);
        //获取请求域中的数据
        String reqKey = (String) req.getAttribute("reqKey");
        System.out.println(reqKey);
        //做出响应
        resp.getWriter().write("servletD response!");
    }
}
