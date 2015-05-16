package org.codesandtags.scjp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjemploPattern {
	
	public static void main(String[] args){
		
		//Definicion y compilacion del patron
		Pattern patron = Pattern.compile("J2[SEM]E");
		
		//Busqueda de coincidencias con Matcher
		Matcher coincidencias = patron.matcher("habia una vez una iguana J2SE con una cara de");
		System.out.println(" => " + coincidencias.pattern());
		
		if(coincidencias.matches()){
			System.out.println("Listones parce, si existe");
		}else{
			System.out.println("Nokias, no existe");
		}
		
		
		System.out.println(" Ejemplo => " + validarCorreo("0"));
		System.out.println(" Ejemplo => " + validarCorreo("Z"));
		System.out.println(" Ejemplo => " + validarCorreo("x"));
		System.out.println(" Ejemplo => " + validarCorreo("A"));
		System.out.println(" Ejemplo => " + validarCorreo("c"));
		
		
	}
	
	static boolean validarCorreo(String correo){
		
		Pattern patron  = Pattern.compile("[\\d]");
		Matcher coincidencia = patron.matcher(correo);
		
		
		return coincidencia.matches();
	}

}
