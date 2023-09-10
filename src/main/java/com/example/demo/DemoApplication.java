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
		System.out.println("rahul's commit");
		System.out.println("chnge1");
		return "Rahul commits";
	}

	
	@RequestMapping("/hi")
	public String getWelcomeHi() {
		System.out.println("chnge1");
		System.out.println("rahul's commit");
		return "Welcome to my ";
	}
	
	
	@RequestMapping("/bye")
	public String getWelcomebye() {
		return "Hi Deepak      ";
	}
	@RequestMapping("/byej")
	public String getWelcomebyeh() {
		return "!Bye  ";
	}

	public void test1(){
		System.out.println("Hello World....Deepak");
	}

}
