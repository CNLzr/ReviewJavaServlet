import lzr.entity.Category;
import lzr.service.CategoryService;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        CategoryService categoryService = new CategoryService();
        List<Category> allCategory = categoryService.getAllCategory();
        System.out.println(allCategory);
    }
}
