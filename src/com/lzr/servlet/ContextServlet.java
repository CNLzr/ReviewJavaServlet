package com.lzr.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        1. 获取web.xml中配置的上下文参数 context-param
//        ContextServlet contextServlet = new ContextServlet();
//        System.out.println(contextServlet);
//        2. 获取当前的工程路径，格式：/工程路径
//        3. 获取工程部署后在服务器硬盘上的绝对路径

    }
}
