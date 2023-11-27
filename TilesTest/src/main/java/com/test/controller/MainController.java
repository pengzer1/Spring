package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping(value="/index.do")
	public String index(Model model) {
		
		// tiles.xml > <definition> name 값
		return "index";
	}
}
