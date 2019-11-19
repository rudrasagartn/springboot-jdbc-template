package com.springboot.service;

import java.util.List;

import com.springboot.model.Employee;

/**
 * @author rudrasagar.tn
 *
 */
public interface EmployeeService {

	public List<Employee> getEmployees();

	public Employee getEmployeeById(Long id);

}
