package org.codesandtags.rosecode;

import java.math.BigInteger;

/**
 * Un pal�ndromo es una palabra, n�mero o frase que se lee igual hacia adelante
 * que hacia atr�s. Si se trata de un n�mero, se llama capic�a. Habitualmente,
 * las frases palindr�micas se resienten en su significado cuanto m�s largas
 * son. (Wikipedia)
 * 
 * un n�mero primo es un n�mero natural mayor que 1 que tiene �nicamente dos
 * divisores distintos: �l mismo y el 1. Los n�meros primos se contraponen as� a
 * los compuestos, que son aquellos que tienen alg�n divisor natural aparte de
 * s� mismos y del 1. El n�mero 1, por convenio, no se considera ni primo ni
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
