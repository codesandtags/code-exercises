package org.codesandtags.cstutoringcenter;

import java.math.BigInteger;

public class Problem10 {
	
	public static void main(String[] args) {
		
		Problem10 solve = new Problem10();
		System.out.println(solve.getSumPrimesBelow(5000));
		//System.out.println(solve.getTotalPrimes((long)Math.pow(10, 7)));
		
	}
	
	public long getSumPrimesBelow(long belowNumber){
		
		BigInteger prime = BigInteger.ONE;
		long sumPrimes = 0;
		
		while(prime.nextProbablePrime().longValue() < belowNumber){			
			prime = prime.nextProbablePrime();
			sumPrimes += prime.longValue();
			System.out.println(prime + " => "+ sumPrimes);
		}
		
		return sumPrimes;
	}


}
