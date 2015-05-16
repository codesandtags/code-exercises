package org.codesandtags.cstutoringcenter;

import java.math.BigInteger;

import org.codesandtags.utils.FibonacciNormal;

public class Problem13 {
	
	public static void main(String[] args) {
		
		Problem13 solve = new Problem13();
		
		for (int i = 1; i < 100; i++) {
			String fibo = solve.getFibonacci(i).toString();
			if(fibo.length() == 15){
				System.out.println(fibo);	
			}
		}
		
	}
	
	public BigInteger getFibonacci(long n){
		BigInteger a = BigInteger.ZERO;
		BigInteger b = BigInteger.ONE;
		
		for (int i = 0; i < n; i++) {
			a = a.add(b);
			b = a.subtract(b);
		}
		
		return b;
	}

}
