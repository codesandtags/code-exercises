package org.codesandtags.cstutoringcenter;

import java.math.BigInteger;

public class Problem18 {
	
	private int FORTNIGHT = 14;
	
	public static void main(String[] args) {
		System.out.println(" => " + new Problem18().getPrimeNumberSum(1000000));
	}
	
	public int getPrimeNumberSum(int max){
		int total = 0;
		BigInteger prime = BigInteger.ONE;
		
		while(prime.intValue() <= max){
			prime = prime.nextProbablePrime();
			if(getSumDigits(prime.toString()) == 14){
				System.out.println(prime);
				total++;
			}
		}
		
		return total;
	}

	public int getSumDigits(String digits) {
		int sum = 0;
		
		for (int i = 0; i < digits.length(); i++) {
			int number = Integer.parseInt(String.valueOf(digits.charAt(i)));
			sum += number;
		}
		
		return sum;
	}

}
