package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping(value = "/test.do")
	public String test(Model model) {

		// - 기존 ViewResolver 삭제 > JSP 페이지명
		// - 새롭게 TilesViewResolver 추가 > definition명
		
		return "test";
	}
	
}
