package com.yedam.app.di;

import org.springframework.context.annotation.Bean;

//자바기반설정
public class ContextConfigure {

	@Bean
	public Speaker speaker() {
		return new AppleSpeaker();
	}
	@Bean
	public TV tv() {
		LgTV tv = new LgTV(speaker());
		//tv.setSpeaker(speaker());
		return tv;
	}
}
