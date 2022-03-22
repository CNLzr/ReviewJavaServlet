package lzr.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ContextServlet2 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext servletContext = getServletContext();
        System.out.println("保存之前：Context2获取key1的值"+servletContext.getAttribute("key1"));
        servletContext.setAttribute("key1","value1");
        System.out.println("保存之后：Context2获取key1的值"+servletContext.getAttribute("key1"));
        System.out.println("保存之后：Context2获取key1的值"+servletContext.getAttribute("key1"));
        System.out.println("保存之后：Context2获取key1的值"+servletContext.getAttribute("key1"));
    }
}
