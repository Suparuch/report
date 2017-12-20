package com.nec.doc.repositories;

import com.nec.doc.entities.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository 
	extends CrudRepository<Product, Integer> {
}
