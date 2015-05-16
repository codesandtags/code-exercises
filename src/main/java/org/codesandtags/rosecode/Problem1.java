package org.codesandtags.rosecode;

import java.math.BigInteger;

/***
 * un número primo es un número natural mayor que 1 que tiene únicamente dos
 * divisores distintos: él mismo y el 1. Los números primos se contraponen así a
 * los compuestos, que son aquellos que tienen algún divisor natural aparte de
 * sí mismos y del 1. El número 1, por convenio, no se considera ni primo ni
 * compuesto. (Wikipedia).
 * 
 * Aunque existe diferentes formas de hallar los numeros primos en este codigo
 * muestra un ejemplo de como obtener los probables numeros primos utilizando
 * BigInteger. La implementacion es muy facil y por lo general es util para las
 * maratones de programacion y retos varios
 * 
 * @author Codes and Tags
 * 
 */
public class Problem1 {
	public static void main(String args[]) {
		// Instancia al objeto
		Problem1 solve = new Problem1();
		// Se obtienen varios numeros primos con el tiempo para el ejemplo
		solve.getNumberPrime(1);
		solve.getNumberPrime(2);
		solve.getNumberPrime(10000);
		solve.getNumberPrime(78300);
	}

	/***
	 * Obtiene el un numero primo ordinal dado. Por ejemplo el primer numero
	 * primo ordinal es el 2, el segundo es el 3, el 10000 es el 104729
	 * Adicionalmente muestra el tiempo consumido para encontrar el numero
	 * primo.
	 * 
	 * @return numero
	 */
	public void getNumberPrime(int numberth) {
		// Tiempo inicial del sistema en milisegundos
		long startTime = System.currentTimeMillis();
		// BigInteger para utilizar el metodo nextProbablePrime
		BigInteger number = BigInteger.ONE;
		// Se obtiene el numero th
		for (int i = 0; i < numberth; i++) {
			number = number.nextProbablePrime();
		}
		// Tiempo final del sistema en milisegundos
		long endTime = System.currentTimeMillis();
		// Se nuestra el resultado
		System.out.println(numberth + "th : " + number);
		System.out.println("Tiempo ms : " + (endTime - startTime));
	}
}
