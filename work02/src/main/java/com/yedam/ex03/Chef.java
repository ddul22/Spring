package com.yedam.ex03;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Chef {
	public void cook() {
		System.out.println("cook");
	}
}
