package com.github.lk.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@SpringBootApplication
public class BootApplication {

	@RequestMapping("/")
	@ResponseBody
	public String home(){
		return "it work.";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(BootApplication.class, args);
	}

}
