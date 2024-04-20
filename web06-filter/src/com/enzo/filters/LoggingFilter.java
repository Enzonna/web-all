package com.enzo.filters;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class LoggingFilter implements Filter {
    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //������ת��
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //ƴ����־�ı�
        String requestURI = request.getRequestURI();
        String time = dateFormat.format(new Date());
        String beforeLogging = requestURI + "��" + time + "��������";
        //��ӡ��־
        System.out.println(beforeLogging);
        //��ȡϵͳʱ��
        long t1 = System.currentTimeMillis();
        //��������
        filterChain.doFilter(request, response);
        //��ȡϵͳʱ��
        long t2 = System.currentTimeMillis();
        //ƴ����־�ı�
        String afterLogging = requestURI + "��" + time + "�������ʱ��" + (t2 - t1) + "����";
        //��ӡ��־
        System.out.println(afterLogging);
    }
}
