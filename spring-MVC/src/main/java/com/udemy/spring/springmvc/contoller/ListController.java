package com.udemy.spring.springmvc.contoller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.spring.springmvc.dto.Employee;

@Controller
public class ListController {

	@RequestMapping("/readList")
	public ModelAndView sendList() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("displayList");

		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Prince");
		employee.setSalary(100000);

		Employee employee2 = new Employee();
		employee2.setId(1);
		employee2.setName("Winay");
		employee2.setSalary(100000);

		Employee employee3 = new Employee();
		employee3.setId(1);
		employee3.setName("vinay");
		employee3.setSalary(100000);

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);

		modelAndView.addObject("employees", employees);

		return modelAndView;

	}
}
