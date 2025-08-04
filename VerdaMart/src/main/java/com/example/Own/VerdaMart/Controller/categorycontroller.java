package com.example.Own.VerdaMart.Controller;


import com.example.Own.VerdaMart.Reposotory.categoryrepository;
import com.example.Own.VerdaMart.Service.CategoryService;
import com.example.Own.VerdaMart.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
