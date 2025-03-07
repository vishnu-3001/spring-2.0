package com.vishnu.ecommproject2.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vishnu.ecommproject2.Model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    
}
