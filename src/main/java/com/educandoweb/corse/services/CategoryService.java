package com.educandoweb.corse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.corse.entities.Category;
import com.educandoweb.corse.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findall() {
		return repository.findAll();
	}
	
	public Category findById(long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
	
}
