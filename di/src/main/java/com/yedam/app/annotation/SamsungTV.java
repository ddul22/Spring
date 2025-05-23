package com.yedam.app.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.scan.BoardService;

import lombok.AllArgsConstructor;
import lombok.Setter;

//2. 생성자 주입
//@RequireArgsConstructor
@Component("samTv")
public class SamsungTV implements TV {
    
	//1. 필드 주입 방법
	//@Autowired
	//3. setter 방식
	//@Setter(onMethod_ = {@Autowired} )
	private Speaker speaker; //NullPointError new
	private BoardService service;
	public void powerOn() {
		System.out.println("SamsungTV powerOn");
	}

	public void powerOff() {
		System.out.println("SamsungTV powerOff");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}

	public void volumeDown() {
		speaker.volumeDown();
	}
}
