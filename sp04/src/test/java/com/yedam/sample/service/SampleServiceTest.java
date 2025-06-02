package com.yedam.sample.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.company.sample.service.SampleService;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;
@Log4j2
@ExtendWith(SpringExtension.class) 
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")

public class SampleServiceTest {

	@Setter(onMethod_= {@Autowired})
	private SampleService sampleService;
	
	@Test
	public void test() {
		sampleService.sample("홍길동");
	}
	
}
