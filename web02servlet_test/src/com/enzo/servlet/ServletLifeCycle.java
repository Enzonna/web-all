package com.enzo.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/*
    1.实例化                           构造器                 第一次请求/服务启动          1
    2.初始化                           init()                构造完毕                   1
    3.接受请求，处理请求 服务             service               每次请求                   多次
    4.销毁                             destroy()             关闭服务                   1

    Servlet在Tomcat是单例的
    Servlet的成员变量在多个线程栈之中是共享的，不支持，在service方法中修改成员变量，否则在并发请求时，会引发线程安全问题。

    load-on-startup，默认值是-1，含义是tomcat在启动时不会实例化servlet；
        放其他正整数，比如15，含义是tomcat在启动时，实例化该servlet的顺序，第15个进行实例化的；
        如果序号冲突，tomcat会自动协调启动顺序；
        自定义尽量不要占用数字1-5

    default-servlet

    public interface Servlet {
        //初始化方法，构造完毕后由tomcat自动调用完成初始化功能的方法；
        void init(ServletConfig var1) throws ServletException;

        //获得ServletConfig对象的方法；
        ServletConfig getServletConfig();

        //接受用户请求，向用户响应信息的方法；
        void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException;

        //返回Servlet字符串形式描述信息的方法；
        String getServletInfo();

        //Servlet在回收前，由tomcat调用的销毁方法，往往用于做资源的释放工作；
        void destroy();
    }

    抽象的类  GenericServlet
    public abstract class GenericServlet implements Servlet{
        private transient ServletConfig config;

        public void destroy() {
            //将抽象方法重写为普通方法，在方法内部没有任何的实现代码
            //平庸实现
        }

        //tomcat在调用init方法时，会读取配置信息进入一个ServletConfig对象，并将该对象传入init方法
        public void init(ServletConfig config) throws ServletException {
            //将config对象存储在当前的属性
            this.config = config;
            //调用了重载的无参的init
            this.init();
        }

        //重载的初始化方法，我们重写初始化方法时对应的方法
        public void init() throws ServletException {
        }

        //返回ServletConfig的方法
        public ServletConfig getServletConfig() {
            return this.config;
        }

        //再次抽象声明Servlet方法
        public abstract void service(ServletRequest var1, ServletResponse var2) throws ServletException, IOException;

    }

        抽象类HttpServlet 侧重service方法的处理
        public abstract class HttpServlet extends GenericServlet{
            //参数的父转子   调用重载的service方法
            public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
                //参数的父转子
                HttpServletRequest request = (HttpServletRequest)req;
                HttpServletResponse response = (HttpServletResponse)res;
                //调用重载的service方法
                this.service(request, response);
        }


        protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            //获取请求的方式
            String method = req.getMethod();    //GET POST PUT DELETE OPTIONS...

            //根据请求方式，调用对应的do...方法
            if (method.equals("GET")) {
                this.doGet(req, resp);
            } else if (method.equals("HEAD")) {
                this.doHead(req, resp);
            } else if (method.equals("POST")) {
                this.doPost(req, resp);
            } else if (method.equals("PUT")) {
                this.doPut(req, resp);
            } else if (method.equals("DELETE")) {
                this.doDelete(req, resp);
            } else if (method.equals("OPTIONS")) {
                this.doOptions(req, resp);
            } else if (method.equals("TRACE")) {
                this.doTrace(req, resp);
            } else {
                resp.sendError(501, errMsg);
            }

        }

        //故意响应405
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String msg = lStrings.getString("http.method_get_not_supported");
            //故意响应405请求方法不允许的信息
            resp.sendError(405, msg);
        }
        //故意响应405
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String msg = lStrings.getString("http.method_get_not_supported");
            //故意响应405请求方法不允许的信息
            resp.sendError(405, msg);
        }


        自定义Servlet
        class Servlet1 extends HttpServlet{
            protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
                //接受用户请求信息

                //做出响应
            }
        }

            1.部分程序员推荐在servlet中重写do***方法处理请求，理用：在service方法中可能做了一些处理，如果我们直接重写service的话，父类中service方法处理
        的功能则失效。
            2.目前直接重写service也没有什么问题
            3.后续使用了SpringMVC框架后，我们则无需继承HttpServlet，处理请求的方法也无需是do***  service
            4.如果doGet和doPost方法中，我们定义的代码都一样，可以让一个方法直接调用另一个方法



 */
@WebServlet("/servletLifeCycle")
public class ServletLifeCycle extends HttpServlet {

    public ServletLifeCycle() {
        System.out.println("构造器");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("初始化");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("服务");
    }

    @Override
    public void destroy() {
        System.out.println("摧毁");
    }
}
