package org.codesandtags.cstutoringcenter;

import java.math.BigInteger;

public class Problem9 {
	
	public static void main(String[] args) {
		
		Problem9 solve = new Problem9();
		System.out.println(solve.getTotalPrimes(100));
		//System.out.println(solve.getTotalPrimes((long)Math.pow(10, 7)));
		
	}
	
	public long getTotalPrimes(long belowNumber){
		
		BigInteger prime = BigInteger.ONE;
		long totalPrimes = 0;
		
		while(prime.nextProbablePrime().longValue() < belowNumber){
			totalPrimes++;
			prime = prime.nextProbablePrime();
		}
		
		return totalPrimes;
	}

}
