package com.example.webthymeleaf.service;

import java.util.List;


import com.example.webthymeleaf.entity.Employee;
public interface EmployeeService {

	public List<Employee> findAll();
	public void save(Employee emp);
	public Employee findById(Integer id);
	public void deleteById(Integer id);
	
}