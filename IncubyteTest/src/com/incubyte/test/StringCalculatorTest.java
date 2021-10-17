package com.incubyte.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {
	@Test
	public void empty_string_should_return_0()  {
		StringCalculator calculator =new StringCalculator();
		assertEquals(calculator.calculate(""), 0);
	}

	
}
