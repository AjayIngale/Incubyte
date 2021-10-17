package com.incubyte.test;

public class StringCalculator {
	private final String delimiter="\n|,";
	public int add(String input) {
		String [] numbers =input.split(delimiter);
          if(isEmpty(input))
          {
        	  return 0;
          }
          if(input.length()==1) {
			   return StringToInt(input);
		   }
          else {
        	  return getSum(numbers);
          }
}
	private int getSum(String[] numbers) {
		int sum=0;
		for(String current :numbers) {
		
			sum+=Integer.parseInt(current);	
		}
            
		return sum;			
	}

	private boolean isEmpty(String input) {
		 return input.isEmpty();
	}

	private int StringToInt(String input) {
		return Integer.parseInt(input);
	
	}
}
