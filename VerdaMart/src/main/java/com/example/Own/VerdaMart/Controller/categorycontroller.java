package com.example.Own.VerdaMart.Controller;


import com.example.Own.VerdaMart.Reposotory.categoryrepository;
import com.example.Own.VerdaMart.Service.CategoryService;
import com.example.Own.VerdaMart.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/api")
public class categorycontroller {

    @Autowired
    private categoryrepository categoryrepository;

    @Autowired
    private CategoryService categoryservice;



    @PostMapping("/category/add")
    public String addCategory(@RequestBody Category category) {
        // Logic to add a category would go here
        // For now, we return a success message
        categoryservice.addCategory(category);
        return "Category added successfully";

    }

    @GetMapping("/category/all")
    public List<Category> getAllCategories() {
        return categoryservice.getallCategories();
    }

@GetMapping("/category/find/{name}")
public Category findCategory(@PathVariable String name) {
        return categoryservice.getName(name);
}
    @DeleteMapping("/category/delete/{id}")
    public String deleteCategory(@PathVariable Long id) {
        return categoryservice.deleteCategory(id);
    }
}
