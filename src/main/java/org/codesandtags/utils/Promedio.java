package org.codesandtags.utils;

//Programa del promedio de una clase mediante la repetici�n controlada por centinela.
import java.text.DecimalFormat; // clase para dar formato a los n�meros
import javax.swing.JOptionPane;

public class Promedio {
	public static void main(String args[]) {
		int total; // suma de las calificaciones
		int contadorCalif; // n�mero de calificaciones introducidas
		int calificacion; // valor de la calificaci�n
		double promedio; // n�mero con punto decimal para el promedio
		String cadenaCalif; // calificaci�n introducida por el usuario

		// fase de inicializaci�n
		total = 0; // incializar el total
		contadorCalif = 0; // inicializar contador de ciclo

		// fase de procesamiento
		// obtener la primera calificaci�n del usuario
		cadenaCalif = JOptionPane
				.showInputDialog("Escriba calificaci�n como entero o -1 para salir:");

		// convertir cadenaCalif en int
		calificacion = Integer.parseInt(cadenaCalif);

		// iterar hasta que el usuario introduzca el valor centinela
		while (calificacion != -1) {
			total = total + calificacion; // sumar calificacion al total
			contadorCalif = contadorCalif + 1; // incrementar el contador
			// obtener siguiente calificaci�n del usuario
			cadenaCalif = JOptionPane
					.showInputDialog("Escriba calificaci�n como entero o -1 para salir:");
			// convertir cadenaCalif en int
			calificacion = Integer.parseInt(cadenaCalif);
		}

		// fase de terminaci�n
		DecimalFormat dosDigitos = new DecimalFormat("0.00");
		// si el usuario introdujo al menos una calificaci�n...
		if (contadorCalif != 0) {
			// calcular el promedio de todas las calificaciones introducidas
			promedio = (double) total / contadorCalif;
			// mostrar el promedio con dos d�gitos de precisi�n
			JOptionPane.showMessageDialog(null, "El promedio de la clase es "
					+ dosDigitos.format(promedio), "Promedio de la clase",
					JOptionPane.INFORMATION_MESSAGE);
		} // fin de la parte if de la instrucci�n if...else
		else {
			// si no se introdujeron calificaciones, imprimir el mensaje
			// apropiado
			JOptionPane.showMessageDialog(null,
					"No se introdujeron calificaciones",
					"Promedio de la clase", JOptionPane.INFORMATION_MESSAGE);
		}
		System.exit(0); // terminar la aplicaci�n
	} // fin de main
} // fin de la clase Promedio