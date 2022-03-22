package lzr.servlet;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class HelloServlet implements Servlet {
    public HelloServlet() {
        System.out.println("1. Servlet构造器方法.");
    }

    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("2. Servlet init初始化方法");
        // 1.可以获取Servlet程序的别名Servlet-name的值
        System.out.println("HelloServlet程序的别名是："+servletConfig.getServletName());
        // 2.获取初始化参数init-param
        System.out.println("初始化参数url的值是："+servletConfig.getInitParameter("url"));
        System.out.println("初始化参数username的值是："+servletConfig.getInitParameter("username"));
        // 3.获取ServletContext对象
        System.out.println("获取ServletContext对象："+servletConfig.getServletContext());
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**
     * Service方法是专门用来处理请求和响应的
     * */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("3. hello servlet 被访问了");
        // 类型转换 (因为它有getMethod()方法)
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        // 获取请求的方式
        String method = httpServletRequest.getMethod();
        System.out.println(method);
        if("GET".equals(method)){
            doGet();
        }else {
            doPost();
        }
    }

    /**
     * 做get请求的操作代码
     */
    public void doGet(){
        System.out.println("get请求正在操作业务");
    }

    /**
     * 做Post请求的操作代码
     *
     */
    public void doPost(){
        System.out.println("post请求正在操作业务1");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("4. destroy销毁方法");
    }
}
