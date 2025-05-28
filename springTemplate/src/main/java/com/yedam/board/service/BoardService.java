package com.yedam.board.service;

import java.util.List;

public interface BoardService {
	
	public List<BoardVO> getList();
	public BoardVO read(long l);
	public int delete(Long bno);
	public int insert(BoardVO vo);
	public int update(BoardVO board);
}
