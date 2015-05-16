package org.codesandtags.ejercicios;

/**
 * Leer un número y determinar si es múltiplo de tres.
 * 
 * http://codesandtags.org
 */

import java.util.Scanner;

public class MultiploTres {

	public static void main(String[] args) {

		// Objeto para la lectura de datos
		Scanner sc = new Scanner(System.in);
		int numero = 0;
		
		System.out.println(Math.abs(200 - 211) <= 10);

		do {
			// Ingreso del numero
			System.out.print("Ingrese un numero : ");
			numero = sc.nextInt();

			// Validacion del numero y resultado
			MultiploTres ejemplo = new MultiploTres();
			ejemplo.validarMultiplo(numero);

			// Mientras que el numero sea diferente de cero sigue pidiendo
			// numeros
		} while (numero != 0);

	}

	/**
	 * Metodo que valida el multiplo de un numero, simplemente se necesita
	 * realizar un mod para obtener el multiplo de cualquier numero
	 * 
	 * @param n
	 */
	public void validarMultiplo(int n) {
		if (n % 3 == 0) {
			System.out.println("El numero " + n + " es multiplo de 3");
		} else {
			System.out.println("El numero " + n + " NO es multiplo de 3");
		}
	}
}
