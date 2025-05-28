package com.yedam.web.mapper;

import java.util.List;
import java.util.Map;

import com.yedam.web.model.Employees;
import com.yedam.web.model.SearchVO;

public interface EmpMapper {

	List<Employees> findEmployeeDepartment();
	List<Employees> findAll(SearchVO search);
	List<Map> findAlltoMap();//key value
	List<Employees> getCount();
	int insert(Employees employees);
	int updateFirstName(Employees employees);
	int delete(int employeeId);
}
