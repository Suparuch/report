package com.nec.doc.services;

import com.nec.doc.entities.Product;

import java.util.List;
import java.util.Map;

public interface ProductService {

    public Iterable<Product> findAll();

    public Product find(int id);

    public List<Map<String, Object>> report();

}
