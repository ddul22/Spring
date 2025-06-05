package com.yedam.app.web;


import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.yedam.app.service.TimeService;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Controller
public class SampleController {

	private final TimeService timeService;
	
	@GetMapping("/")
	@ResponseBody
	public String getTime() {
		return timeService.getTime();
	}
	
	@GetMapping("/home")
	@ResponseBody
	public String home() {
		return "home";
	}
	@GetMapping("/uploadForm")
	public String uploadForm() {
		return "uploadForm";
	}
	
	@PostMapping("/uploadFormAction")
	public String uploadFormAction(
			  @RequestParam("uploadFile") MultipartFile uploadFile) throws IllegalStateException, IOException {
		System.out.println(uploadFile.getSize());
		System.out.println(uploadFile.getOriginalFilename());
		
		uploadFile.transferTo(new File("c:/upload",uploadFile.getOriginalFilename()));
		return "uploadForm";
	}
}
