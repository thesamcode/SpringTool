package com.thesamecode.daikitchiroutes;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikitchi")
public class DaikitchiController {
		
	@RequestMapping("/")
	public String index() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String index2() {
		return "Today you will find good luck in all your endeavors!";
	}
	
	@RequestMapping("/tomorrow")
	public String index3() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/travel/{city}")
    public String showCityWelcome(@PathVariable("city") String city){
    	return "Congratulations! You will soon travel to " + city + "!";
    }
	
	@RequestMapping("/lotto/{integer}")
    public String showLesson(@PathVariable ("integer") int integer){
		if (integer % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers.";
		}
		else {
			return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
		}
    }

}

