package com.lzr.servlet;

import com.lzr.entity.Category;
import com.lzr.service.CategoryService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class HelloServletWoniu2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuffer bufferedReader = request.getRequestURL();
        System.out.println(bufferedReader);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();
        String str = "<table border=\"\" cellspacing=\"\" cellpadding=\"\">" +
                "<tr>" +
                "<td>学员编号</td>" +
                "<td>姓名</td>" +
                "<td>邮箱</td>" +
                "</tr>" +
                "<tr>" +
                "<td>1</td>" +
                "<td>张三</td>" +
                "<td>zhangsan@163.com</td>" +
                "</tr>" +
                "<tr>" +
                "<td>2</td>" +
                "<td>李四</td>" +
                "<td>lisi@163.com</td>" +
                "</tr>" +
                "</table>";
        printWriter.println(str);
        printWriter.close();
        System.out.println(1);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request,response);

    }
}
