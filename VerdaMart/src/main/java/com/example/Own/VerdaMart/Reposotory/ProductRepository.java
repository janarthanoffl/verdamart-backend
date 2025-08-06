package com.example.Own.VerdaMart.Reposotory;

import com.example.Own.VerdaMart.model.product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<product,Long> {

    Optional<product> findByName(String name);

}
