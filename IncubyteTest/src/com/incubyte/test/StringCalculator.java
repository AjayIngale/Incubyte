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
        	  return Integer.parseInt(numbers[0])+Integer.parseInt(numbers[1]);
          }
}
	
	private boolean isEmpty(String input) {
		 return input.isEmpty();
	}

	private int StringToInt(String input) {
		return Integer.parseInt(input);
	
	}
}
