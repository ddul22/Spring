package com.yedam.sample.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.company.sample.service.SampleTxService;

import lombok.Setter;

@ExtendWith(SpringExtension.class) 
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class SampleTxServiceTest {

	@Autowired
	private SampleTxService sampleTxService;
	
	@Test
	public void tets() {
		sampleTxService.addData("12312312312312312312");
	}
	
}
