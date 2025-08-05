package com.example.Own.VerdaMart.Reposotory;

import com.example.Own.VerdaMart.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface categoryrepository extends JpaRepository<Category, Long> {
    Optional<Category> findByName(String name);
    //    // Defin any custom query methods if needed
    // For example, you can add methods to find categories by name or other attributes
}
