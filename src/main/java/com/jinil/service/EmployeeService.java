package com.jinil.service;

import java.util.List;

import com.jinil.model.Employee;

public interface EmployeeService {

	void addEmployee(Employee employee);

	Employee getEmployeeById(int id);

	public List<Employee> listEmployee();

	void removeEmployee(int id);

	Employee updateEmploye(Employee employee);
}
