package com.lzr.servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloServlet2 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println(config);
    }

    /**
     * doGet()方法在get请求的时候调用
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet2的doGet方法");
    }

    /**
     * doPost()方法在post请求的时候调用
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("HelloServlet2的doPost方法");
        ServletConfig servletConfig = getServletConfig();
        // 下面打印会输出null，因在web.xml文件里面没有给这个Servlet设置servlet
        System.out.println("初始化参数url的值是："+servletConfig.getInitParameter("url"));
        System.out.println("初始化参数username的值是："+servletConfig.getInitParameter("username"));

    }
}
