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
        //��ȡ�����еĲ���
        String username = req.getParameter("username");
        //��ȡsession����
        HttpSession session = req.getSession();
        //��ȡsession��id
        String id = session.getId();
        System.out.println(id);
        //�ж�session�ǲ����´�����session
        boolean aNew = session.isNew();
        System.out.println(aNew);
        //��session�����д�������
        session.setAttribute("username",username);
    }
}
