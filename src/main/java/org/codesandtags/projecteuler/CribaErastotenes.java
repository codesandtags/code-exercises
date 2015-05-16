package org.codesandtags.projecteuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Criba de Eratostenes (Mejorado)
 * 
 * Generacion de los n primeros primos mediante el algoritmo de la criba de
 * Eratostenes
 * 
 * Requiere Java 5
 */
public class CribaErastotenes {

	public static void main(String[] args) {
		/*
		 * // int n = Integer.parseInt(args[0]); int n =
		 * Integer.parseInt("2000000"); int tope = (int)
		 * Math.floor(Math.sqrt(n)) + 1;
		 * 
		 * List<Long> tablaNumeros = new ArrayList<Long>(); int pos = 0; for
		 * (int i = 2; i <= tope; i++) { if((i&1) == 0) continue; if
		 * (!tablaNumeros.contains(Long.valueOf(i))) { for (int j = i; j <= n /
		 * i + 1; j++) { tablaNumeros.add(Long.valueOf(i * j)); } } }
		 */

		//getCriba(100);
		getTerminos(1000);
	}

	/*
	 * int c = 0; for (pos = 2; pos < n; pos++) { if((pos&1) == 0) continue; if
	 * (!tablaNumeros.contains(Long.valueOf(pos))) System.out.println(++c + ": "
	 * + pos); }
	 */
	public static void getCriba(int n) {
		boolean[] numeros = new boolean[n];
		// esto es pa llenar de true's el array..en vez de hacer el for :P
		Arrays.fill(numeros, true);

		// 1 y 0 no son primos..ni tampoco hermanos ni nada :P
		numeros[0] = false;
		numeros[1] = false;

		// la criba dice que todo numero menor a la raiz de el numero que
		// quieren saber
		for (int i = 2; i <= Math.sqrt((double) numeros.length); i++) {
			if (numeros[i]) {
				for (int k = i * i; k < numeros.length; k += i) {
					numeros[k] = false;
				}
			}
		}

		long suma = 0;
		for (int i = 0; i < numeros.length; i++){
			if (numeros[i]){
				//System.out.println("primo : " + i);
				suma += i;
			}
		}
		System.out.println(" Suma => " + suma);		
	}
	
	public static void getTerminos(int n) {
		boolean[] numeros = new boolean[n];
		// esto es pa llenar de true's el array..en vez de hacer el for :P
		Arrays.fill(numeros, true);

		// 1 y 0 no son primos..ni tampoco hermanos ni nada :P
		numeros[0] = false;
		numeros[1] = false;

		// la criba dice que todo numero menor a la raiz de el numero que
		// quieren saber
		for (int i = 2; i <= Math.sqrt((double) numeros.length); i++) {
			if (numeros[i]) {
				for (int k = i * i; k < numeros.length; k += i) {
					numeros[k] = false;
				}
			}
		}

		int suma = 0;
		int terminos = 0;
		
		
		for (int i = 0; i < numeros.length; i++){
			
			if (numeros[i]){
				//System.out.println("primo : " + i);
				suma = 0;
				
				//Obtiene los primos sumados por debajo del primo
				while(suma < i){
					//Obtiene los primos sumados por debajo del primo
					terminos = 0;
					
					for (int j = 0; j <= i; j++ ) {
						
						if (numeros[j]){
							suma += j;
							terminos++;
							
							//System.out.println("Primo : " + i + " --- actual : " + j + " ---- suma : " + suma);
							if(suma == i){
								System.out.println("Primo : " + i + " Terminos => " + terminos);
							}
						}
					}
				}
				
			}
		}
		
		
		System.out.println(" Suma => " + suma);		
	}
}