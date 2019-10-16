package com.jinil.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jinil.model.Employee;
import com.jinil.repository.EmployeeDao;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeedao;

	@Transactional
	public void addEmployee(Employee employee) {
		employeedao.addEmployee(employee);
	}

	@Transactional
	public Employee getEmployeeById(int id) {
		return employeedao.getEmployeeById(id);
	}

	@Transactional
	public List<Employee> listEmployee() {
		return employeedao.listEmployee();
	}

	@Transactional
	public void removeEmployee(int id) {
		employeedao.removeEmployee(id);

	}

	@Transactional
	public Employee updateEmploye(Employee employee) {
		return employeedao.updateEmploye(employee);

	}

}
