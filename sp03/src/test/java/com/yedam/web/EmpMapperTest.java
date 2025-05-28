package com.yedam.web;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yedam.web.mapper.EmpMapper;
import com.yedam.web.model.Employees;
import com.yedam.web.model.SearchVO;

import jdk.internal.org.jline.utils.Log;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/spring/datasource-context.xml",
					   "classpath:/spring/mybatis-context.xml"})
public class EmpMapperTest {

	@Autowired EmpMapper empMapper;
	
	@Test
	public void findEmployeeDepartment() {
		List<Employees> list = empMapper.findEmployeeDepartment();
		list.forEach(emp -> Log.info(emp.getFirstName()
									+ ":"
									+emp.getDepartment().getDepartmentName()));
	}
	
	//@Test
	public void 전체조회() {
		SearchVO searchVO = new SearchVO();
		searchVO.setDepartmentId("30");
		searchVO.setSalary("2600");
		searchVO.setIds(Arrays.asList(100,101,102));
		empMapper.findAll(searchVO).forEach(emp->
		System.out.println(emp.getEmployeeId() + ":"
						 + emp.getFirstName() ));
	}
	
	//@Test
	void findAlltoMap() {
		empMapper.findAlltoMap().forEach(emp->
					System.out.println(emp.get("first_name")));
	}
	
	//@Test
	public void getCount() {
		List<Employees> result = empMapper.getCount();
		System.out.println(result);
		result.forEach( emp ->
					System.out.println(emp.getCnt()));
	}
	
	//@Test
	public void insert() {
		Employees employee = Employees.builder()
				.departmentId("30")
				.build();
		int result = empMapper.insert(employee);
		System.out.println(result);
	}
	
	//@Test
	public void update() {
		Employees employee = new Employees();
		employee.setEmployeeId("300");
		employee.setFirstName("길동");
		int result = empMapper.updateFirstName(employee);
		System.out.println(result);
	}
	
	//@Test
	public void delete() {
		int result = empMapper.delete(300);
		System.out.println(result);
	}
}
