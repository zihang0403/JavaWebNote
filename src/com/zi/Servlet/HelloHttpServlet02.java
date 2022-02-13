package com.zi.Servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 一般项目开发中都是使用继承HttpServlet类的方式去实现Servlet程序
 * 1.编写一个类去继承HttpServlet类
 * 2.根据业务需要重写doGet或doPost方法
 * 3.到web.xml中配置Servlet程序的访问地址
 */
public class HelloHttpServlet02 extends HttpServlet {

    /**
     * 在get请求的时候调用
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("doget方法");
    }

    /**
     * 在post请求的时候调用
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("dopost方法");
    }
}
