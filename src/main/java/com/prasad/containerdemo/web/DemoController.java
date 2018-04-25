package com.prasad.containerdemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class DemoController {
	
	@RequestMapping("/welcome")
	public ModelAndView displayView() {
		
		ModelAndView mav = new ModelAndView("static/html/index.html");
		return mav;
	}

}
