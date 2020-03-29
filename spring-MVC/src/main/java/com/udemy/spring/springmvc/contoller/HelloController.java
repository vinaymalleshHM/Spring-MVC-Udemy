package com.udemy.spring.springmvc.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public ModelAndView hello() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("hello");

		// controller to UI
		modelAndView.addObject("id", 123);
		modelAndView.addObject("name", "Prince");
		modelAndView.addObject("salary", 100000);
		return modelAndView;

	}

}
