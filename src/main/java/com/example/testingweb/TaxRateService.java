package com.example.testingweb;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

@Service
public class TaxRateService {
	
	public BigDecimal getTaxRate(BigDecimal income) {
//		if (income < 1000) return new BigDecimal(10);
//		else if (income < 5000) return new BigDecimal(15);
		return new BigDecimal(20);
	}

}
