package org.codesandtags.math;

/**
 * Este metodo es un algoritmo de busqueda de raices que trabaja diviendo el
 * intervalo a la mitad y el subintervalo que tiene la raiz.
 * 
 * Toda funcion continua f en un intervalo cerrado [a,b]. en caso de que f(a) y
 * f(b), tengan signos opuestos, el valor cero seria un valor intermedio entre
 * f(a) y f(b).
 * 
 * El metodo consiste en lo siguiente : 1) Debe existir seguridad sobre la
 * continuidad de la funcion en el intervalo [a,b]. 
 * 2) Se verifica a continuacion que f(a) - f(b) < 0 
 * 3) Se calcula el punto medio m del intervalo [a,b] y se evalua 
 * f(m) si ese valor es igual a cero, ya hemos encontrado la raiz buscada.
 * 4) En caso de que no sea, verificamos si f(m) tiene signo opuesto con 
 * f(a) o con f(b)
 * 5) Se redefine el intervalo [a,b] como [a,m] o [m,b] segun se haya 
 * determinado en cual de estos intervalos ocurre un cambio de signo.
 * 6) Con este nuevo intervalo se continua sucesivamente encerrado la solucion en 
 * un intervalo cada vez mas pequeño, hasta alcanzar la precision deseada. 
 * 
 * http://es.wikipedia.org/wiki/Método_de_bisección
 * 
 * @author CodesandTags
 * 
 */

import static java.lang.Math.*;

public class Biseccion {
	
	public static void main(String[] args) {
		double num = 10e-3;
		System.out.println(num);
		
		System.out.println(5 / 2);
		Biseccion ejemplo = new Biseccion();
		System.out.println(ejemplo.metodoBiseccion(1, 2.2, 10e-3));
		
	}
	
	/**
	 * Esta es la funcion a reemplazar
	 * @param x
	 * @return
	 */
	public double funcion(double x){
		//return (x * x) - 3;
		
		double f = (pow(x, 3) - 9*pow(x, 2) + 25*x)  
				* (1 + pow(sin(x), 2) / 25) + 
				(x * pow(cos(x),2) - 24);
		
		System.out.println(x + "=>" + f);
		return f;
	} 
	
	/**
	 * Metodo de Biseccion el cual le halla las raices de una funciones en un 
	 * intervalo ingresado como  parametro de entrada [a, b] y un el error con 
	 * el cual deseamos hallar nuestra funcion
	 * 
	 * @param a
	 * @param b
	 * @param error
	 * @return
	 */
	public double metodoBiseccion(double a, double b, double error){
		double c = 0.0;
		
		double fa = 0.0;
		double fb = 0.0;
		double fc = 0.0;
		
		//Esta es una validacion para determinar
		if( (funcion(a) * funcion(b)) > 0){
			System.err.println("Error en el intervalo, en ese intervalo no existen raices");
		}else{
			c = (a + b) / (double) 2;
			int iteracion = 1;
			do{
				System.out.println("Iteracion : " + iteracion++);
				//Se obtienen las formulas
				fa = funcion(a);
				fb = funcion(b);
				fc = funcion(c);
				if((fa * fc) > 0){
					a = c;
					fa = funcion(a);
					fb = funcion(b);
					c = (a + b) / (double) 2;
					fc = funcion(c);
				}else if((fb * fc) > 0){
					b = c;
					fa = funcion(a);
					fb = funcion(b);
					c = (a + b) / (double) 2;
					fc = funcion(c);
				}
			}while(Math.abs(fc) >= error);
		}
		return c;
	}
	
}
