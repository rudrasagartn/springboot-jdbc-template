package com.springboot.model;

/**
 * @author rudrasagar.tn
 *
 */
public class Employee {

	private Long id;
	private String employee_name;
	private String employee_email;
	private Double employee_salary;

	public Employee(Long id, String employee_name, String employee_email, Double employee_salary) {
		super();
		this.id = id;
		this.employee_name = employee_name;
		this.employee_email = employee_email;
		this.employee_salary = employee_salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployee_name() {
		return employee_name;
	}

	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_email() {
		return employee_email;
	}

	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}

	public Double getEmployee_salary() {
		return employee_salary;
	}

	public void setEmployee_salary(Double employee_salary) {
		this.employee_salary = employee_salary;
	}

}
