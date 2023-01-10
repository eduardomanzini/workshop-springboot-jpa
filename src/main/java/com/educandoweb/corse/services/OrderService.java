package com.educandoweb.corse.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.corse.entities.Order;

import com.educandoweb.corse.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findall() {
		return repository.findAll();
	}
	
	public Order findById(long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
