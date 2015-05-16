package org.codesandtags.usaco;

/**
ID : etorres1
LANG : JAVA
TASK : friday
**/

import java.io.FileWriter;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Calendar;

public class friday {
	
	//Frecuencia de dias 13, para cada dia de la semana
	public static int[] frecuenciaDias = new int[7];
	public static Calendar fecha = Calendar.getInstance();
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader input = new BufferedReader(new FileReader("resources/friday.in"));
		PrintWriter output = new PrintWriter(new FileWriter("resources/friday.out"));
		String linea = null;
		
		//Configuracion de las fechas del calendario
		fecha.set(Calendar.YEAR, 1900);
		fecha.set(Calendar.MONTH, 0);
		fecha.set(Calendar.DATE, 1);
		
		//Lectura de todo el archivo e ingreso de anios
		while( (linea = input.readLine()) != null ){
			int anios = Integer.parseInt(linea);
			//Solucion de los anios ingresados
			calcularFrecuencia13(anios);
			//Escritura de datos
			String respuesta = "";
			for (int i = 0; i < frecuenciaDias.length; i++) {
				respuesta += frecuenciaDias[i] + " ";
			}
			output.println(respuesta.substring(0, respuesta.length()-1));
		}
		//Envio de Streams y cierre del archivo
		output.flush();
		output.close();
	}
	
	public static void calcularFrecuencia13(int anios){
		//Anios a procesar
		anios = fecha.get(Calendar.YEAR) + anios;
		int i;
		for ( i = 0; fecha.get(Calendar.YEAR) < anios; i++) {
			fecha.add(Calendar.DAY_OF_MONTH, 1);
			//Si el dia del mes es igual a 13
			if(fecha.get(Calendar.DAY_OF_MONTH) == 13){
				//Evaluo cual es el dia de la semana y guardo la frecuencia
				switch (fecha.get(Calendar.DAY_OF_WEEK)) {
				case 7: //Sabado
					frecuenciaDias[0]++;
					break;
					
				case 1: //Domingo
					frecuenciaDias[1]++;
					break;
					
				case 2: //Lunes
					frecuenciaDias[2]++;
					break;		
					
				case 3: //Martes
					frecuenciaDias[3]++;
					break;	
					
				case 4: //Miercoles
					frecuenciaDias[4]++;
					break;	
					
				case 5: //Jueves
					frecuenciaDias[5]++;
					break;	
					
				case 6: //Viernes
					frecuenciaDias[6]++;
					break;
				}
			}
		}
		System.out.println("dias " + i);
	}

}
