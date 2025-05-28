package com.yedam.board.mapper;

import java.util.List;

import com.yedam.board.service.BoardVO;

public interface BoardMapper {

	public List<BoardVO> getList();
	public BoardVO read(long bno);
	public int delete(Long bno);
	public int insert(BoardVO vo);
	public int update(BoardVO board);
}
