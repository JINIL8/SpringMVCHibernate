package com.jinil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jinil.model.Employee;
import com.jinil.service.EmployeeService;

@Controller
public class MainController {

	@Autowired
	private EmployeeService employeeservice;

	@RequestMapping(value = "/deleteEmployee", method = RequestMethod.GET)
	public String deleteeEmployee(@RequestParam("did") int id) {
		employeeservice.removeEmployee(id);
		return "redirect:/listEmployee";
	}

	@RequestMapping(value = "/editEmployee", method = RequestMethod.GET)
	public String editEmployee(@RequestParam("id") int id, Model model) {
		Employee employees = employeeservice.getEmployeeById(id);
		model.addAttribute("employee", employees);
		List<Employee> employee = employeeservice.listEmployee();
		model.addAttribute("employees", employee);
		return "employeeform";
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String employee(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		List<Employee> employees = employeeservice.listEmployee();
		model.addAttribute("employees", employees);
		return "employeeform";
	}

	@RequestMapping(value = "/listEmployee", method = RequestMethod.GET)
	public String listEmployee(Model model) {
		List<Employee> employee = employeeservice.listEmployee();
		model.addAttribute("employees", employee);
		System.out.println(employee);
		return "employeelist";
	}

	@RequestMapping(value = "/saveEmployee", method = RequestMethod.POST)
	public String saveEmployee(@ModelAttribute("employee") Employee employee) {
		if (employee.getId() == 0) {
			employeeservice.addEmployee(employee);
		} else {
			employeeservice.updateEmploye(employee);
		}
		// System.out.println(employee.toString());
		return "redirect:/";
	}
}
