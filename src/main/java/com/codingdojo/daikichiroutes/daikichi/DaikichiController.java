package com.codingdojo.daikichiroutes.daikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")


public class DaikichiController {
	@RequestMapping()
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
