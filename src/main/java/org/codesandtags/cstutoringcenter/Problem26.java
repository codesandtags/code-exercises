package org.codesandtags.cstutoringcenter;

import java.math.BigInteger;

public class Problem26 {
	
	public static void main(String[] args) {
		Problem26 solve = new Problem26();
		
		BigInteger sum = BigInteger.ZERO;
		String fibo = solve.getFibonacci(1000).toString();
		int odds = 0;
		
		for (int i = 0; i < fibo.length(); i++) {
			int number = Integer.parseInt("" +fibo.charAt(i));
			
			if(number % 2 != 0){
				System.out.println(" Odd => " + number);
				odds++;
			}
		}
		
		System.out.println(" Odds ===> " + odds);

		
	}
	
	public BigInteger getFibonacci(long n){
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ZERO;
		
		for (int i = 0; i < n; i++) {
			a = a.add(b);
			b = a.subtract(b);
		}
		
		return b;
	}

}
