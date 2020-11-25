package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.demo.entities.Supplier;

@RepositoryRestResource
public interface SupplierRepository extends JpaRepository<Supplier, String>{

}
