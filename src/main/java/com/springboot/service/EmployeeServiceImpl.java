package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.EmployeeDao;
import com.springboot.model.Employee;

/**
 * @author rudrasagar.tn
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao employeeDao;

	@Override
	public List<Employee> getEmployees() {
		return employeeDao.getEmployees();
	}
	
	@Override
	public Employee getEmployeeById(Long id) {
		return employeeDao.getEmployeeById(id);
	}

}
