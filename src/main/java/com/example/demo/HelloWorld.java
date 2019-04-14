package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
	
	@ResponseBody
	@RequestMapping("/helloworld")
	public String helloWorld(){
		System.out.println("会当凌绝顶，");
		System.out.println("一览众山小。");
		return "HelloWorld";
	}
	
}
