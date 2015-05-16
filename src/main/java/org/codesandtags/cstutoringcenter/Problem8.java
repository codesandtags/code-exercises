package org.codesandtags.cstutoringcenter;

import java.math.BigInteger;

public class Problem8 {
	
	public static void main(String[] args) {
		
		Problem8 solve = new Problem8();
		System.out.println(solve.getSumPrimes(250));
		
	}
	
	public long getSumPrimes(int maxPrime){
		
		BigInteger prime = BigInteger.ONE;
		long sum = 0;
		
		for (int i = 1; i <= maxPrime; i++) {
			prime = prime.nextProbablePrime();
			System.out.println(i + " => " + prime);
			sum += prime.longValue();
		}
		
		return sum;
	}

}
