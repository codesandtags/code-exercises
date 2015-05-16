package org.codesandtags.scjp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjemploExcepciones {
	
	public void metodoExcepcionGeneral() throws Exception{
		
	}

	public void metodoconExcepcionMarcada() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String nombre;
			System.out.println("Hola!! como te llamas? > ");
			nombre = br.readLine();
			System.out.println("Ok. mucho gusto " + nombre + " mi nombre es Java :P");
			//nombre = null;
			System.out.println(nombre.length());
			
		} catch (Exception e) {
			System.out.println("En caso de que suceda es por tal cosa");
			e.printStackTrace();
		}finally{
			
			System.out.println("ESto siempre se ejecuta");
		}

	}

	public void metodoConExcepcionNoMarcada() {
		
		System.out.println(" 5 / 0 : " + (5 / 0) );

	}

	public static void main(String[] args) {
		
		EjemploExcepciones ejemplo = new EjemploExcepciones();
		ejemplo.metodoconExcepcionMarcada();
		ejemplo.metodoConExcepcionNoMarcada();
		

	}

}
