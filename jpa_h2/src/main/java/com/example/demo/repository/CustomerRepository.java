package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;

@Repository  //==mapper 인터페이스   //@Controller @Service
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
