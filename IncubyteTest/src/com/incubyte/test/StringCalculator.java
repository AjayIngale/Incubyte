package com.incubyte.test;

public class StringCalculator {

	public int calculate(String input) {
		String [] numbers =input.split(",");
          if(isEmpty(input))
          {
        	  return 0;
          }
          if(input.length()==1) {
			   return StringToInt(input);
		   }
          else {
        	  return getSum(numbers[0],numbers[1]);
          }
}
	private int getSum(String numA,String numB) {
		return Integer.parseInt(numA)+Integer.parseInt(numB);
	}
	private boolean isEmpty(String input) {
		 return input.isEmpty();
	}

	private int StringToInt(String input) {
		return Integer.parseInt(input);
	
	}
}
