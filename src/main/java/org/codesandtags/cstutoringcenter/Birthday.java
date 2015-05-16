package org.codesandtags.cstutoringcenter;

/**
 * Solucion de la paradoja de los cumpleaños
 * The BirthDay Paradox
 *
 */
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Birthday {
	public static void main(String[] args) throws IOException {
		// Objeto para lectura de datos
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		// Objeto para escritura de datos
		PrintWriter output = new PrintWriter(new OutputStreamWriter(System.out));
		// Los dos objetos anteriores, haciendo una pequeña modificacion en el
		// constructor
		// se puede hacer lectura y escritura de objetos

		String linea = "";

		while ((linea = input.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(linea, " ");
			// Variables de proceso
			double n = Double.parseDouble(st.nextToken());
			double p = 1.0;
			// Variables para el formato de salida
			DecimalFormat df = new DecimalFormat("0.000000");
			DecimalFormatSymbols dfs = new DecimalFormatSymbols();
			dfs.setDecimalSeparator('.');
			df.setDecimalFormatSymbols(dfs);
			// aplicacion de la formula de la paradoja
			for (int i = 1; i <= n; i++) {
				p = p * (366 - i) / 365;
			}
			output.println(df.format(1 - p));
			output.flush();
		}
	}
}
