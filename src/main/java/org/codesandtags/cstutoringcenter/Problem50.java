package org.codesandtags.cstutoringcenter;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Problem50 {
	
	public static void main(String[] args) {
		
		Problem50 solve = new Problem50();
		System.out.println(solve.getSumFibonnaci(50));
		System.out.println(solve.getSumPrimes(50));
		System.out.println(solve.getSumOdd(50));
		
		
		System.out.println(solve.getSumFibonnaci(50).longValue() 
				+ solve.getSumPrimes(50) + solve.getSumOdd(50));
		
	}
	
	public long getSumPrimes(int max){
		
		BigInteger prime = BigInteger.ONE;
		long sum = 0;
		int n = 1;
		
		while(n <= max){
			prime = prime.nextProbablePrime();
			System.out.println(n + " => " + prime);
			sum += prime.longValue();
			n++;
		}
		
		return sum;
	}
	
	public BigInteger getSumFibonnaci(int max){
		
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ZERO;
		BigInteger sum = BigInteger.ZERO;
		int n = 1;
		
		while(n <= max){
			a = a.add(b);
			b = a.subtract(b);
			System.out.println(n + " => " + b);
			sum = sum.add(b);
			n++;
		}
		
		return sum;
		
	}
	
	public long getSumOdd(int max){
		
		long sum = 0;
		int n = 1;
		int i = 1;
		
		while(n <= max){
			if( (i&1) != 0){
				System.out.println(n + " => " + i);
				sum += i;
				n++;
			}
			i++;
		}
		
		return sum;
	}

}
