package com.enzo.servlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

/**
 * ClassName: Servlet1
 * Package: com.enzo.servlet
 * Description:
 *
 * @Author ENZO
 * @Create 2024/3/8 22:15
 * @Version 1.0
 */
public class Servlet1 extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("-------------------------ServletConfig获取参数-------------------------------------");
        ServletConfig servletConfig = getServletConfig();
        //获取初始配置信息即可
        //1.根据参数名获取参数值
        String keyA = servletConfig.getInitParameter("keyA");
        System.out.println("keyA:" + keyA);

        //获取所有的初始参数的名字  早期的迭代器
        //hasMoreElements()     判断有没有下一个参数，如果有返回true，如果没有返回false
        //nextElement()         取出下一个元素，向下移动游标
        Enumeration<String> initParameterNames = servletConfig.getInitParameterNames();

        while (initParameterNames.hasMoreElements()) {
            String name = initParameterNames.nextElement();
            System.out.println(name + "=" + getInitParameter(name));
        }

        System.out.println("------------------------ServletContext获取参数---------------------------------------");
        //获取ServletContext
        ServletContext servletContext = getServletContext();
        ServletContext servletContext1 = servletConfig.getServletContext();
        ServletContext servletContext2 = req.getServletContext();

        String encoding = servletContext.getInitParameter("encoding");
        System.out.println("encoding" + encoding);

        Enumeration<String> initParameterNames1 = servletContext1.getInitParameterNames();
        while (initParameterNames1.hasMoreElements()){
            String name = initParameterNames.nextElement();
            System.out.println(name + "=" + servletContext1.getInitParameter(name));
        }

        String realPath = servletContext.getRealPath("资源在web目录中的路径");
        String contextPath = servletContext.getContextPath();

    }
}
