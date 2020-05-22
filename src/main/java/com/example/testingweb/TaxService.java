package com.example.testingweb;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaxService {
	
	@Autowired
	private TestBracketService bracketService;
	
	@Autowired
	private TaxRateService taxRateService;;
	
	public String getBracket(int income) {
		if (income < 1000) return "LOW";
		else if (income < 5000) return "MEDIUM";
		else return "HIGH";
	}
	
	public List<String> allBrackets(){
		return bracketService.allBrackets();
	}
	
	public BigDecimal calculateTax(BigDecimal income) {
		BigDecimal taxRate = taxRateService.getTaxRate(income);
		BigDecimal tax = taxRate.multiply(income);
		return tax;
	}

}
