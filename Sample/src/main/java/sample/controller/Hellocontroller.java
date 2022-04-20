package sample.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hellocontroller {
	
	@RequestMapping("/")
	public String hello() {
		return "SpringBoot Hello World!";
	}
}