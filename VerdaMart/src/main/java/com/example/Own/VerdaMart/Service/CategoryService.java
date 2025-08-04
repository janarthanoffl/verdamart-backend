package com.example.Own.VerdaMart.Service;


import com.example.Own.VerdaMart.Reposotory.categoryrepository;
import com.example.Own.VerdaMart.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {



    @Autowired
    categoryrepository categoryrepository;

    public void addCategory( Category category) {
        categoryrepository.save(category);
        // Logic to add a category would go here
        // For now, we just print the category name


    }

    public List<Category> getallCategories() {
        return categoryrepository.findAll();
    }

    public String deleteCategory(Long id) {
        if (categoryrepository.existsById(id)) {
            categoryrepository.deleteById(id);
            return "Category deleted successfully";
        } else {
            return "Category not found";
        }
    }
}
