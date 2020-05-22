package com.example.testingweb;




import static org.assertj.core.api.Assertions.assertThat;

import java.math.BigDecimal;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
public class TestService {
	
	@Autowired
	private TaxService service;
	
	@Autowired
	private TestBracketService bracketService;
	
	@MockBean
	private TaxRateService taxRateService;
	
//	@MockBean
//	private MiraklCLient client
	
	@Test
	public void brackets() {
		final String taxBracket = service.getBracket(500);
		assertThat(taxBracket).isEqualTo("LOW");
	}
	
	
	@Test
	public void allBrackets() {
		final List<String> allBrackets = service.allBrackets();
		assertThat(allBrackets).isNotEmpty();
		assertThat(allBrackets).contains("LOW","MEDIUM","HIGH");
		
	}
	
	@Test
	public void tax() {
		final BigDecimal income = new BigDecimal(5000);
		
		//Mock the response from the service
		Mockito.when(taxRateService.getTaxRate(income)).thenReturn(new BigDecimal(4));
		
		final BigDecimal tax = service.calculateTax(new BigDecimal(5000));
		assertThat(tax).isEqualByComparingTo(new BigDecimal(200));
	}
	
	
	

//	@MockBean
//	private TestBrackets brackets;

//		Mockito.when(brackets.getFirstName("Joel")).thenReturn("Nothing");
//		assertThat(brackets.getFirstName("Joel").
//		assertTrue(service.doBracketsExist());
//	}
	

}
