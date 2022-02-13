package com.zi.Servlet;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * ServletConfig类是Servlet程序的信息配置类
 * ServletConfig 类的三大作用：
 * 1.可以获取Servlet程序的别名Servlet-name的值
 * 2.获取初始化参数init-param
 * 3.获取ServletContext对象
 *
 * Servlet程序和ServletConfig对象都是由Tomcat负责创建
 * Servlet程序默认是第一次访问的时候创建，ServletConfig是每个Servlet程序创建时，就创建一个对应的ServletConfig对象
 */
public class ServletConfig04 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
//        1.可以获取Servlet程序的别名Servlet-name的值
        System.out.println("ServletConfig04 程序的别名是"+servletConfig.getServletName());
//        2.获取初始化参数init-param
        System.out.println("初始化参数username的值是："+servletConfig.getInitParameter("username"));
//        3.获取ServletContext对象
        System.out.println(servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
