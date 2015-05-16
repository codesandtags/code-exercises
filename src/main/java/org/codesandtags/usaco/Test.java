package org.codesandtags.usaco;

/*
Escribir un programa que lea los numeros enteros especificados en una linea y los sume.
La suma de los numeros debe ser escrita en un archivo nuevo.
 
Archivo entrada : test.in
Archivo salida : test.out  
 */

/*
 ID : etorres1
 LANG : JAVA
 TASK : test 
 */

import java.io.*;
import java.util.*;

public class Test {
	public static void main(String[] args) throws IOException {
		// Objeto para lectura de archivos
		BufferedReader filein = new BufferedReader(new FileReader(
				"test.in"));
		// Objeto para escritura de archivos
		PrintWriter fileout = new PrintWriter(new FileWriter(
				"test.out"));
		// Objeto String para almacenar linear
		String line;

		while ((line = filein.readLine()) != null) {
			// Objeto para partir las lineas segun el token
			StringTokenizer st = new StringTokenizer(line);
			// Variable donde quedaran sumados los nums
			long sum = 0;

			// Recorrido de todos los tokens de una linea
			while (st.hasMoreElements()) {
				sum += Integer.parseInt(st.nextToken());
			}

			// Escritura de la suma de los numeros en el archivo
			fileout.println(sum);
		}
		// Envio todos los stream al archivo
		fileout.flush();
		// Cierre del archivo
		fileout.close();

		//System.out.println("Hakuna Matata!");
	}
}
