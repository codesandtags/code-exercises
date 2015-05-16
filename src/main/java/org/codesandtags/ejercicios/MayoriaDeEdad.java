package org.codesandtags.ejercicios;

import java.util.Calendar;

public class MayoriaDeEdad {
	
	//Constante de la edad
	private final int mayorEdad = 18;

	/**
	 * Determina si es mayor de edad
	 * @param edad
	 * @return
	 */
	public boolean esMayorDeEdad(int anioNacimiento){
		
		//Obtengo el anio actual
		Calendar fecha = Calendar.getInstance();
		int anioActual = fecha.get(Calendar.YEAR);
		
		//Calculo para determinar si es mayor de edad
		return ( (anioActual - anioNacimiento) >= mayorEdad);
	}
	
	public static void main(String[] args){
		MayoriaDeEdad ejemplo = new MayoriaDeEdad();
		
		System.out.println("Juan nacio en 1990 ¿Es mayor de edad? : " 
				+ ejemplo.esMayorDeEdad(1990));
		System.out.println("Angela nacio en 1988 ¿Es mayor de edad? : " 
				+ ejemplo.esMayorDeEdad(1988));
		System.out.println("Carlos nacio en 1995 ¿Es mayor de edad? : " 
				+ ejemplo.esMayorDeEdad(1995));
		System.out.println("Viviana nacio en 1994 ¿Es mayor de edad? : " 
				+ ejemplo.esMayorDeEdad(1994));
	}

}
