package com.yedam.board.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardVO;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

	final BoardService boardService;
	
	@GetMapping("/list")
	public String getMehodName(Model model) {
		model.addAttribute("list", boardService.getList());
		return "board/list";
	}
	
	//등록 페이지로 이동
	@GetMapping("/register")
	public void register() {
	}
	
	//등록 처리하고 목록으로 이동
	@PostMapping("register")
	public String register(BoardVO vo) {
		boardService.insert(vo);
		return "redirect:list";
	}
	
	@GetMapping("/")
	public void get(@RequestParam("bno") int bno, Model model) {
		
	}
}
