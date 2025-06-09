package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;

@Repository
public interface CustomerRepository 
	extends JpaRepository<Customer, Long> {
	List<Customer> findByNameLike(String name);
	List<Customer> findByName(String name);
	List<Customer> findByNameOrPhone(String name, String phone);
	List<Customer> findByOrderByPhoneDesc();
}

