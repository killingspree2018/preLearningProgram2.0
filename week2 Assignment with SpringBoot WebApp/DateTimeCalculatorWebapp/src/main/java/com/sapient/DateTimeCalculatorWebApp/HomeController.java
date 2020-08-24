package com.sapient.DateTimeCalculatorWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(){
		return "index";
	}
		
	@RequestMapping("solve")
	public String add(Model m,@RequestParam String date, @RequestParam String Function){
		
		Date d = new Date(date);
		m.addAttribute("date", date);
		m.addAttribute("Function",Function);
		m.addAttribute("result",NaturalLanguageConverter.FunctionParser(Function,d));
		return  "index";
	}
	
}
