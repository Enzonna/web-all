package com.enzo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * ClassName: Servlet1
 * Package: com.enzo.servlet
 * Description:
 *
 * @Author ENZO
 * @Create 2024/3/8 18:56
 * @Version 1.0
 */

@WebServlet(name = "userServlet",
        //value = "/user",
        urlPatterns = {"/userServlet1", "/userServlet2", "/userServlet3"},
        loadOnStartup = 6
)
public class Servlet1 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Servlet1执行了");

    }
}
