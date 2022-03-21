package com.lzr.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 获取web.xml中配置的上下文参数context-param,获取ServletContext对象
        ServletContext servletContext = getServletConfig().getServletContext();
        System.out.println(servletContext.getInitParameter("username"));
        System.out.println(servletContext.getInitParameter("password"));
        //2. 获取当前的工程路径，格式：/工程路径
        System.out.println("当前工程路径："+servletContext.getContextPath());
        //3. 获取工程部署后在服务器硬盘上的绝对路径
        //斜杠被服务器解析地址为：http://ip:port/工程名/
        System.out.println("工程部署的路径："+servletContext.getRealPath("/"));
        System.out.println("工程下img目录的路径："+servletContext.getRealPath("/img"));
        System.out.println("工程下img目录下的Elden.png的路径："+servletContext.getRealPath("/img/Elden.png"));
    }
}
