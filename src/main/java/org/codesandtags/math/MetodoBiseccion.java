package org.codesandtags.math;

public class MetodoBiseccion implements Funcion {

	private double a;
	private double b;
	private int iteraciones;
	private double error;

	public static void main(String[] args) {

		// Instanciacion y configuracion de nuestro ejercicio
		MetodoBiseccion biseccion = new MetodoBiseccion();
		biseccion.setIntervalo(0, 1);
		biseccion.setIteraciones(6);
		biseccion.setError(10e-4);
		biseccion.solucion();

	}

	public double funcion(double x) {
		double resultado = Math.pow((Math.E), x) - (3 * x);
		//System.out.println("   x = " + x + " : " + resultado);
		return resultado;
	}

	/**
	 * Solucion del Metodo de Biseccion
	 */
	public void solucion() {
		System.out.println("Intervalo : [" + a + ", " + b + "]");
		System.out.println("Error : " + error);
		System.out.println("Iteraciones : " + iteraciones);
		System.out
				.println("------------------------------------------------ \n");

		double c = 0;
		double fa = 0;
		double fb = 0;
		double fc = 0;
		int iteracion = 1;

		do {
			// Aqui esta la magia
			c = (a + b) / 2;

			System.out.println("Iteracion (" + iteracion + ") : " + c);
			fa = funcion(a);
			fb = funcion(b);
			fc = funcion(c);

			if (fc * fa < 0) {
				b = c;
				fa = funcion(a);
				fb = funcion(b);
				c = (a + b) / 2;
				fc = funcion(c);
			} else {
				a = c;
				fa = funcion(a);
				fb = funcion(b);
				c = (a + b) / 2;
				fc = funcion(c);
			}
			iteracion++;
			// Itera mientras se cumpla la cantidad de iteraciones establecidas
			// y la funcion se mantenga dentro del margen de error
		} while (iteracion <= iteraciones && Math.abs(fc) >= error);

	}

	/**
	 * Definicion del intervalo
	 * 
	 * @param a
	 * @param b
	 */
	public void setIntervalo(double a, double b) {
		this.a = a;
		this.b = b;
	}

	/**
	 * Definicion de las iteraciones
	 * 
	 * @param iteraciones
	 */
	public void setIteraciones(int iteraciones) {
		this.iteraciones = iteraciones;
	}

	/**
	 * Definicion del margen de error
	 * 
	 * @param error
	 */
	public void setError(double error) {
		this.error = error;
	}

}
