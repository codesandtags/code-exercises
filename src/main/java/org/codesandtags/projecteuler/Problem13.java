package org.codesandtags.projecteuler;

import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class Problem13 {

	public static void main(String[] args) {
		Problem13 solve = new Problem13();
		File input = new File("resources/problem13.euler");
		System.out.println("First ten digits of the sum of the following \n"
				+ "one-hundred 50-digit numbers is : "
				+ solve.sumBigIntegers(input, 10));

	}

	/**
	 * Obtiene la suma de todos los numeros contenidos en un archivo y devuelve
	 * como respuesta los X primeros digitos del resultado
	 * 
	 * @param allDigits
	 * @param firtsDigits
	 * @return
	 */
	public String sumBigIntegers(File allDigits, int firtsDigits) {
		// Para almacenar las sumas
		BigInteger sum = BigInteger.ZERO;
		// Lee el archivo y se proceso con la clase Scanner
		try {
			Scanner sc = new Scanner(allDigits);
			while (sc.hasNext()) {
				// Realiza la suma de cada linea
				sum = sum.add(new BigInteger(sc.next()));
			}
		} catch (Exception e) {
			// Manejo de excepcion por si las moscas
			e.printStackTrace();
		}
		// Hakuna Matata : Devuelve un String con los X primeros digitos
		return sum.toString().substring(0, firtsDigits);
	}

}
