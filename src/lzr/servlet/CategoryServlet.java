package lzr.servlet;

import lzr.entity.Category;
import lzr.service.CategoryService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class CategoryServlet extends HttpServlet {
    private CategoryService categoryService = new CategoryService();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(1);
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter printWriter = response.getWriter();
        List<Category> allCategory = categoryService.getAllCategory();
        String category_str = "";
        for(Category category:allCategory){
            category_str += "<tr>" +
                    "<td>"+category.getId()+"</td>" +
                    "<td>"+category.getName()+"</td>"+
                    "</tr>";
        }
        String table = "<table border='1px' cellspacing='' cellpadding=''>"+category_str+"</table>";
        printWriter.println(table);
        printWriter.close();
    }
}
