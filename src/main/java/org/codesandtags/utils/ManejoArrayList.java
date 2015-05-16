package org.codesandtags.utils;

//http://www.java2s.com/Code/Java/Collections-Data-Structure/WritingYourownComparator.htm
//http://www.javadeveloper.co.in/java-example/java-comparator-example.html
import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class ManejoArrayList {
	public static void main(String[] args){
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		//Insercion
		usuarios.add(new Usuario("xhugo","123456","Hugo McPato"));
		usuarios.add(new Usuario("paco", "11", "Paco McPato"));
		usuarios.add(new Usuario("luis", "5655", "Luis McPato"));
		usuarios.add(new Usuario("donald", "999", "Donald McPato"));
		
		//Recorrido
		System.out.println("\n Recorrido: ");
		for(Usuario usuario : usuarios){
			System.out.println(usuario.getNombre() + " : " + usuario.getLogin());
		}
		
		//Ordenamiento
		
		Comparator comp = Collections.reverseOrder();
		Collections.sort(usuarios, new LoginComaparator());
		
		//Recorrido
		System.out.println("\n Ordenamiento y Recorrido: ");
		for(Usuario usuario : usuarios){
			System.out.println(usuario.getNombre() + " : " + usuario.getLogin());
		}
		
		
		//Eliminacion
		usuarios.remove(new Integer(10));
		System.out.println("Fin!");
		
	}
}

class Usuario implements Comparable{
	private String login;
	private String pass;
	private String nombre;
	
	/*
	 * constructor
	 */
	public Usuario(String login, String pass, String nombre){
		this.login = login;
		this.pass = pass;
		this.nombre = nombre;
	}
	
	public String getLogin(){
		return login;
	}
	
	public String getPass(){
		return pass;
	}
	
	public String getNombre(){
		return nombre;
	}

	public int compareTo(Object obj) {
		Usuario u = (Usuario)obj;
		int comparacion = nombre.compareTo(u.getNombre());
		return comparacion;
	}
	
}

class LoginComaparator implements Comparator{

	public int compare(Object usuario1, Object usuario2) {
		
		//Objetosa comparar
		String login1 = ((Usuario)usuario1).getLogin();
		String login2 = ((Usuario)usuario2).getLogin();

		//Comparacion de los objetos
		return login1.compareTo(login2);
		
	}
	
	
}
