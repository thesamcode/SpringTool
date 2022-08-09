package com.thesamecode.daikitchiroutes;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/daikitchi")

@Controller
public class DaikitchiController {
		
	@RequestMapping("/")
	public String index() {
		return "testfile.jsp";
	}
	
	@RequestMapping("/omikuji")
	public String questions() {
		return "questions.jsp";
	}
	
	@RequestMapping(value="/omikuji/questions", method=RequestMethod.POST)
//	@RequestMapping(value="/omikuji/questions")
	public String imput(
		@RequestParam(value="number") String number,
		@RequestParam(value="city") String city,
		@RequestParam(value="person") String person,
		@RequestParam(value="hobby") String hobby,
		@RequestParam(value="thing") String thing,
		@RequestParam(value="nice") String nice,
		HttpSession session){
		
		session.setAttribute("number", number);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("nice", nice);
		return "redirect:/omikuji/show";
	}
	
	@RequestMapping("/omikuji/show")
	public String fortune(Model model) {
		return "fortune.jsp";
	}
	
	@RequestMapping("/daikitchi/today")
	public String index2() {
		return "Today you will find good luck in all your endeavors!";
	}
	
	@RequestMapping("/daikitchi/tomorrow")
	public String index3() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
	}
	
	@RequestMapping("/daikitchi/travel/{city}")
    public String showCityWelcome(@PathVariable("city") String city){
    	return "Congratulations! You will soon travel to " + city + "!";
    }
	
	@RequestMapping("/daikitchi/lotto/{integer}")
    public String showLesson(@PathVariable ("integer") int integer){
		if (integer % 2 == 0) {
			return "You will take a grand journey in the near future, but be wary of tempting offers.";
		}
		else {
			return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
		}
    }

}

