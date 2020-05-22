package com.example.testingweb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GreetingService {
	
	@Autowired
	private TestBrackets brackets;
	
	public String greet() {
		return "Hello, World People";
	}
	
	public String testMethod() {
		return "LOW";
	}
	
	public boolean doBracketsExist() {
		return brackets.doBracketsExist();
	}
}
