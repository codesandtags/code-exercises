package org.codesandtags.projecteuler;

/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1
 * to 10 without any remainder.
 * 
 * What is the smallest positive number that is evenly divisible by all of the
 * numbers from 1 to 20?
 * 
 * @author codesandtags
 * 
 */

public class Problem5 {

	public static void main(String[] args) {

		Problem5 solve = new Problem5();
		System.out.println("The Smallest positive number divisible of 20 : "
				+ solve.smallestDivisible(20));

	}

	/**
	 * 
	 * @param num
	 * @return
	 */
	public int smallestDivisible(int num) {
		// El numero mas pequeño
		int smallest = 0;
		// Flag para manejar la condicion
		boolean isSmallest = false;

		// Itera hasta que encuentre el primer numero divisible por todos los
		// numeros descendientes de manera secuencial de un numero dado
		while (!isSmallest) {
			smallest++;

			// Obtiene un numero divisible sin resto hasta que se hallen todos
			// los numeros
			for (int k = num; k > 0; k--) {
				if (smallest % k == 0) {
					isSmallest = true;
				} else {
					// Si no es divisible rompe y continua con el proximo numero
					isSmallest = false;
					break;
				}
			}
		}

		return smallest;
	}

}
