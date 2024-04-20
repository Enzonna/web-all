package com.enzo.servlet;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

//ServletD������application�����޸ĺ��Ƴ�����,���ֶ���session������
@WebServlet(urlPatterns = "/servletD", name = "servletDName")
public class ServletD extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        //�޸�
        session.setAttribute("k1","value1");
        //ɾ��
        session.removeAttribute("k2");
        //�ֶ���session������
        session.invalidate();
    }
}