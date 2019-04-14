package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
	
	@ResponseBody
	@RequestMapping("/helloworld")
	public String helloWorld(){
		System.out.println("长风破浪会有时，");
		System.out.println("直挂云帆济沧海。");
		return "HelloWorld";
	}
	
}
