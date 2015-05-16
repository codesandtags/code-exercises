package org.codesandtags.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Clase de ejemplo que muestra como ordenar un objeto a partir de uno de sus
 * atributos utilizando la implementacion de la clase comparator
 * 
 * @author codesandtags
 * 
 */
public class EjemploComparator {

	private ArrayList<Estudiante> mischinitos = new ArrayList<Estudiante>();

	public static void main(String[] args) {

		EjemploComparator ejemplo = new EjemploComparator();
		ejemplo.addEstudiante("caremonda", "espinilla", "20110601");
		ejemplo.addEstudiante("elagresivo", "roncador", "20120301");
		ejemplo.addEstudiante("carebala", "teofilo", "20120315");
		ejemplo.addEstudiante("visages", "nerosqui", "20111231");

		// Mostrando elementos antes
		System.out.println("[ Antes del ordenamiento ]");
		ejemplo.mostrar();
		// Ordenando elementos por nombre
		ejemplo.ordenarAscendente("nombre", 1);
		ejemplo.ordenarAscendente("nombre", 2);
		// Ordenando elementos por apellido
		ejemplo.ordenarAscendente("apellido", 1);
		ejemplo.ordenarAscendente("apellido", 2);
		// Ordenando elementos por Fecha
		ejemplo.ordenarAscendente("fechaExpulsion", 1);
		ejemplo.ordenarAscendente("fechaExpulsion", 2);

	}

	/**
	 * Adiciona un estudiante a la coleccion
	 * 
	 * @param nombre
	 * @param apellido
	 */
	public void addEstudiante(String nombre, String apellido, String fechaExpulsion) {
		mischinitos.add(new Estudiante(nombre, apellido, fechaExpulsion));
	}

	/**
	 * Muestra los elementos contenidos en la coleccion
	 */
	public void mostrar() {
		for (Estudiante e : mischinitos) {
			System.out.println(e.getNombre() + " : " + e.getApellido() + " : " + e.getFechaExpulsion());
		}
	}

	/**
	 * Ordena los elementos de una Coleccion teniendo en cuenta los atributos de
	 * la clase que se encuentra en la coleccion.
	 * 
	 * @param atributo
	 * @param orden
	 *            : 1 = ASCENDENTE, 2 = DESCENDENTE
	 * 
	 */
	public void ordenarAscendente(String atributo, int orden) {
		if (atributo.equals("nombre")) {
			System.out.println("\n[ Ordenamiento por Nombre ]");
			if (orden == 1) {
				System.out.println("[ Ascendente ] ");
				Collections.sort(mischinitos, new compararNombre());

			} else {
				System.out.println("[ Descendente ] ");
				Collections.sort(mischinitos,
						Collections.reverseOrder(new compararNombre()));
			}

			// Se muestran los datos
			mostrar();
		} else if (atributo.equals("apellido")) {
			System.out.println("\n[ Ordenamiento por Apellido ]");

			if (orden == 1) {
				System.out.println("[ Ascendente ] ");
				Collections.sort(mischinitos, new compararApellido());

			} else {
				System.out.println("[ Descendente ] ");
				Collections.sort(mischinitos,
						Collections.reverseOrder(new compararApellido()));
			}

			// Se muestran los datos
			mostrar();
		} else if(atributo.equals("fechaExpulsion")){
			System.out.println("\n[ Ordenamiento por Fecha ]");

			if (orden == 1) {
				System.out.println("[ Ascendente ] ");
				Collections.sort(mischinitos, new compararApellido());

			} else {
				System.out.println("[ Descendente ] ");
				Collections.sort(mischinitos,
						Collections.reverseOrder(new compararApellido()));
			}

			// Se muestran los datos
			mostrar();
		}
	}

	/***
	 * Inner class : compararNombre Implementacion del Comparator, para el
	 * atributo Nombre
	 * 
	 */
	public class compararNombre implements Comparator<Object> {

		public int compare(Object ob1, Object ob2) {
			Estudiante e1 = (Estudiante) ob1;
			Estudiante e2 = (Estudiante) ob2;
			return e1.getNombre().compareTo(e2.getNombre());
		}

	}

	/**
	 * Inner class : compararApellido Implementacion del Comparator, para el
	 * atributo Apellido
	 * 
	 */
	public class compararApellido implements Comparator<Object> {

		public int compare(Object ob1, Object ob2) {
			Estudiante e1 = (Estudiante) ob1;
			Estudiante e2 = (Estudiante) ob2;
			return e1.getApellido().compareTo(e2.getApellido());
		}

	}
	
	/**
	 * Inner class : compararApellido Implementacion del Comparator, para el
	 * atributo Apellido
	 * 
	 */
	public class compararFecha implements Comparator<Estudiante> {
		public int compare(Estudiante e1, Estudiante e2) {
			return e1.getFechaExpulsion().compareTo(e2.getFechaExpulsion());
		}
	}
}

/**
 * Clase Estudiante con 2 atributos
 * 
 * @author codesandtags
 * 
 */
class Estudiante {

	// Atributos
	String nombre;
	String apellido;
	String fechaExpulsion;

	// Constructor
	public Estudiante(String nombre, String apellido, String fechaExpulsion) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaExpulsion = fechaExpulsion;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public String getFechaExpulsion() {
		return fechaExpulsion;
	}

}