package com.lzr.service;

import com.lzr.entity.Category;
import com.lzr.mapper.CategoryMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class CategoryService {
    private static CategoryMapper categoryMapper;
    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession sqlSession = factory.openSession();
            categoryMapper = sqlSession.getMapper(CategoryMapper.class);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public List<Category> getAllCategory(){
        return categoryMapper.getAll();
    }
}
