package org.codesandtags.utils;

import java.awt.RenderingHints.Key;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaracteresASCII {

	public static void main(String[] args) throws IOException{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Ingrese texto para convertir a caracteres ASCII");
		String texto = br.readLine();
		StringBuilder ascii = new StringBuilder();
		
		for (int i = 0; i < texto.length(); i++) {
			ascii.append((int)(texto.charAt(i))).append("-").append((char)13);
		}
		
		System.out.println("Caracteres Ascii : \n" + ascii.toString());
		
	}
	
}
