package com.springboot.dao;

import java.util.List;

import com.springboot.model.Employee;

/**
 * @author rudrasagar.tn
 *
 */
public interface EmployeeDao {

	public List<Employee> getEmployees();

	public Employee getEmployeeById(Long id);
}
