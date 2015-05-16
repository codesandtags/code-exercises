package org.codesandtags.usaco;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/*
ID : etorres1 
LANG : JAVA
TASK : ride 
*/

public class Ride {
	
	public static String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static void main(String[] args) throws IOException{
		//Objeto para lectura de archivos
		BufferedReader filein = new BufferedReader(new FileReader("resources/ride.in"));
		//Objeto para escritura de archivos
		PrintWriter fileout = new PrintWriter(new FileWriter("resources/ride.out"));
		//Objeto para almacenar lineas
		String line;
		int nline = 0;
		int mod1 = 0;
		int mod2 = 0;
		
		//Recorrido del archivo
		while((line = filein.readLine()) != null){
			switch (nline) {
			case 0:
				//Se obtiene el modulo1
				mod1 = getMod(line);
				nline++;
				break;
			case 1:
				//Se obtiene el modulo2
				mod2 = getMod(line);
				//Se inicia el flag de la linea
				nline = 0;
				//Escritura de la respuesta en el archivo de salida
				if(mod1 == mod2){
					fileout.println("GO");
				}else{
					fileout.println("STAY");
				}
				break;
			}
		}
		//envio de todos los streams al archivo
		fileout.flush();
		//Cierre del archivo
		fileout.close();
		System.exit(0);
	}
	
	public static int getMod(String word){
		int sum = 1;
		int mod = 0;
		//Recorrido de la palabra caracter a caracter
		for (int i = 0, nletter = 0;  i < word.length(); i++) {
			nletter = charset.indexOf(word.charAt(i)) + 1;
			sum *= nletter;
		}
		mod = sum % 47;
		return mod; 
	}
}
