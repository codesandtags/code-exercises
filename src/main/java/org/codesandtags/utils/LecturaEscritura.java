package org.codesandtags.utils;

/**
 * 1) Lectura
 * 2) Tratamiento de datos
 * 3) Escritura
 * 
 * @author DmK
 *
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class LecturaEscritura {
	
	public static void main(String[] args) throws IOException{
		
		//Creacion objetos para entrada y salida
		BufferedReader entrada = new BufferedReader(new FileReader("e:\\numeros.txt"));
		PrintWriter salida = new PrintWriter("e:\\sumas.txt");
		
		//Recorrido del archivo
		String linea = null;
		/*
		while( (linea = entrada.readLine()) != null ){
			int suma = 0;
			//Manejo de datos - lineas utilizando Split
			String[] numeros = linea.split(" ");
			//System.out.println("Tamano arreglo : " + numeros.length);
			
			//Recorrido de la linea y suma de los numeros
			for (int i = 0; i < numeros.length; i++) {
				suma += Integer.parseInt(numeros[i]);
			}
			//Escritura de datos
			salida.println(linea + " = " + suma);
		}
		*/
		
		while( (linea = entrada.readLine()) != null ){
			int suma = 0;
			//Manejo de datos - lineas utilizando StringTokenizer
			StringTokenizer st = new StringTokenizer(linea);
			
			//Recorrido de los token
			while(st.hasMoreTokens()){
				suma += Integer.parseInt(st.nextToken());
			}
			
			salida.println(linea + " = " + suma);
		}
		
		//Envio de Streams y cierre del archivo
		salida.flush();
		salida.close();
		
		System.out.println("Fin!");
	}
}
