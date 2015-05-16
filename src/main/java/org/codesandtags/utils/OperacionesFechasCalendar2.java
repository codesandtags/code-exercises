package org.codesandtags.utils;

import java.util.Calendar;

public class OperacionesFechasCalendar2 {

	public static void main(String[] args) {

		/**
		 * Problemas comunes
		 */

		System.out.println("[ Problemas comunes con Fechas ]\n");

		// Planteamiento de los problemas
		System.out
				.println(" - Cuantos dias han pasado desde el descubrimiento de America ?... ");
		System.out
				.println(" - Cuantas semanas faltan para que sea Navidad ?...");
		System.out
				.println(" - Cuantas horas faltan para que termine el concurso ?...");
		System.out
				.println(" - Cuanto segudos quedan para verte mi niña?...");

		System.out.println("\n>> Datos base para las operaciones ");
		// Dia en que Cristobal Colon Descubrio America
		Calendar descubrimientoAmerica = Calendar.getInstance();
		descubrimientoAmerica.set(1492, 9, 12);

		// Dia en que se celebra Navidad
		Calendar navidad = Calendar.getInstance();
		navidad.set(2011, 11, 24);

		// Fecha de terminacion de un concurso cualquiera
		Calendar finConcurso = Calendar.getInstance();
		finConcurso.set(2012, 9, 20);

		// Fin vacaciones de la mona
		Calendar diaEncuentroMinina = Calendar.getInstance();
		diaEncuentroMinina.set(2012, 9, 21, 8, 0, 0);

		// Dia descubrimiento America
		System.out.println(String.format(
				" Descubrimiento de america : %1$tA %1$td de %1$tB de %1$tY ",
				descubrimientoAmerica.getTime()));

		// Dia de Navidad
		System.out.println(String.format(" Dia de Navidad : %1$td de %1$tB ",
				navidad.getTime()));

		// Fin del concurso
		System.out.println(String.format(" Fin concurso : %1$tY-%1$tm-%1$td",
				finConcurso.getTime()));

		// Fin del concurso
		System.out.println(String.format(
				" Dia en que entra la mona de vacaciones :"
						+ "%1$tY-%1$tm-%1$td %1$th:%1$tM",
				finConcurso.getTime()));

		/**
		 * Descubrimiento de America
		 */
		Calendar fechaActual = Calendar.getInstance();
		long dias = 0;
		// Iterando hasta llegar a la fecha actual
		while (descubrimientoAmerica.compareTo(fechaActual) < 0) {
			// Aumentando de dia
			descubrimientoAmerica.add(Calendar.DATE, 1);
			dias++;
		}
		System.out.println("\n RTA : America se descubrio hace " + dias
				+ " dias!");

		/**
		 * Semanas para navidad
		 */
		int semanas = 0;
		// Iterando hasta llegar a la fecha actual
		while (navidad.compareTo(fechaActual) > 0) {
			// Disminuyendo la semana
			navidad.add(Calendar.WEEK_OF_MONTH, -1);
			semanas++;
		}
		System.out.println(" RTA : Faltan " + semanas
				+ " semanas para navidad!");

		/**
		 * Horas del concurso
		 */
		long horas = 0;
		// Iterando hasta llegar a la fecha actual
		while (finConcurso.compareTo(fechaActual) > 0) {
			// Disminuyendo la hora
			finConcurso.add(Calendar.HOUR, -1);
			horas++;
		}
		System.out.println(" RTA : Faltan " + horas
				+ " horas para que acabe el concurso!");

		/**
		 * Vacaciones de la mona
		 */
		long segundosVacaciones = 0;
		long minutosVacaciones = 0;
		// Iterando hasta llegar a la fecha actual
		
		System.out.println("Si nos encontraramos el " + diaEncuentroMinina.getTime());
		while (fechaActual.compareTo(diaEncuentroMinina) < 0) {
			// Disminuyendo los segundos
			//finVacacionesMona.add(Calendar.MINUTE, 1);
			fechaActual.add(Calendar.MINUTE, 1);
			minutosVacaciones++;
		}
		System.out.println(" faltarian : " + minutosVacaciones
				+ " minutos... :P!");
		

	}
}
