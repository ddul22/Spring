package com.yedam.board.service;

import java.util.List;
import com.yedam.board.service.Criteria;

public interface BoardService {
	
	public List<BoardVO> getList(Criteria cri);
	public BoardVO read(long l);
	public int delete(Long bno);
	public int insert(BoardVO vo);
	public int update(BoardVO board);
	public Long getTotal(Criteria cri);
}
