package com.enzo.servlet;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * servlet开发流程：
 * 1.创建JavaWEB项目，同时将tomcat添加到当前项目的依赖
 * 2.重写service方法 service(HttpServletRequest req, HttpServletResponse resp)
 * 3.在service方法中，定义业务处理代码
 * 4.在web.xml中，配置servlet对应的请求映射路径
 *
 * 需要注意的问题：
 *  1.servlet-api.jar 导入问题
 *  2.Content-Type响应头的问题
 */

public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");

        String info = "YES";

        if ("enzo".equals(username)) {
            info = "NO";
        }


        //将要响应的数据放入response
        //应该设置Content-Type响应头
        //resp.setHeader("Content-Type","text/html");
        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        writer.write(info);


    }
}
