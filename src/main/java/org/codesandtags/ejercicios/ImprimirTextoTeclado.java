package org.codesandtags.ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Desarrollar un algoritmo que imprima N veces un texto ingresado por teclado.
 * 
 * @author codesandtags
 */
public class ImprimirTextoTeclado {

	public static void main(String[] args) throws IOException {

		// Creacion del Objeto BufferedReader para lectura por teclado
		BufferedReader teclado = new BufferedReader(new InputStreamReader(
				System.in));

		System.out
				.println("\n ------ Imprime N veces un texto ingresado por teclado ----- \n");
		// Ingreso de datos por teclado
		System.out.print("Ingrese texto : ");
		String texto = teclado.readLine();
		System.out.print("Ingrese numero de veces : ");
		int veces = Integer.parseInt(teclado.readLine());

		// Instanciacion y llamado al metodo que imprime
		ImprimirTextoTeclado resultado = new ImprimirTextoTeclado();
		resultado.imprimirTexto(texto, veces);

	}

	/**
	 * Imprime N cantidad de veces un texto por pantalla
	 * 
	 * @param texto
	 * @param veces
	 */
	public void imprimirTexto(String texto, int veces) {

		for (int i = 1; i <= veces; i++) {
			System.out.println(i + ". " + texto);
		}
	}
}
