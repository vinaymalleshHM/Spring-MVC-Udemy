package com.udemy.spring.springmvc.contoller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.udemy.spring.springmvc.dto.User;

@Controller
public class UserController {

	//	@RequestMapping("registrationPage")
	//	public ModelAndView showRegistrationPage() {
	//		ModelAndView modelAndView = new ModelAndView();
	//		modelAndView.setViewName("userReg");
	//		return modelAndView;
	//
	//	}
	//	
	//	
	//	@RequestMapping(value = "registerUser",method = RequestMethod.POST)
	//	public ModelAndView registerUser(@ModelAttribute("user") User user) {
	//		System.out.println("user : " + user);
	//		ModelAndView modelAndView = new ModelAndView();
	////		modelAndView.setViewName("userReg");
	//		modelAndView.addObject("user", user);
	//		modelAndView.setViewName("regResult");
	//		return modelAndView;
	//
	//	}

	@RequestMapping("registrationPage")
	public String showRegistrationPage() {
		return "userReg";
	}


	@RequestMapping(value = "registerUser",method = RequestMethod.POST)
	public String registerUser(@ModelAttribute("user") User user, ModelMap modelMap) {
		modelMap.addAttribute(user);
		return "regResult";
	}


}
