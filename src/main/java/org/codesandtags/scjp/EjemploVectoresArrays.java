package org.codesandtags.scjp;

import java.lang.reflect.Array;
import java.util.Vector;

public class EjemploVectoresArrays {

	public static void main(String[] args) {

		EjemploVectoresArrays ejemplo = new EjemploVectoresArrays();

		System.out.println("Comenzando con el ejemplo...");
		ejemplo.ejemploVectores();
		ejemplo.ejemploArrays();

	}

	public void ejemploVectores() {
		
		//Un vector tiene diferentes constructores
		Vector vector1= new Vector();
		Vector vector2 = new Vector(vector1);
		
		
		Array.set(vector1, 3, 10);
		
		
		
		//Ahora un ejemplo adicionando nombres
		Vector<String> nombres = new Vector<String>();
		
		nombres.add("dey");		
		nombres.add("edwin");
		

	}

	public void ejemploArrays() {
		
		int[] numeros = {1,2,3,4,5};

		
		System.out.println(" Array get : --> " + Array.get(numeros, 0));
		System.out.println(" Array get : --> " + Array.getLong(numeros, 3));
		System.out.println(" Array get : --> " );
		Array.setDouble(numeros, 0, 4);
		


	}

}
