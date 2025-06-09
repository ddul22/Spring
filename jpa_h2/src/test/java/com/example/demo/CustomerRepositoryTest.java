package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entity.Customer;
import com.example.demo.repository.CustomerRepository;

@SpringBootTest
public class CustomerRepositoryTest {

	@Autowired CustomerRepository customerRepository;
	
	@Test
	public void 등록() {
		//given
		Customer cust = Customer.builder()
								.name("홍길동")
								.phone("011").build();
		customerRepository.save(cust);
		//when
		Optional<Customer> result = customerRepository.findById(1L);
		assertEquals(result.get().getName(), "홍길동");
		//then
	}
}
