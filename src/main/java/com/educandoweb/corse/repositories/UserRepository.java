package com.educandoweb.corse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.corse.entities.User;


public interface UserRepository extends JpaRepository<User, Long> {

	
}
