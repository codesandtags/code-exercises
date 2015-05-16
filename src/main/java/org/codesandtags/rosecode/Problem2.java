package org.codesandtags.rosecode;

import java.math.BigInteger;

/**
 * 
 * La serie de fibonacci corresponde a los numeros generados apartir de la
 * adicion de los 2 terminos anteriores, de acuerdo a esto los primeros numeros
 * de fibonacci serian : 1,1,2,3,5,8,13,21,..
 * 
 * Una suma digital es la representacion de tomar cada uno de los digitos dados
 * en un numero y sumarlos. Ejemplo : la Suma digital de 724 seria igual a :
 * 7+2+4 = 13
 * 
 * @author Codes and Tags
 * 
 */

public class Problem2 {

	public static void main(String[] args) {
		Problem2 solve = new Problem2();
		solve.getFibonnaci(100);
	}

	/**
	 * Obtiene la serie de fibonacci, de la manera mas rudimentaria utilizando
	 * BigInteger apenas para resolver pequenos retos de programacion
	 * 
	 * @param n
	 */
	public void getFibonnaci(int n) {
		// Tiempo inicial del sistema en milisegundos
		long startTime = System.currentTimeMillis();
		// Variables para manejar la serie
		BigInteger a = BigInteger.ONE, b = BigInteger.ONE;
		// Contador para evitar pasarse de calidad 
		int count = 0;

		while (count < n) {
			a = a.add(b);
			b = a.subtract(b);

			if (getDigitalSum(a.toString()) > n) {
				System.out.println("El numero " + a
						+ " genera una suma digital de "
						+ getDigitalSum(a.toString()));
				break;
			}
			count++;
		}
		// Se muestra el tiempo invertido
		long endTime = System.currentTimeMillis();		
		System.out.println("Tiempo ms : " + (endTime - startTime));
	}

	/**
	 * Obtiene la suma digital de un numero dado
	 * 
	 * @param number
	 * @return
	 */
	public int getDigitalSum(String number) {
		System.out.println("number : " + number);
		int sum = 0;
		for (int i = 0; i < number.length(); i++) {
			sum += Integer.parseInt("" + number.charAt(i));
		}
		return sum;
	}

}
