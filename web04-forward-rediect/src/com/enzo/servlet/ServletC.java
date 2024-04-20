package com.enzo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: ServletC
 * Package: com.enzo.servlet
 * Description:
 *
 * @Author ENZO
 * @Create 2024/3/9 17:33
 * @Version 1.0
 */
@WebServlet("/servletC")
public class ServletC extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数
        String username = req.getParameter("username");
        System.out.println(username);
        //向请求域中添加数据
        req.setAttribute("reqKey", "requestMSg");
        //响应重定向
        resp.sendRedirect("servletD");
    }
}
