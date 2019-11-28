package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TitleController {

	private static final Logger logger = LoggerFactory.getLogger(TitleController.class);
	
	@RequestMapping(value="/title",method= RequestMethod.GET)
	public String displayTitle()
	{
		return "conference_view";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public String displayRegister(Model model)
	{
		return "register";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String displayLogin(Model model)
	{
		return "login";
	}
}
