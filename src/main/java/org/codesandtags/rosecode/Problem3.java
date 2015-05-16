package org.codesandtags.rosecode;

import java.math.BigInteger;

/**
 * Un palíndromo es una palabra, número o frase que se lee igual hacia adelante
 * que hacia atrás. Si se trata de un número, se llama capicúa. Habitualmente,
 * las frases palindrómicas se resienten en su significado cuanto más largas
 * son. (Wikipedia)
 * 
 * un número primo es un número natural mayor que 1 que tiene únicamente dos
 * divisores distintos: él mismo y el 1. Los números primos se contraponen así a
 * los compuestos, que son aquellos que tienen algún divisor natural aparte de
 * sí mismos y del 1. El número 1, por convenio, no se considera ni primo ni
 * compuesto. (Wikipedia).
 * 
 * Este codigo obtiene la suma de todos los numeros primos inferiores a un
 * numero dado, cuya validacion principal es que sean palindrimos
 * 
 * @author Codes and tags
 * 
 */

public class Problem3 {

	public static void main(String args[]) {

		Problem3 ejemplo = new Problem3();
		// Tiempo inicial
		long startTime = System.currentTimeMillis();
		// Hace magia
		System.out.println("Obteniendo suma de palindromos primos...");
		System.out.println("Suma =>" + ejemplo.getSumPrimesPalindromes(500));
		// Tiempo final
		long endtTime = System.currentTimeMillis();
		// Tiempo total
		System.out.println("Tiempo invertido ms : " + (endtTime - startTime));

	}

	/**
	 * Obtiene la suma de todos los numero primos palindromos por debajo del
	 * valor especificado como parametro
	 * 
	 * @param maxPrime
	 * @return
	 */
	public long getSumPrimesPalindromes(int maxPrime) {

		long sum = 0;
		BigInteger prime = BigInteger.ONE;

		// Obtiene los numeros primos inferiores al maximo primo especificado
		while (prime.intValue() < maxPrime) {
			prime = prime.nextProbablePrime();
			// Si es palindromo lo suma
			if (isPalindrome(prime.toString())) {
				sum += prime.longValue();
				System.out.println("Prime Palindrome : " + prime);
			}
		}

		// Devuelve la suma
		return sum;
	}

	/**
	 * Valida si la cadena enviada es palindromo
	 * 
	 * @param word
	 * @return
	 */
	public boolean isPalindrome(String chain) {
		StringBuilder copy = new StringBuilder(chain);
		if (chain.equals(copy.reverse().toString())) {
			return true;
		} else {
			return false;
		}
	}

}
