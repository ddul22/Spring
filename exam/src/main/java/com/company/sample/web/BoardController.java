package com.company.sample.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.company.sample.service.BoardService;
import com.company.sample.service.BoardVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/book")
@RequiredArgsConstructor
public class BoardController {
	
	final BoardService boardService;
	
	@GetMapping("/list")
	public void list(Model model) {
		
		model.addAttribute("list", boardService.getList());
	}
	
	@GetMapping("/register")
	public void register() {
		
	}
	
	@PostMapping("register")
	public String register(BoardVO vo) {
		boardService.register(vo);
		return "redirect:list";
	}
}
