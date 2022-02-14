package com.zi.Servlet;

/**
 * &nbsp Http协议介绍：
 * 客户端和服务器之间通信时发送的数据，需要遵守的规则就是http协议
 *<br>
 * &nbsp http协议中的数据又叫报文
 * <br>
 * &nbsp 客户端给服务器发送数据叫请求，服务器给客户端回传数据叫响应<br>
 * &nbsp 请求分为get请求和post请求<br>
 * <br>
 * &nbsp get请求：<br>
 * &nbsp 1.请求行<br>
 * &nbsp &nbsp &nbsp 请求的方式：get<br>
 * &nbsp &nbsp &nbsp 请求的资源路径[+?+请求参数]<br>
 * &nbsp &nbsp &nbsp 请求的协议的版本号：HTTP/1.1<br>
 * &nbsp 2.请求头<br>
 * &nbsp &nbsp &nbsp key：value 组成，不同的键值对表示不同的含义&nbsp <br>
 * &nbsp &nbsp &nbsp Accept:告诉服务器，客户端可以接收的数据类型&nbsp <br>
 * &nbsp &nbsp &nbsp Accept-Language:告诉服务器，客户端可以接收的语言类型&nbsp <br>
 * &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp zh_CN&nbsp &nbsp &nbsp 中文中国<br>
 * &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp en_US&nbsp &nbsp &nbsp 英文美国<br>
 * &nbsp &nbsp &nbsp User-Agent:就是浏览器的信息&nbsp <br>
 * &nbsp &nbsp &nbsp Accept-Encoding:告诉服务器，客户端可以接收的数据层编码(压缩)格式<br>
 * &nbsp &nbsp &nbsp Host:表示请求的服务器ip和端口号<br>
 * &nbsp &nbsp &nbsp Connection:告诉服务器请求连接如何处理<br>
 * &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp Keep-Alive&nbsp &nbsp &nbsp 告诉服务器回传数据不要马上关闭，保持一小段时间的连接<br>
 * &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp Closed&nbsp &nbsp &nbsp 马上关闭<br>
 * <br>
 * &nbsp post请求：<br>
 * &nbsp 1.请求行<br>
 * &nbsp &nbsp &nbsp 请求的方式：post<br>
 * &nbsp &nbsp &nbsp 请求的资源路径[+?+请求参数]<br>
 * &nbsp &nbsp &nbsp 请求的协议的版本号：HTTP/1.1<br>
 * &nbsp 2.请求头<br>
 * &nbsp &nbsp &nbsp key：value 组成，不同的键值对表示不同的含义&nbsp <br>
 * &nbsp &nbsp &nbsp Accept:告诉服务器，客户端可以接收的数据类型&nbsp <br>
 * &nbsp &nbsp &nbsp Referer:表示请求发起时，浏览器地址栏中的地址（从哪来）<br>
 * &nbsp &nbsp &nbsp Accept-Language:告诉服务器，客户端可以接收的语言类型&nbsp <br>
 * &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp zh_CN&nbsp &nbsp &nbsp 中文中国<br>
 * &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp en_US&nbsp &nbsp &nbsp 英文美国<br>
 * &nbsp &nbsp &nbsp User-Agent:就是浏览器的信息&nbsp <br>
 * &nbsp &nbsp &nbsp Content-Type:表示发送的数据的类型<br>
 * &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp application/x-www-form-urlencoded&nbsp &nbsp &nbsp 表示提交的数据格式是：name=value&name=value，然后对其进行url编码<br>
 * &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp url编码是把非英文内容转换为：%xx%xx<br>
 * &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp multipart/form-data&nbsp &nbsp &nbsp 表示以多段的形式提交数据给服务器（以流的形式提交，用于上传）<br>
 * &nbsp &nbsp &nbsp Accept-Encoding:告诉服务器，客户端可以接收的数据层编码(压缩)格式<br>
 * &nbsp &nbsp &nbsp Host:表示请求的服务器ip和端口号<br>
 * &nbsp &nbsp &nbsp Content-Length:表示发送的数据的长度<br>
 * &nbsp &nbsp &nbsp Connection:告诉服务器请求连接如何处理<br>
 * &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp Keep-Alive&nbsp &nbsp &nbsp 告诉服务器回传数据不要马上关闭，保持一小段时间的连接<br>
 * &nbsp &nbsp &nbsp &nbsp &nbsp &nbsp Closed&nbsp &nbsp &nbsp 马上关闭<br>
 * &nbsp &nbsp &nbsp Cache-Control:表示如何控制缓存，no-cache就是不缓存<br>
 * &nbsp 3.空行<br>
 * &nbsp 4.请求体：就是发送给服务器的数据<br>
 */
public class Http06 {
}
