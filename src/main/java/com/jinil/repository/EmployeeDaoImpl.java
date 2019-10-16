package com.jinil.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jinil.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void addEmployee(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
	}

	public Employee getEmployeeById(int id) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	public List<Employee> listEmployee() {
		return sessionFactory.getCurrentSession().createQuery("from Employee").list();
	}

	public void removeEmployee(int id) {
		Employee emp = getEmployeeById(id);
		sessionFactory.getCurrentSession().delete(emp);
	}

	public Employee updateEmploye(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
		return employee;

	}

}
