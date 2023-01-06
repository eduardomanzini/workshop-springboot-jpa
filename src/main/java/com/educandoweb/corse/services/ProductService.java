package com.educandoweb.corse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.corse.entities.Product;
import com.educandoweb.corse.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findall() {
		return repository.findAll();
	}
	
	public Product findById(long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
	
}
