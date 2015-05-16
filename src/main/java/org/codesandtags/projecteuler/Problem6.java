package org.codesandtags.projecteuler;

/**
 * The sum of the squares of the first ten natural numbers is,
 * 
 * 12 + 22 + ... + 102 = 385 The square of the sum of the first ten natural
 * numbers is,
 * 
 * (1 + 2 + ... + 10)2 = 552 = 3025 Hence the difference between the sum of the
 * squares of the first ten natural numbers and the square of the sum is 3025
 * 385 = 2640.
 * 
 * Find the difference between the sum of the squares of the first one hundred
 * natural numbers and the square of the sum.
 * 
 * @author codesandtags
 * 
 */
public class Problem6 {

	public static void main(String[] args) {

		Problem6 solve = new Problem6();
		System.out.println("The sum of the squares is : "
				+ solve.differenceSumSquares(10));
		System.out.println("The sum of the squares is : "
				+ solve.differenceSumSquares(100));

	}

	/**
	 * Obtiene la diferencia entre el cuadrado de los primeros X numeros y de
	 * cada uno de los primeros X numeros dados
	 * 
	 * @param square
	 * @return
	 */
	public long differenceSumSquares(int square) {
		// Variables
		long sumSquares = 0;
		long sumNumbers = 0;
		long difference = 0;

		// Itera para hallar la suma de los cuadrados y los numeros
		for (int i = 1; i <= square; i++) {
			sumSquares += (long) Math.pow(i, 2);
			sumNumbers += i;
		}
		// Se obtiene la diferencia
		difference = (long) (Math.pow(sumNumbers, 2) - sumSquares);
		return difference;
	}
}
