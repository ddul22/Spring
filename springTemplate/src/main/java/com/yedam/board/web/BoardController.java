package com.yedam.board.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.yedam.board.service.BoardService;
import com.yedam.board.service.BoardVO;

import lombok.RequiredArgsConstructor;
/**
 * 작성일자    작성자    수정내용
 * 20250525  홍길동    최초작성
 * 20250535  홍길동    페이징   
 * 
 */
@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

	final BoardService boardService;
	
	/**
	 * 게시글조회
	 * @param model
	 * @param board 검색조건
	 * @return 목록페이지명
	 */
	@GetMapping("/list")
	public String getMehodName(Model model, BoardVO board) {
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
	
	//단건조회
	@GetMapping("get")
	public String get(@RequestParam("bno") Long bno, Model model) {
		model.addAttribute("board", boardService.read(bno));
		return "board/get";
	}
	
	//수정페이지로 이동
	@GetMapping("/modify")
	public void modify(@RequestParam("bno") Long bno, Model model) {
		model.addAttribute("board", boardService.read(bno));
	}
	
	//수정처리
	@PostMapping("modify")
	public String modify(BoardVO board, RedirectAttributes rttr) {
		boardService.update(board);
		//return "redirect:list";
		rttr.addAttribute("bno", board.getBno());
		return "redirect:get";
	}
	
	//삭제처리
	@PostMapping("remove")
	public String remove(@RequestParam("bno") Long bno){
		boardService.delete(bno);
		return "redirect:list";
	}
	
	
}
