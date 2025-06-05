package com.company.sample.service;

import java.util.List;

public interface BoardService {

	public List<BoardVO> getList();
	public int register(BoardVO vo);
}
