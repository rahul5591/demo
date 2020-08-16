package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	
	@RequestMapping("/hello")
	public String getWelcomeMessage() {
		return "Welcome rahul tamrkar";
	}

	
	@RequestMapping("/hi")
	public String getWelcomeHi() {
		return "Welcome to my ";
	}
	
	
	@RequestMapping("/bye")
	public String getWelcomebye() {
		return "!Bye  ";
	}
	@RequestMapping("/byej")
	public String getWelcomebyeh() {
		return "!Bye  ";
	}

<<<<<<< Updated upstream
	public void hellotest1(){
		System.out.println("hello test1");
=======
	public void hellotest2(){
              System.out.println("hello test2");
>>>>>>> Stashed changes
	}
}
