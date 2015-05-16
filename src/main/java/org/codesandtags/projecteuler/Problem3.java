package org.codesandtags.projecteuler;

/**
 * 
 * The prime factors of 13195 are 5, 7, 13 and 29. * What is the largest prime
 * factor of the number 600851475143 ?
 * 
 * @author codesandtags
 * 
 */

public class Problem3 {

	public static void main(String[] args) {

		Problem3 solve = new Problem3();
		System.out.println("Largest prime factor of 600851475143 : "
				+ solve.largestPrimeFactor(600851475143l));

	}

	/**
	 * Recibe un numero al que se le halla el factor primo mas grande
	 * 
	 * @param num
	 * @return
	 */
	public long largestPrimeFactor(long num) {
		// Se itera hasta que el num deje de ser mayor que el primo
		for (long i = 1; i < num; i++) {
			if (num % i == 0) {
				num /= i;
				System.out.println("Prime : " + i + " : " + num);
				continue;
			}
		}
		// Finalmente se retorna el ultimo numero hallado como primo
		return num;
	}
}
