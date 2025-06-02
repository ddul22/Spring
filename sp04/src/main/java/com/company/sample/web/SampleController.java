package com.company.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.company.sample.service.SampleService;

import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class SampleController {
	
	private SampleService sampleService;
	
	@GetMapping("/")
	 public String main() {
		sampleService.sample("");
		return "home";
	}
	
	@GetMapping({"/all","/member","/admin", "/accessError", "/login"})
	public void all(HttpServletRequest request) { 
		System.out.println(request.getRequestURI());
	}
}


