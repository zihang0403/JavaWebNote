package com.zi.Servlet;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;

/**
 * Servlet类的继承体系
 * interface Servlet            Servlet接口，只负责定义Servlet程序的接口规范
 * class GenericServlet         实现Servlet接口，定义了很多空的实现，并持有一个ServletConfig类的引用，并对ServletConfig的使用做一些方法
 * class HttpServlet            继承GenericServlet类，实现了很多service方法，并实现了请求的分发处理
 * 自定义Servlet程序              继承HttpServlet类，根据需要重写doget或dopost方法即可
 */

public class ServletExtends03 extends HttpServlet {
}
