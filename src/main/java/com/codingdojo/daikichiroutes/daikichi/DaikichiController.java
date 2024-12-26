package com.codingdojo.daikichiroutes.daikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")


public class DaikichiController {
	@RequestMapping("")
	public String index(@RequestParam(value="q",required=false) String searchQuery) {
		if(searchQuery == null) {
			return "You searched for nothing";
		}
		return "You searched for: " + searchQuery;
	}
	@RequestMapping("/welcome")
	public String welcome() {
		return "Welcome !";
	}
	
	@RequestMapping("/today")
	public String today() {
		return " Today you will find luck in all your endeavors !";
	}
	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an opportunity will arise so be sure to bo open to new ideas !";
	}
	
}
