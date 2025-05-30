package com.yedam.board;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.yedam.board.mapper.ReplyMapper;
import com.yedam.board.service.ReplyVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration("file:src/main/resources/spring/*-context.xml")
public class ReplyMapperTest {

	@Setter(onMethod_ = @Autowired)
	private ReplyMapper replyMapper;
	
	@Test
	public void testList() {
		//Criteria cri = new Criteria();
		List<ReplyVO> replies = replyMapper.getList(null, 3L);
		replies.forEach(reply -> log.info(reply));
	}
	
	
}
