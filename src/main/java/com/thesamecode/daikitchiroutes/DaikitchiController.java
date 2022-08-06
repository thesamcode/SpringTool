package com.thesamecode.daikitchiroutes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DaikitchiController {
		
	@RequestMapping("/daikitchi")
	public String index() {
		return "Welcome!";
	}
	
	@RequestMapping("/daikitchi/today")
	public String index2() {
		return "Today you will find good luck in all your endeavors!";
	}
	
	@RequestMapping("/daikitchi/tomorrow")
	public String index3() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}

}
