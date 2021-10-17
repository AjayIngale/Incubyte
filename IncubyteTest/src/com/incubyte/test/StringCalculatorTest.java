package com.incubyte.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringCalculatorTest {
	@Test
	public void empty_string_should_return_0() throws Exception  {
		StringCalculator calculator =new StringCalculator();
		assertEquals(calculator.add(""), 0);
	}
	@Test
	public void singlevalue_string_should_return_1() throws Exception  {
		StringCalculator calculator =new StringCalculator();
		assertEquals(calculator.add("1"), 1);
	}
	@Test
	public void twovalue_string_should_return_sum() throws Exception  {
		StringCalculator calculator =new StringCalculator();
		assertEquals(calculator.add("1,2"),3);
	}
	@Test
	public void threevalue_string_should_return_sum() throws Exception  {
		StringCalculator calculator =new StringCalculator();
		assertEquals(calculator.add("1,2,3"),6);
	}
	@Test
	public void  newlinebetween_string_should_return_sum() throws Exception  {
		StringCalculator calculator =new StringCalculator();
		assertEquals(calculator.add("1\n2,3"),6);
	}
	@Test
	public  void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() throws Exception {
		StringCalculator calculator =new StringCalculator();
	   assertEquals(calculator.add("//;\n1;2"),3);
	}
	@Test
	@org.junit.Test(expected = RuntimeException.class)
	public final void whenNegativeNumberIsUsedThenRuntimeExceptionIsThrown() {
		StringCalculator calculator =new StringCalculator();
		try {
			calculator.add("-3");
		
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		
		}
	}
	@Test
	@org.junit.Test(expected = RuntimeException.class)
	public final void whenNegativeNumbersIsUsedThenRuntimeExceptionIsThrown() {
		StringCalculator calculator =new StringCalculator();
		try {
			calculator.add("-3,-6,-15,-18,46,33");
		
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		
		}
	}
	
	
}
