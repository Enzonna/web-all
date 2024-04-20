package com.enzo.servlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener, ServletRequestAttributeListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        ServletRequest servletRequest = sre.getServletRequest();
        System.out.println("request" + servletRequest.hashCode() + "initialized");
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        ServletRequest servletRequest = sre.getServletRequest();
        System.out.println("request" + servletRequest.hashCode() + "destroyed");
    }

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        Object value = srae.getValue();
        ServletRequest servletRequest = srae.getServletRequest();
        System.out.println("request" + servletRequest.hashCode() + "add:" + name + "=" + value);
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        Object value = srae.getValue();
        ServletRequest servletRequest = srae.getServletRequest();
        System.out.println("request" + servletRequest.hashCode() + "remove:" + name + "=" + value);
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        String name = srae.getName();
        Object value = srae.getValue();
        ServletRequest servletRequest = srae.getServletRequest();
        Object attribute = servletRequest.getAttribute(name);
        System.out.println("request" + servletRequest.hashCode() + "change:" + name + "=" + value + "to" + attribute);
    }
}
