package org.codesandtags.utils;

import java.util.Calendar;

public class OperacionesFechasCalendar {

	public static void main(String[] args) {

		/**
		 * Definiendo fechas
		 */
		System.out.println("[ Definiendo Fechas ]\n");
		//Instancia a calendar
		Calendar fecha = Calendar.getInstance();
		
		//Imprimiendo fecha actual
		System.out.println(String.format("Fecha actual: %1$tY-%1$tm-%1$td",
				fecha.getTime()));
		
		//Cambiando de fecha
		fecha.set(2011, 8, 28);
		System.out.println(String.format("He cambiado la fecha a : %1$tY-%1$tm-%1$td",
				fecha.getTime()));

		//Modificando el mes
		fecha.set(Calendar.MONTH, 9);
		System.out.println(String.format("He cambiado el mes  : %1$tY-%1$tm-%1$td",
				fecha.getTime()));
		
		//Modificando el anio
		fecha.set(Calendar.YEAR, 2010);
		System.out.println(String.format("He cambiado el anio a : %1$tY-%1$tm-%1$td",
				fecha.getTime()));
		
		/**
		 * Realizando Operaciones
		 */
		
		System.out.println("\n[ Operando con Fechas ]\n");
		//Sumando dias
		System.out.println(String.format("Fecha antes de la suma de dias : %1$tY-%1$tm-%1$td",
				fecha.getTime()));
		fecha.add(Calendar.DATE, 35);
		System.out.println(String.format("He sumado 35 dias y ahora tengo : %1$tY-%1$tm-%1$td",
				fecha.getTime()));
		
		//Restando meses
		System.out.println(String.format("Fecha antes de la resta de anios : %1$tY-%1$tm-%1$td",
				fecha.getTime()));
		fecha.add(Calendar.YEAR, -5);
		System.out.println(String.format("He restado 5 anios y ahora tengo : %1$tY-%1$tm-%1$td",
				fecha.getTime()));
		
		//Sumando horas
		System.out.println(String.format("Fecha antes de la suuma de horas : %1$tY-%1$tm-%1$td",
				fecha.getTime()));
		fecha.add(Calendar.HOUR, 1200);
		System.out.println(String.format("He sumado 1200 horas y ahora tengo : %1$tY-%1$tm-%1$td",
				fecha.getTime()));
		
		/**
		 * Comparando fechas
		 */
		
		System.out.println("\n[ Comparando varias fechas ]\n");
		
		Calendar fecha1 = Calendar.getInstance();
		Calendar fecha2 = Calendar.getInstance();
		fecha2.set(2011,11, 31);
		Calendar fecha3 = Calendar.getInstance();
		fecha3.set(2005,3,15);
		
		//Imprimo la fecha 1
		System.out.println(String.format("Fecha 1 : %1$tY-%1$tm-%1$td",
				fecha1.getTime()));
		//Imprimo la fecha 2
		System.out.println(String.format("Fecha 2 : %1$tY-%1$tm-%1$td",
				fecha2.getTime()));
		//Imprimo la fecha 3
		System.out.println(String.format("Fecha 3 : %1$tY-%1$tm-%1$td",
				fecha3.getTime()));
	
		System.out.println("\n[ Resultados de la comparacion ]\n");
		System.out.println(compararFechas(fecha1, fecha2));
		System.out.println(compararFechas(fecha2, fecha1));
		System.out.println(compararFechas(fecha1, fecha3));
		System.out.println(compararFechas(fecha2, fecha3));
		System.out.println(compararFechas(fecha1, fecha1));
		
		
	}
	
	/**
	 * Metodo que compara 2 fechas y muestra el resultado
	 * @param fecha1
	 * @param fecha2
	 * @return
	 */
	public static String compararFechas(Calendar fecha1, Calendar fecha2){
		if(fecha1.compareTo(fecha2) < 0){
			return "Comparacion : " + (String.format("%1$tY-%1$tm-%1$td", fecha1)) + 
					" es menor a " + (String.format("%1$tY-%1$tm-%1$td", fecha2));
		}else if(fecha1.compareTo(fecha2) > 0){
			return "Comparacion : " + (String.format("%1$tY-%1$tm-%1$td", fecha1)) + 
					" es mayor a " + (String.format("%1$tY-%1$tm-%1$td", fecha2));
		}else{
			return "Comparacion : Las fechas son iguales " 
					+ (String.format("%1$tY-%1$tm-%1$td", fecha2));
		}
	}
}
