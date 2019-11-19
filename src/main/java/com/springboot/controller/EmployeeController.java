package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;
import com.springboot.service.EmployeeService;

/**
 * @author rudrasagar.tn
 *
 */
@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/get/employees")
	public List<Employee> getEmployees() {
		List<Employee> emps = employeeService.getEmployees();
		return emps;
	}
	
	@RequestMapping(value="/get/employee/{id}")
	public Employee getEmployeeById(@PathVariable ("id") String id) {
		return employeeService.getEmployeeById(new Long(id));
	}

}
