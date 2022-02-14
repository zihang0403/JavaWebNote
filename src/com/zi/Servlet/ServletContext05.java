package com.zi.Servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * ServletContext 类是一个接口，表示Servlet上下文对象.<br>
 * 一个web工程只有一个ServletContext对象实例，web项目启动时创建，停止时销毁.<br>
 * ServletContext只是一个域对象.<br>
 * <p></p>
 * * * 域对象是可以像map一样存取数据的对象，域指可以存取数据的操作范围<br>
 *      * 域指存取数据的操作范围，是整个工程<br>
 *      *  *<br>
 *      *  * 数据类型      存数据             取数据             删除数据<br>
 *      *  * map          put()             get()             remove()<br>
 *      *  * 域对象        setAttribute()     getAttribute()   removeAttribute()<br>
 *      <p></p>
 *       * ServletContext类的四个作用：<br>
 *      * 1.获取web.xml中配置的上下文参数context-param<br>
 *      * 2.获取当前的工程路径，格式：/工程路径<br>
 *      * 3.获取工程部署后在服务器硬盘上的绝对路径<br>
 *      * 4.像map一样存取数据<br>
 *
 */
public class ServletContext05 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
        System.out.println("doget方法");

        //通过ServletConfig获取ServletContext
        ServletContext context = getServletConfig().getServletContext();
        //获取contextname对应的value值
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("username02");

//        获取当前的工程路径，格式：/工程路径
//        当前工程路径/java_web_war_exploded
        System.out.println("当前工程路径"+context.getContextPath());

//        获取工程部署后在服务器硬盘上的绝对路径
//        工程部署的路径D:\ProgramTools\Codefile\note\java web笔记\out\artifacts\java_web_war_exploded\
        System.out.println("工程部署的路径"+context.getRealPath("/"));

//        获取ServletContext对象
        ServletContext context1 = getServletContext();
//        存取数据
        context1.setAttribute("key1","value1");
//       获取数据，一次存取，永久获取，其他工程也可以获取
        System.out.println("Context1中获取域数据key1的值是："+context1.getAttribute("key1"));

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
        System.out.println("dopost方法");

    }
}
