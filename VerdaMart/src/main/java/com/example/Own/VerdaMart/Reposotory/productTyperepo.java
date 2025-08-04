package com.example.Own.VerdaMart.Reposotory;

import com.example.Own.VerdaMart.model.ProductType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productTyperepo extends JpaRepository<ProductType, Long> {
    // Define any custom query methods if needed
    // For example, you can add methods to find product types by name or other attributes
}
