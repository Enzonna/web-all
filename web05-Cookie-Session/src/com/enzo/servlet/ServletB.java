package com.enzo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

@WebServlet("/servletB")
public class ServletB extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //��ȡsession����
        HttpSession session = req.getSession();
        //��ȡsession��id
        String id = session.getId();
        System.out.println(id);
        //�ж�session�ǲ����´�����session
        boolean aNew = session.isNew();
        System.out.println(aNew);
        //��session��ȡ������
        String username = (String) session.getAttribute("username");
        System.out.println(username);
    }
}

