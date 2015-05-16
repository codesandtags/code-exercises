package org.codesandtags.ejercicios;

/**
 * Clase que se encarga de mostrar un ejemplo de los diferentes recorridos de
 * una matriz / arreglo bidimensional
 * 
 * http://codesandtags
 */

public class Arreglos {
	public static void main(String[] args) {
		// Declaracion del arreglo bidimensional : Cuadrado
		int[][] matriz = new int[5][5];

		// Lleno el arreglo
		for (int i = 0; i < matriz.length; i++) {
			for (int m = 0; m < matriz[0].length; m++) {
				matriz[i][m] = (int) (Math.random() * 100);
			}
		}

		// Mostrando el arreglo completo
		System.out.println("\n Mostrando arreglo completo : ");
		for (int i = 0; i < matriz.length; i++) {
			for (int m = 0; m < matriz[0].length; m++) {
				System.out.print(" " + matriz[i][m]);
			}
			System.out.println("");
		}

		// Recorriendo columnas de derecha a izquierda
		System.out.println("\n Recorriendo de derecha a izquierda : ");
		for (int i = 0; i < matriz.length; i++) {
			for (int m = matriz[0].length - 1; m >= 0; m--) {
				System.out.print(" " + matriz[i][m]);
			}
			System.out.println("");
		}

		// Recorriendo filas de abajo hacia arriba
		System.out.println("\n Recorriendo de abajo a arriba : ");
		for (int i = matriz.length - 1; i >= 0; i--) {
			for (int m = 0; m < matriz[0].length; m++) {
				System.out.print(" " + matriz[i][m]);
			}
			System.out.println("");
		}

		// Recorriendo de filas de abajo a arriba y de derecha a izquierda
		System.out
				.println("\n Recorriendo de abajo a arriba y columnas de derecha a izquierda : ");
		for (int i = matriz.length - 1; i >= 0; i--) {
			for (int m = matriz[0].length - 1; m >= 0; m--) {
				System.out.print(" " + matriz[i][m]);
			}
			System.out.println("");
		}

		// Recorrido de la diagonal principal arriba hacia abajo
		// Solo matrices cuadradas
		System.out
				.println("\n Recorriendo la diagonal principal arriba hacia abajo : ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(" " + matriz[i][i]);
		}
		System.out.println("");

		// Recorrido de la diagonal principal abajo hacia arriba
		// Solo matrices cuadradas
		System.out
				.println("\n Recorriendo la diagonal principal de abajo hacia arriba: ");
		for (int i = matriz.length - 1; i >= 0; i--) {
			System.out.print(" " + matriz[i][i]);
		}
		System.out.println("");

		// Recorrido de la diagonal principal arriba hacia abajo
		// Solo matrices cuadradas
		System.out
				.println("\n Recorriendo la diagonal secundaria arriba hacia abajo : ");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(" " + matriz[i][matriz.length - 1 - i]);
		}
		System.out.println("");

		// Recorrido de la diagonal principal arriba hacia abajo
		// Solo matrices cuadradas
		System.out
				.println("\n Recorriendo la diagonal secundaria abajo hacia arriba : ");
		for (int i = matriz.length - 1; i >= 0; i--) {
			System.out.print(" " + matriz[i][matriz.length - 1 - i]);
		}
		System.out.println("");
	}
}
