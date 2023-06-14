package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		Account acct = new Account(0);
		
		Deposit d = Deposit.of(5_000, acct);
		System.out.println(d);
		System.out.println(d.amount());
		
		d = d.amend(12_000);
		System.out.println(d);
		System.out.println(d.amount());
		
	}

}
