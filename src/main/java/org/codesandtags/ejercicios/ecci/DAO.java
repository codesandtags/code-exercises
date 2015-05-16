package org.codesandtags.ejercicios.ecci;

import java.util.StringTokenizer;

/**
 * Clase que se encarga de manejar la parte de "persistencia" de los datos y
 * genera la validacion de un usuario que se loguea en la aplicacion. Esta es la
 * representacion del modelo.
 * 
 * http://codesandtags.org
 * 
 */
public class DAO {
	private String usuarios[];
	private String claves[];

	public DAO() {
		usuarios = new String[100];
		claves = new String[100];

		cargarDatos();
	}

	private void cargarDatos() {
		// Definicion de los datos a llenar
		String listaUsuarios = "admin,administrator,dmk,cocoman,angelica,javier,edwin,"
				+ "natalia,jorge,erika,jaime,andrea,carolina,roberto,sergio,andres,stiven,lorena,ana,martha";
		String listaClaves = "admin,administrator,123456,112233,angel,javi123,edwin456,"
				+ "nata55,jorgillo,erika,jaimenez,andreluz,caro,robert,sergio9,andrex,stive,loren,anita,martucha";

		// Ingreso la lista en los arreglos
		StringTokenizer stUsuario = new StringTokenizer(listaUsuarios, ",");
		StringTokenizer stClave = new StringTokenizer(listaClaves, ",");

		int elementos = stUsuario.countTokens();

		for (int i = 0; i < elementos; i++) {
			usuarios[i] = stUsuario.nextToken();
			claves[i] = stClave.nextToken();
		}

		// Muestro el arreglo por si las moscas
		/*
		 * for (int i = 0; i < usuarios.length; i++) { System.out.println((i +
		 * 1) + " " +usuarios[i] + ":" + claves[i]); }
		 */
	}

	public boolean validar(String usuario, String clave) {

		for (int i = 0; i < usuarios.length && usuarios[i] != null; i++) {
			if (usuarios[i].equals(usuario) && claves[i].equals(clave)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		DAO dao = new DAO();
	}

}
