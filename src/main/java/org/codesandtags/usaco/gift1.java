package org.codesandtags.usaco;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
ID : ***** 
LANG : JAVA
TASK : gift1

http://codesandtags.org
*/

public class gift1 {

	//Variables de la clase :P
	public static String[] personas;
	public static int[] dineroPersonas;
	public static String[][] regaloPersonas;

	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new FileReader("resources/gift1.in"));
		PrintWriter output = new PrintWriter(new FileWriter("resources/gift1.out"));
		String linea = null;

		// Numero de personas en el grupo
		int np = Integer.parseInt(input.readLine());

		// Inicializacion de los datos
		personas = new String[np];
		dineroPersonas = new int[np];
		regaloPersonas = new String[np][];

		// Ingreso de las personas
		for (int i = 0; i < np; i++) {
			personas[i] = input.readLine();

		}
		// Ingreso del dinero de cada persona y se tiene en cuenta
		// A quienes les van a regalar dinero
		int dinero = 0, regalos = 0, idxPersona = 0;
		// Itera mientras se lean las cinco personas
		while (np > 0) {
			linea = input.readLine();
			// Busca el indice de la persona a la que se le cargaran datos
			idxPersona = buscarPersona(linea);
			// Ingreso de los datos para cada persona
			if (personas[idxPersona].equals(linea)) {
				StringTokenizer st = new StringTokenizer(input.readLine());
				dinero = Integer.parseInt(st.nextToken());
				regalos = Integer.parseInt(st.nextToken());
				// Ingreso de dinero para la persona que se esta leyendo
				dineroPersonas[idxPersona] = dinero;
				// Ingreso de nombres de las personas a las que se les regala
				// dinero
				regaloPersonas[idxPersona] = new String[regalos];
				for (int j = 0; j < regalos; j++) {
					regaloPersonas[idxPersona][j] = input.readLine();
				}
			}
			np--;
		}

		int[] dineroPersonasBase = (int[]) dineroPersonas.clone();
		// Dejo las cuentas en cero
		dineroPersonas = new int[dineroPersonasBase.length];

		// Solucion del ejercicio
		for (int i = 0; i < personas.length; i++) {
			// Si la persona no le regala a nadie continua el ciclo
			if (regaloPersonas[i].length == 0 || dineroPersonasBase[i] == 0) {
				continue;
			}
			// Cantidad de dinero a regalar
			int dineroRegalar = (int) (dineroPersonasBase[i] / regaloPersonas[i].length);
			dineroPersonas[i] -= (dineroRegalar * regaloPersonas[i].length);

			for (int j = 0; j < regaloPersonas[i].length; j++) {
				// Obtengo la persona a la que se le regala dinero
				String nombresPersona = regaloPersonas[i][j];
				idxPersona = buscarPersona(nombresPersona);
				dineroPersonas[idxPersona] += dineroRegalar;
			}
		}

		// Impresion de datos
		for (int i = 0; i < personas.length; i++) {
			output.println(personas[i] + " " + dineroPersonas[i]);
		}
		output.flush();
		output.close();
		System.exit(0);
	}

	/**
	 * Busca el indice de una persona
	 * 
	 * @param persona
	 * @return
	 */
	public static int buscarPersona(String persona) {
		for (int i = 0; i < personas.length; i++) {
			if (persona.equals(personas[i])) {
				return i;
			}
		}
		return 0;
	}
}
