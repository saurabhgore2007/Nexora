package com.nexora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nexora.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
