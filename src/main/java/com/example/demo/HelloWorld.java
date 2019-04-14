package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
	
	@ResponseBody
	@RequestMapping("/helloworld")
	public String helloWorld(){
		System.out.println("会当凌绝顶，一览众山小。");
		System.out.println("长风破浪会有时，直挂云帆济沧海。");
		System.out.println("落红不是无情物，化作春泥更护花。");
		return "HelloWorld";
	}
	
}
