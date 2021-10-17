package com.incubyte.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {
	@Test
	public void empty_string_should_return_0()  {
		StringCalculator calculator =new StringCalculator();
		assertEquals(calculator.add(""), 0);
	}
	@Test
	public void singlevalue_string_should_return_1()  {
		StringCalculator calculator =new StringCalculator();
		assertEquals(calculator.add("1"), 1);
	}
	@Test
	public void twovalue_string_should_return_sum()  {
		StringCalculator calculator =new StringCalculator();
		assertEquals(calculator.add("1,2"),3);
	}
	@Test
	public void threevalue_string_should_return_sum()  {
		StringCalculator calculator =new StringCalculator();
		assertEquals(calculator.add("1,2,3"),6);
	}
	
}
