package com.yedam.ex03;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Component
public class Restaurant {
	
	final private Chef chef;

}
