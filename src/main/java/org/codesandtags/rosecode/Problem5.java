package org.codesandtags.rosecode;

import java.math.BigInteger;

/**
 * Count concatable prime pairs under one thousand
 * 
 * Pair 3,7 is the first concatable prime pair as 3,7,37, and 73 are all prime.
 * When each member is below 100, there are 24 such pairs. How many concatable
 * prime pairs exist when each member is below one thousand?
 * 
 * @author Codes and Tags
 * 
 */

public class Problem5 {
	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		Problem5 ejemplo = new Problem5();
		ejemplo.getPrimePairs(100);
		long endTime = System.currentTimeMillis();
		System.out.println("Tiempo invertido ms : " + (endTime - startTime));
		

	}

	public int getPrimePairs(int maxPrime) {
		int primePairs = 0;
		BigInteger prime = BigInteger.ONE;
		String[] primeArray = new String[maxPrime];

		while (prime.intValue() < maxPrime) {
			prime = prime.nextProbablePrime();
			System.out.println(prime);
		}

		return primePairs;

	}
}
