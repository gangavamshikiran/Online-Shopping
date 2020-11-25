package com.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.demo.entities.Item;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface ItemRepository extends JpaRepository<Item, Long>{
	
}
