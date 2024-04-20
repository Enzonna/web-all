package com.enzo.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: ServletA
 * Package: com.enzo.servlet
 * Description:
 *
 * @Author ENZO
 * @Create 2024/3/9 16:19
 * @Version 1.0
 */
@WebServlet("/servletA")
public class ServletA extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servletA 执行了");
        String money = req.getParameter("money");
        System.out.println("servletA获得了参数：money" + money);
        //请求转发给servletB
        //获得请求转发器
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("servletB");
        //让请求转发器做出转发动作
        requestDispatcher.forward(req, resp);

    }
}
