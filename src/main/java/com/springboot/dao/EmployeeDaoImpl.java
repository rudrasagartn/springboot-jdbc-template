package com.springboot.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.model.Employee;

/**
 * @author rudrasagar.tn
 *
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> getEmployees() {
		return jdbcTemplate.query("select employee_id,employee_name,email,employee_salary from employee",
				new EmployeeRowMapper());
	}

	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(
				"select employee_id,employee_name,email,employee_salary from employee where employee_id=" + id,
				new EmployeeRowMapper());
	}

}
