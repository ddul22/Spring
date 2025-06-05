package com.yedam.app.service.impl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yedam.app.mapper.TimeMapper;
import com.yedam.app.service.TimeService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TimeServiceImpl implements TimeService{

	private final TimeMapper timeMapper;

	@Override
	public String getTime() {
		// TODO Auto-generated method stub
		return timeMapper.getTime();
	}
	@Transactional
	@Override
	public String getTime2() {
		// TODO Auto-generated method stub
		return timeMapper.getTime2();
	}
	

}
