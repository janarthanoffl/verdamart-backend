package com.example.Own.VerdaMart.Reposotory;

import com.example.Own.VerdaMart.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<product,String> {

}
