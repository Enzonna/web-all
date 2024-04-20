package com.enzo.servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class ApplicationListener1 implements ServletContextListener, ServletContextAttributeListener {
    //��������ʼ��
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        System.out.println("application" + servletContext.hashCode() + "initialized");
    }

    //�����ݻ�
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        System.out.println("application" + servletContext.hashCode() + "destroy ");
    }

    //�����������
    @Override
    public void attributeAdded(ServletContextAttributeEvent scae) {
        String name = scae.getName();
        Object value = scae.getValue();
        ServletContext servletContext = scae.getServletContext();
        System.out.println("application" + servletContext.hashCode() + "add:" + name + "=" + value);
    }

    //���������Ƴ�
    @Override
    public void attributeRemoved(ServletContextAttributeEvent scae) {
        String name = scae.getName();
        Object value = scae.getValue();
        ServletContext servletContext = scae.getServletContext();
        System.out.println("application" + servletContext.hashCode() + "remove:" + name + "=" + value);
    }

    //���������޸�
    @Override
    public void attributeReplaced(ServletContextAttributeEvent scae) {
        String name = scae.getName();
        Object value = scae.getValue();
        ServletContext servletContext = scae.getServletContext();
        Object attribute = servletContext.getAttribute(name);
        System.out.println("application" + servletContext.hashCode() + "change:" + name + "=" + value + "to" + attribute);
    }

}
