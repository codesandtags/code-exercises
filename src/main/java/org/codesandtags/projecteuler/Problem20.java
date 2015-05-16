package org.codesandtags.projecteuler;

import java.math.BigInteger;
import java.util.Calendar;

/**
 * n! means n x (n - 1) x ... x 3 x 2 x 1
 * 
 * For example, 10! = 10 x 9 x ... x 3 x 2 x 1 = 3628800, and the sum of the
 * digits in the * number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
 * 
 * Find the sum of the digits in the number 100!
 * 
 * @author codesandtags
 * 
 */
public class Problem20 {
	public static void main(String[] args) {

		Problem20 solve = new Problem20();
		System.out.println("The sum of the digits in the number 10! is : "
				+ solve.getSumFactorial(10));
		System.out.println("The sum of the digits in the number 100! is : "
				+ solve.getSumFactorial(100));
		System.out.println("The sum of the digits in the number 100! is : "
				+ solve.getSumFactorial(1000));
		System.out.println("The sum of the digits in the number 100! is : "
				+ solve.getSumFactorial(10000));

	}

	/**
	 * Obtiene la sumatoria de todos los digitos del n factorial resultante,
	 * 
	 * @param n
	 * @return
	 */
	public long getSumFactorial(int n) {
		// Variables
		Calendar inicio = Calendar.getInstance();
		BigInteger factorial = BigInteger.ONE;
		long sumFactorial = 0;
		// Se obtiene el factorial
		for (int i = 1; i <= n; i++)
			factorial = factorial.multiply(new BigInteger("" + i));
		// Se obtiene la suma de todos los digitos
		String digits = factorial.toString();
		for (int i = 0; i < digits.length(); i++)
			sumFactorial += Long.valueOf("" + digits.charAt(i));
		// Hakuna Matata
		Calendar fin = Calendar.getInstance();
		System.out.println("Tiempo : "
				+ (fin.getTimeInMillis() - inicio.getTimeInMillis()) + " ms");
		return sumFactorial;
	}

}
