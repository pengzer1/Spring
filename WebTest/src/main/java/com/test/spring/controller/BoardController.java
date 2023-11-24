package com.test.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/board")
public class BoardController {

	//- "/spring/board/list.do"
	//- "/spring/board/add.do"
	//- "/spring/board/addok.do"
	//- "/spring/board/view.do"
	
	// @RequestMapping에서 명시하지 않으면 doGet, doPost 둘다 할수 있음 > 좋지는 않은 방식 > 나중에 헷갈려
	
	// - doGet() 역할
	@RequestMapping(value="/list.do", method= {RequestMethod.GET, RequestMethod.POST})
	public String list() {
		
		return "board/list";
	}
	
	// - doGet() 역할
	@RequestMapping(value="/add.do", method=RequestMethod.GET)
	public String add() {
		return "board/add";
	}
	
	// - doPost() 역할
	@RequestMapping(value="/addok.do", method=RequestMethod.POST)
	public String addok() {
		return "board/addok";
	}
	
	// - doGet() 역할
	@RequestMapping(value="/view.do", method=RequestMethod.GET)
	public String view() {
		return "board/view";
	}
	
}










