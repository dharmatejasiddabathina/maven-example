package com.mph.HelloWorld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
	@RequestMapping("/hello")
		public String hello()
		{
			return "Hellooo Maven";
		}
	
}
