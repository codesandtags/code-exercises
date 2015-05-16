package org.codesandtags.projecteuler;

import java.math.BigInteger;

import javax.swing.text.MaskFormatter;

public class Problem50 {

	public static void main(String[] args) {

		long start = System.currentTimeMillis();

		Problem50 solve = new Problem50();
		// System.out.println("100 =>" + solve.getLongestSumOfTermPrimes(100));
		// System.out.println("1000 =>" + solve.getLongestSumOfTermPrimes(1000));
		System.out.println("1000000 =>" + solve.getLongestSumOfTermPrimes(1000000));

		long end = System.currentTimeMillis();
		System.out.println("Total " + (end - start) + " ms.");

	}

	public int getLongestSumOfTermPrimes(int belowTerm) {
		int primeLongestSum = 0;
		BigInteger prime = BigInteger.ONE;
		BigInteger primeAnswer = BigInteger.ZERO;

		while (prime.intValue() < belowTerm) {

			prime = prime.nextProbablePrime();

			if (getSumOfTermsPrimes(prime) > primeLongestSum) {
				primeLongestSum = getSumOfTermsPrimes(prime);
				primeAnswer = prime;
				System.out.println("Terminos : " + primeAnswer + " => "
						+ primeLongestSum);
			}

			// System.out.println("Prime >>" + prime);
		}

		// System.out.println("Prime : " + primeAnswer + " :::: Terms : " +
		// primeLongestSum);
		return primeLongestSum;
	}

	public int getSumOfTermsPrimes(BigInteger prime) {

		int maxTerms = 0;

		BigInteger auxPrime = BigInteger.ONE;
		BigInteger thePrime = BigInteger.ONE;

		while (thePrime.compareTo(prime) < 0) {
			auxPrime = thePrime;
			int terms = 0;
			BigInteger sumPrime = BigInteger.ZERO;

			while (sumPrime.compareTo(prime) < 0) {
				auxPrime = auxPrime.nextProbablePrime();
				sumPrime = sumPrime.add(auxPrime);
				// System.out.println("=>" + prime + "=>" + auxPrime + " : " +
				// sumPrime);
				terms++;
			}

			if (sumPrime.compareTo(prime) == 0) {
				if (terms > maxTerms)
					maxTerms = terms;
			}

			thePrime = thePrime.nextProbablePrime();
		}

		return maxTerms;
	}
}
