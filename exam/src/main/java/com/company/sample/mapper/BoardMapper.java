package com.company.sample.mapper;

import java.util.List;

import com.company.sample.service.BoardVO;

public interface BoardMapper {
	public List<BoardVO> getList();
	public int register(BoardVO vo);
}
