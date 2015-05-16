package org.codesandtags.scjp;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;


public class EjemploColecciones {
	public static void main(String[] args) {
		
		EjemploColecciones ejemplo = new EjemploColecciones();
		
		ejemplo.ejemploArrayList();
		ejemplo.ejemploHashTable();
		
	}
	
	/**
	 * El ArrayList maneja indices
	 */
	private void ejemploArrayList() {

		System.out.println("- - - ArrayList - - - \n");
		ArrayList lista = new ArrayList();
		lista.add(5);//autoboxing
		lista.add('a');
		lista.add(0, "cosa");
		lista.add(2, "coso");
		
		System.out.println(lista.get(0));
		System.out.println(lista.get(1));
		System.out.println(lista.get(2));
		
		//recorridos
		System.out.println("=>" + lista.indexOf("coso"));
		System.out.println("=>" + lista.indexOf('a'));
		System.out.println("=>" + lista.size());
		
		System.out.println("------------------------------");
		for (Object o : lista) {
			System.out.println("=> " + o + " : " + o.getClass());
		}
	}
	
	/**
	 * El Hashtable maneja claves
	 */
	private void ejemploHashTable() {
		Hashtable tabla = new Hashtable();
		
		System.out.println("- - - Hashtable - - - \n");
		
		tabla.put(12, "tal cosa");
		tabla.put("3", "otra");
		
		System.out.println("contains =>" + tabla.contains("otra"));
		System.out.println("contains =>" + tabla.containsKey(123));
		System.out.println("size =>" + tabla.size());
		
		//Recorridos
		Object clave, valor;
		Enumeration en = tabla.keys();
		
		while (en.hasMoreElements()) {
			clave = en.nextElement();
			valor = tabla.get(clave);
			System.out.println(clave + " =>" + valor);
		}
	}

}
