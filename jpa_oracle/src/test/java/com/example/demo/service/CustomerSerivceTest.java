package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import jakarta.transaction.Transactional;

@SpringBootTest
public class CustomerSerivceTest {
	@Autowired
	CustomerService customerService;
	
	@Test
	public void 등록() {
		CustomerVO vo = new CustomerVO();
		vo.setUserid("scott");
		vo.setName("홍길동");
		int id = customerService.insert(vo);
		List<CustomerVO> list = customerService.findAll();
		assertEquals("홍길동", list.get(0).getName());
	}
	
	//@Test
	@Transactional
	@Rollback //@Commit
	public void 수정() {
		//단건조회
		CustomerVO vo = customerService.findById(1L);
		vo.setName("김유신");
		customerService.update(vo);
	}
	

}
