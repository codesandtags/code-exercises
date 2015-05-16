package org.codesandtags.projecteuler;

import java.util.Calendar;

/**
 * 
 * The following iterative sequence is defined for the set of positive integers:
 * 
 * n -> n/2 (n is even) n -> 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following
 * sequence:
 * 
 * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1 It can be seen that this
 * sequence (starting at 13 and finishing at 1) contains 10 terms. Although it
 * has not been proved yet (Collatz Problem), it is thought that all starting
 * numbers finish at 1.
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * NOTE: Once the chain starts the terms are allowed to go above one million.
 * 
 * @author codesandtags
 * 
 */
public class Problem14 {
	public static void main(String[] args) {
		Problem14 solve = new Problem14();
		System.out.println("The longest chain under one million is : "
				+ solve.getLongestChain(1000000));

	}

	/**
	 * Obtiene el numero que genera la cadena mas larga en la secuencia del
	 * problema del 3n+1.
	 * 
	 * @param startNumber
	 * @return
	 */
	public int getLongestChain(int startNumber) {

		// Tiempo de inicio
		Calendar inicio = Calendar.getInstance();
		int longestChain = 0, numberChain = 1;

		// Iteracion para el rango de los numeros
		for (int i = 1, currentChain = 1; i <= startNumber; i++, currentChain = 1) {
			long n = i;
			while (n > 1) {
				if ((n & 1) == 0)
					n /= 2;
				else
					n = (n * 3) + 1;
				// Contador de cadenas por numero
				currentChain++;
			}
			// Evaluacion de la cadena mas larga y el numero que la genera
			if (currentChain > longestChain) {
				longestChain = currentChain;
				numberChain = i;
			}
		}
		// Tiempo finalizacion
		Calendar fin = Calendar.getInstance();
		// Total tiempo invertido
		System.out.println("Tiempo : "
				+ (fin.getTimeInMillis() - inicio.getTimeInMillis()) + " ms");

		// Impresion del numero y el tamano de la cadena
		System.out.println("N : " + numberChain + " = " + longestChain);
		return numberChain;
	}
}
