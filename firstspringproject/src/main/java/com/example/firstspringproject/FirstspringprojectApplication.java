package com.example.firstspringproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstspringprojectApplication implements CommandLineRunner {
	@Autowired 
	helloworld hw;
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(FirstspringprojectApplication.class, args);
		System.out.println(context.getBeanDefinitionCount());

		String [] names = context.getBeanDefinitionNames();
		int count=1;
		for(String str : names){
			System.out.println(count+ " "+ str);
			count++;
		}
	}

	@Override 
	public void run(String... args) throws Exception{
		hw.display();
	}

}
