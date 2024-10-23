package com.manikanta.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manikanta.www.model.Products;

public interface ProductRepository extends JpaRepository<Products,Long>{

}
