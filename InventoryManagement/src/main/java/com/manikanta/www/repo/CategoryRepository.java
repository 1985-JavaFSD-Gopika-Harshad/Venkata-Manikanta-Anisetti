package com.manikanta.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manikanta.www.model.Category;

public interface CategoryRepository extends JpaRepository<Category,Long>{

}
