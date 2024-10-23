package com.manikanta.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manikanta.www.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier,Long> {

}
