package com.company.sample.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.sample.mapper.BoardMapper;
import com.company.sample.service.BoardService;
import com.company.sample.service.BoardVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	final BoardMapper boardMapper;
	
	@Override
	public List<BoardVO> getList() {
		return boardMapper.getList();
	}
	
	@Override
	public int register(BoardVO vo) {
		return boardMapper.register(vo);
	}
}
