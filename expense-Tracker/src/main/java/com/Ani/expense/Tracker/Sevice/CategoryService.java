package com.Ani.expense.Tracker.Sevice;

import com.Ani.expense.Tracker.Entity.Category;
import com.Ani.expense.Tracker.Repository.CategoryRepository;
import com.Ani.expense.Tracker.Repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;


    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }


}
