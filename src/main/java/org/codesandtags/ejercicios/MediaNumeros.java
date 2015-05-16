package org.codesandtags.ejercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Desarrollar un algoritmo que calcule la media de N números ingresados por
 * teclado
 * 
 * @author codesandtags
 * 
 */
public class MediaNumeros {

	public static void main(String[] args) {

		// Objeto para lectura de datos por teclado
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		// Variables de control
		int[] numeros = new int[0];
		int cantidad = 0;

		// Control de la excepcion para que no se ingresen datos no numericos
		try {
			// Solicitud de la cantidad e inicializacion del arreglo
			System.out.print("Ingrese cantidad de numeros a procesar : ");
			cantidad = Integer.parseInt(input.readLine());
			numeros = new int[cantidad];

			// Ingreso de los numeros
			for (int i = 0; i < cantidad; i++) {
				System.out.print("Ingrese numero[" + (i + 1) + "] : ");
				numeros[i] = Integer.parseInt(input.readLine());
			}

		} catch (Exception e) {
			System.err
					.println("\nERROR : El valor ingresado no es un numero entero");
		}

		// Instanciacion y envio de los numeros para obtener la media
		MediaNumeros resultado = new MediaNumeros();
		System.out.println("La media de los numeros es : "
				+ resultado.getMedia(numeros));
	}

	/**
	 * Obtiene la media de un arreglo de numeros ingresados
	 * 
	 * @param numeros
	 * @return
	 */
	public float getMedia(int[] numeros) {
		float media = 0f;
		for (int i = 0; i < numeros.length; i++) {
			media += numeros[i];
		}
		System.out.println("Total numeros : " + numeros.length);
		return (media / numeros.length);
	}

}
