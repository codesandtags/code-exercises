package org.codesandtags.projecteuler;

/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * 
 * Find the sum of all the primes below two million.
 * 
 * @author codesandtags
 * 
 */
public class Problem10 {

	public static void main(String[] args) {
		Problem10 solve = new Problem10();
		System.out.println("The sum of all the primes below 10 is : "
				+ solve.getSumAllPrimes(10));
		System.out.println("The sum of all the primes below two million is : "
				+ solve.getSumAllPrimes(2000000));
	}

	/**
	 * Permite obtener la suma de todos los numeros primos inferiores a un N
	 * numero dado. Para operar con este metodo se emplea un arreglo que
	 * contiene un flag, el cual al momento de terminar de operar con la criba
	 * todos los indices que sean false, representaran un numero primo
	 * 
	 * @param n
	 * @return
	 */
	public long getSumAllPrimes(int n) {
		// Para guardar las sumas
		long sum = 0;
		// Para almacenar los indices de los numeros primos
		boolean[] numeros = new boolean[n];
		// Como 0 y 1 no son numeros primos, entonces se cambia
		// Su condicion a true
		numeros[0] = numeros[1] = true;

		// Para poder utilizar la criba se debe tomar el numero N dado
		// y obtener su raiz cuadrada, la cual representa la cantidad de
		// iteraciones a realizar para operar.
		for (int i = 2; i <= Math.sqrt((double) numeros.length); i++) {
			// Se obtiene la criba de Erastotenes y se hace magia
			if (!numeros[i])
				for (int k = i * i; k < numeros.length; k += i)
					numeros[k] = true;

		}

		// Se realiza la suma de todos los numeros primos
		for (int i = 0; i < numeros.length; i++)
			if (!numeros[i])
				sum += i;

		return sum;
	}

}
