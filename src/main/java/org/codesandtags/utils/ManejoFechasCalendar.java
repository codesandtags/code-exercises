package org.codesandtags.utils;

import java.util.Calendar;

/**
 * Clase de ejemplo para el manejo de fechas en Java
 *  
 * @author [d-m-k] 
 * http://codesandtags.org
 */

public class ManejoFechasCalendar {
	public static void main(String[] args) {
		// Se obtiene una instancia a la clase Calendar
		Calendar fecha = Calendar.getInstance();

		/**
		 * Obteniendo la fecha actual
		 */
		System.out.println("[ Imprimiendo fechas ]\n");

		// 1. Obtiene la fecha actual con el formato Estandar
		System.out.println("Fecha actual : " + fecha.getTime());

		// 2. Obtiene la fecha actual en milisegundos desde el Ene. 1 de 1970
		System.out.println("Fecha actual en milisegundos : "
				+ fecha.getTimeInMillis());

		// 3. Obtiene la fecha actual utilizando zona horaria
		System.out.println("Fecha actual con zona horaria : "
				+ fecha.getTimeZone());

		// 4. Obtiene la fecha personalizada con el metodo format de String
		String fechaPersonalizada = String.format("%1$tY-%1$tm-%1$td",
				fecha.getTime());
		System.out.println("Fecha personalizada : " + fechaPersonalizada);

		// 5. Obtiene la Fecha personalizada con nombres en espaniol
		// Arreglo con los nombres de los meses del anio
		String[] mes = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre",
				"Diciembre" };
		// Arreglo con los nombres de los dias de la semana
		String[] diaSemana = { "Domingo", "Lunes", "Martes", "Miercoles",
				"Jueves", "Viernes", "Sabado" };
		// Formato de salida de la fecha
		fechaPersonalizada = "Hoy es "
				+ diaSemana[fecha.get(Calendar.DAY_OF_WEEK) - 1] + " "
				+ fecha.get(Calendar.DATE) + " de "
				+ mes[fecha.get(Calendar.MONTH)] + " del anio "
				+ fecha.get(Calendar.YEAR);
		System.out.println("Fecha personalizada : " + fechaPersonalizada);

		// 6. Hora actual utilizando el metodo format de String
		fechaPersonalizada = String.format("%1$tT", fecha.getTime());
		System.out.println("Hora actual : " + fechaPersonalizada);
	}
}
