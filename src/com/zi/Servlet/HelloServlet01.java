package com.zi.Servlet;
//Servlet是JavaEE规范（接口）之一

//Servlet是Javaweb三大组件之一，三大组件包括：
//    Servlet程序
//    Filter过滤器
//    Listener监听器

//Servlet是运行在服务器上的一个Java小程序，它可以接收客户端发送过来的请求，并响应数据给客户端

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

//实现Servlet的步骤：
//    编写一个类实现Servlet接口
//    实现service方法，处理请求，并响应数据
//    到web.xml中去配置Servlet程序的访问地址
public class HelloServlet01 implements Servlet{
    /**
     *Sevlet的生命周期
     * 1.执行Servlet构造器方法，创建Servlet程序时调用一次
     * 2.执行init初始化方法，创建Servlet程序时调用一次
     * 3.执行service方法，创建Servlet程序时调用，且每次访问都会调用
     * 4.执行destroy销毁方法，停止web工程时才会调用
     */

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Servlet初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
        System.out.println("获取Servlet配置");
        return null;
    }

    /**
     * Service方法是专门用来处理请求和响应的
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("执行service方法");

        //类型转换（因为ServletRequest没有getMethod()方法，而HttpServletRequest类型有）
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

//        获取请求的方式
        String method = httpServletRequest.getMethod();
        System.out.println(method+"请求");

        doGet();
        doPost();
    }

    //做get请求的操作
    public void doGet(){

    }

    //做post请求的操作
    public void doPost(){

    }

    @Override
    public String getServletInfo() {
        System.out.println("获取Servlet信息");
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("执行Servlet销毁方法");
    }
}