package org.codesandtags.cstutoringcenter;

import java.math.BigInteger;

public class Problem14 {
	
	public static void main(String[] args) {
		Problem14 solve = new Problem14();
		
		BigInteger sum = BigInteger.ZERO;
		
		for (int i = 1; i <= 75; i++) {
			String fibo = solve.getFibonacci(i).toString();
			System.out.println(i +" => "+fibo);
			sum = sum.add(solve.getFibonacci(i));
		}
		
		System.out.println("Result > " + sum);
		
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
