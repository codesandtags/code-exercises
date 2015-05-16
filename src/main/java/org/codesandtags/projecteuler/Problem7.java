package org.codesandtags.projecteuler;

import java.math.BigInteger;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see
 * that the 6th prime is 13.
 * 
 * What is the 10 001st prime number?
 * 
 * @author codesandtags
 * 
 */
public class Problem7 {

	public static void main(String[] args) {
		Problem7 solve = new Problem7();
		System.out.println("The 10001st prime number is : "
				+ solve.getPrimeNumber(6));
		System.out.println("The 10001st prime number is : "
				+ solve.getPrimeNumber(10001));
	}

	/**
	 * Obtiene un numero primo dado
	 * 
	 * @param n
	 * @return
	 */
	public BigInteger getPrimeNumber(int n) {
		// Inicializa el primer numero primo
		BigInteger prime = BigInteger.ZERO;
		// Itera hasta llegar a N primos
		for (int i = 0; i < n; i++) {
			prime = prime.nextProbablePrime();
		}
		// Hakuna Matata
		return prime;
	}
}
