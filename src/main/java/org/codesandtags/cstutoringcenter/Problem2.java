package org.codesandtags.cstutoringcenter;

import java.math.BigInteger;

public class Problem2 {
	
	public static void main(String[] args) {
		
		Problem2 solve = new Problem2();
		System.out.println(solve.getSum(2, 10));
		System.out.println(solve.getSum(2, 50));
		
	}
	
	public int getSum(int number, int power){
		
		BigInteger digits = new BigInteger(String.valueOf(number)).pow(power);
		int sum = 0;
		
		for (int i = 0; i < digits.toString().length(); i++) {
			sum += Integer.parseInt("" + digits.toString().charAt(i));
		}
		
		return sum;
	} 

}
