package edu.sru.severance.registrationappointmentsystem.controller;

import org.springframework.stereotype.Controller;

@Controller
public class IndexPage {
	
	@RequestMapping({"/index"})
	String displayIndexPage()
	{
		return "index";
	}
}