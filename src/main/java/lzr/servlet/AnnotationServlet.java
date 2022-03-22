package lzr.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/abc",initParams = {
        @WebInitParam(name = "ENCODING",value="UTF-8")
})
public class AnnotationServlet extends HttpServlet {
    public AnnotationServlet() {
        System.out.println("Servlet被初始化了");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("被请求了");
    }
}
