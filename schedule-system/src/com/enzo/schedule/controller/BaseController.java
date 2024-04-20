package com.enzo.schedule.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Method;


public class BaseController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //�жϴ˴�����������ɾ���ģ��飿
        String requestURI = req.getRequestURI();//  /schedule/add
        String[] split = requestURI.split("/");
        String methodName = split[split.length - 1];

        //ʹ�÷��䣬ͨ����������ȡ����ķ���
        Class aClass = this.getClass();
        //��ȡ����
        try {
            Method declaredMethod = aClass.getDeclaredMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            //�����ƽⷽ���ķ������η�������
            declaredMethod.setAccessible(true);
            //ִ�з���
            declaredMethod.invoke(this, req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
