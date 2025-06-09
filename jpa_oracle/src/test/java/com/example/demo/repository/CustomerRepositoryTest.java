package com.example.demo.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.example.demo.entity.Customer;

import jakarta.transaction.Transactional;

@SpringBootTest
public class CustomerRepositoryTest {
	
	@Autowired CustomerRepository repo;
	
	@Transactional
	@Rollback
	@Test
	public void 검색() {
		repo.save(Customer.builder().userid("hong").name("홍길동").phone("011").build());
		repo.save(Customer.builder().userid("choi").name("최길동").phone("012").build());
		repo.save(Customer.builder().userid("na").name("나기자").phone("010").build());
		List<Customer>list = repo.findByNameOrPhone(" 홍길동","010");
		List<Customer>list2 = repo.findByOrderByPhoneDesc();
		//assertEquals(list.size(),0);
	}
	@Transactional
	@Rollback
	//@Test
	public void LIKE_검색() {
		repo.save(Customer.builder().userid("hong").name("홍길동").build());
		repo.save(Customer.builder().userid("choi").name("최길동").build());
		repo.save(Customer.builder().userid("na").name("나기자").build());
		List<Customer>list = repo.findByNameLike("%길동%");
		assertEquals(list.size(),2);
	}
}
