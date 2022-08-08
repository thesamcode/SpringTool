package com.thesamecode.fruityloops;

import java.util.ArrayList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
//@RequestMapping("/fruityloops")
public class FruityLoopsController {
	
	//	@RequestMapping("/")
//	public String index() {
//		return "Welcome!";
//	}
	
//	@RequestMapping("/")
//	public String index(Model model) {
//		model.addAttribute("fruit","banana");
//		return "index.jsp";
//	}
	
	@RequestMapping("/")
	public String index(Model model) {
	        
	    ArrayList<Item> fruits = new ArrayList<Item>();
	    fruits.add(new Item("Kiwi", 1.5));
	    fruits.add(new Item("Mango", 2.0));
	    fruits.add(new Item("Goji Berries", 4.0));
	    fruits.add(new Item("Guava", .75));
	    
	    model.addAttribute("fruit1", fruits.get(0));
	    model.addAttribute("fruit2", fruits.get(1));
	    model.addAttribute("fruit3", fruits.get(2));
	    model.addAttribute("fruit4", fruits.get(3));
	        
	    // Add fruits your view model here
	        
	    return "index.jsp";
	}
}
	
//	@RequestMapping("/today")
//	public String index2() {
//		return "Today you will find good luck in all your endeavors!";
//	}
//	
//	@RequestMapping("/tomorrow")
//	public String index3() {
//		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas!";
//	}
//	
//	@RequestMapping("/travel/{city}")
//    public String showCityWelcome(@PathVariable("city") String city){
//    	return "Congratulations! You will soon travel to " + city + "!";
//    }
//	
//	@RequestMapping("/lotto/{integer}")
//    public String showLesson(@PathVariable ("integer") int integer){
//		if (integer % 2 == 0) {
//			return "You will take a grand journey in the near future, but be wary of tempting offers.";
//		}
//		else {
//			return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";
//		}
//    }

	
