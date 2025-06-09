package com.example.demo.entity.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.CustomerRepository;

@Controller
public class CustController {

	@Autowired
	CustomerRepository dao;

	@GetMapping("/custList")
	public	String	custList(Model	model){
				model.addAttribute("custList",	dao.findAll());
				return	"cust";
	}
}
