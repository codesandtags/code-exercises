package org.codesandtags.utils;

public class Ejemplo {

	public static void main(String[] args) {

		// Genero numeros aleatorios
		for (int i = 0; i < 20; i++) {

			int numero = (int) (Math.random() * 50 + 151);
			System.out.println("=>" + numero);
			
		}

	}
}
