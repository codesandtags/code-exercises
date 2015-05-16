package org.codesandtags.ejercicios;

import java.io.*;

/**
 * Determinar orden ascendente o descendente
 * 
 * @author codesandtags
 * 
 */
public class AscendenteDescendente {

	public static void main(String[] args) throws IOException,
			InterruptedException {

		// Crea el objeto input para capturar datos por teclado
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		int x, y;

		// Instancia de la clase
		AscendenteDescendente resultado = new AscendenteDescendente();

		// Obteniendo datos por teclado
		System.out.println("DATOS POR TECLADO \n");
		System.out.print("Ingrese un número:  ");
		x = Integer.parseInt(input.readLine()); // Conversión a int
		System.out.print("Ingrese un número:  ");
		y = Integer.parseInt(input.readLine()); // Conversión a int

		// Resultado de la validacion
		resultado.validar(x, y);

		// Validacion de varios numeros
		Thread.sleep(5000);

		// Enviando parametros arbitrarios
		resultado.validar(2, 5);
		resultado.validar(6, 3);
		resultado.validar(-1, 0);
		resultado.validar(3, -2);
		resultado.validar(0, 0);

	}

	/**
	 * Metodo que valida si se encuentran en orden acendente o decendente
	 * 
	 * @param int n numero1
	 * @param int m numero2
	 */
	public void validar(int n, int m) {
		// Se valida que el numero n sea mayor
		if (n > m)
			System.out.println("DESCENDENTE  " + n + " , " + m);
		else if (m > n)
			System.out.println("ASCENDENTE  " + n + " , " + m);
		else
			System.out.println("IGUALES  " + n + " , " + m);
	}

}
