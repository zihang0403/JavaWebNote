package com.zi.Servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ServletContext 类是一个接口，表示Servlet上下文对象
 * 一个web工程只有一个ServletContext对象实例
 * ServletContext只是一个域对象
 */
public class ServletContext05 extends HttpServlet {
    /**
     * * 域对象是可以像map一样存取数据的对象，域指可以存取数据的操作范围
     *  *
     *  *              存数据             取数据             删除数据
     *  * map          put()             get()             remove()
     *  * 域对象        setAttribute()     getAttribute()   removeAttribute()
     */

    /**
     * ServletContext类的四个作用：
     * 1.获取web.xml中配置的上下文参数context-param
     * 2.获取当前的工程路径，格式：/工程路径
     * 3.获取工程部署后在服务器硬盘上的绝对路径
     * 4.像map一样存取数据
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        //通过ServletConfig获取ServletContext
        ServletContext context = getServletConfig().getServletContext();
        //获取contextname对应的value值
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("username02");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
