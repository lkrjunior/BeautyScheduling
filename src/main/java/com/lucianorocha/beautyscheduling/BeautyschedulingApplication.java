package com.lucianorocha.beautyscheduling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"controller"})
public class BeautyschedulingApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(BeautyschedulingApplication.class, args);
	}

}
