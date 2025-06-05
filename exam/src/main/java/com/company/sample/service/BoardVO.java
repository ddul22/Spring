package com.company.sample.service;

import java.util.Date;

import lombok.Data;
@Data
public class BoardVO {
	private Long book_no;
	private String book_name;
	private String book_coverimg;
	private Date book_date;
	private int book_price;
	private String book_publisher;
	private String book_info;
}
