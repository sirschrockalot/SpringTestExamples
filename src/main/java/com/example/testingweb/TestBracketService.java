package com.example.testingweb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TestBracketService {
	
	public List<String> allBrackets(){
		List<String> brackets = new ArrayList<String>();
		brackets.add("LOW");
		brackets.add("MEDIUM");
		brackets.add("HIGH");
		
		return brackets;
	}

}
