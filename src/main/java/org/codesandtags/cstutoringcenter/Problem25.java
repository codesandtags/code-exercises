package org.codesandtags.cstutoringcenter;

import java.math.BigInteger;


public class Problem25 {
	
	public static void main(String[] args) {
		Problem25 solve = new Problem25();
		
		BigInteger sum = BigInteger.ZERO;
		
		String fibo = solve.getFibonacci(1000).toString();
		System.out.println(fibo + "=> " + fibo.length());

		
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
