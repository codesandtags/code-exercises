package org.codesandtags.projecteuler;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Esta clase muestra un ejemplo del como obtener una raiz cuadrada, basandose
 * en el metodo de NewtonRaphson. La implementacion de este numero
 * 
 * @author codesandtags
 * 
 *         Explicacion del metodo NewtonRaphson Referencias :
 *         http://es.scribd.com/doc/15638680/Metodo-de-NewtonRaphson
 * 
 */
public class NewtonRaphsonBigDecimal {

	public static void main(String[] args) throws IOException {

		// Objeto para lectura por teclado
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		// Variables
		double numero = 0.0;
		String numeroBig = null;
		int precision = 0;

		// Instancia a la clase
		NewtonRaphsonBigDecimal resultado = new NewtonRaphsonBigDecimal();

		System.out.println(" ------ Calculando raices double -------");
		// Numero a calcular
		System.out.print("\nIngrese numero : ");
		numero = Double.parseDouble(input.readLine());
		// Precision de la raiz
		System.out.print("Ingrese precision : ");
		precision = Integer.parseInt(input.readLine());

		// Se obtiene la raiz
		System.out.println("Raiz : " + resultado.getRaiz(numero, precision));

		// Haciendo magia con 5 numeros aleatorios
		for (int i = 0; i < 5; i++) {
			numero = Math.floor(Math.random() * 500);
			precision = (int) Math.floor(Math.random() * 15 + 1);
			System.out
					.println("Raiz : " + resultado.getRaiz(numero, precision));
		}

		System.out
				.println("\n ------ Calculando raices double BigDecimal -------");
		// Numero a calcular
		System.out.print("\nIngrese numero gigante : ");
		numeroBig = input.readLine();
		// Precision de la raiz
		System.out.print("Ingrese precision : ");
		precision = Integer.parseInt(input.readLine());

		// Se obtiene la raiz
		System.out.println("Raiz : "
				+ resultado.getRaizBigDecimal(numeroBig, precision));

	}

	/**
	 * Obtiene una raiz con el metodo de Newton - Raphson, teniendo en cuenta la
	 * precision de la raiz a obtener
	 * 
	 * Formula = raiz - (raiz^2 - numero) / (2 * raiz)
	 * 
	 * @param numero
	 * @param precision
	 * @return
	 */
	public double getRaiz(double numero, int precision) {
		System.out.println("\nObteniendo raiz cuadrada para el numero ["
				+ numero + "] y precision + [" + precision + "]");
		if (numero <= 0) {
			System.err.println("ERROR : No se puede obtener raices negativas");
			return 0;
		}

		double raiz = 1;
		for (int i = 0; i < precision; i++) {
			raiz = raiz - (Math.pow(raiz, 2) - numero) / (2 * raiz);
		}

		return raiz;
	}

	/**
	 * Obtiene una raiz con el metodo de Newton - Raphson para numberos
	 * BigDecimal, teniendo en cuenta la precision de la raiz a obtener
	 * 
	 * Formula = raiz - (raiz^2 - numero) / (2 * raiz)
	 * 
	 * @param numero
	 * @param precision
	 * @return
	 */
	public String getRaizBigDecimal(String numero, int precision) {
		System.out
				.println("\nObteniendo raiz cuadrada Bigdecimal para el numero ["
						+ numero + "] y precision + [" + precision + "]");

		BigDecimal bigNumero = new BigDecimal(numero);
		BigDecimal raiz = BigDecimal.ONE;
		BigDecimal raizTemp = null;

		if (bigNumero.compareTo(BigDecimal.ZERO) < 1) {
			System.err.println("ERROR : No se puede obtener raices negativas");
			return "0";
		}

		for (int i = 0; i < precision; i++) {
			// Se guarda el valor temporal de la raiz para operar mas adelante
			raizTemp = raiz;

			// Factor a = (raiz^2 - 2)
			raiz = raiz.pow(2).subtract(bigNumero);
			// Factor b = Factor a / (2 * raiz)
			// Aqui se utiliza RoundingMode.HALF_UP, para evitar valores
			// infinitos y la excepcion generada en tiempo de ejecucion
			// "Non-terminating decimal expansion no exact representable
			// decimal result" y 10 decimales
			raiz = raiz.divide(raizTemp.multiply(BigDecimal.valueOf(2)), 10,
					RoundingMode.HALF_UP);
			// raiz - Factor b
			raiz = raizTemp.subtract(raiz);
		}

		return raiz.toString();
	}

}
