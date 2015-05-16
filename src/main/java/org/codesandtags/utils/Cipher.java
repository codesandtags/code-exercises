package org.codesandtags.utils;

/***
 * Clase : Cipher
 * Clase de ejemplo que muestra una forma sencilla para
 * cifrar y descifrar un texto basado en un charset definidos
 * por nosotros mismos.
 * 
 * @author [D-m-K]
 * http://codesandtags.org
 */

public class Cipher {
	
	//Charset de caracteres cuando se cifra
	private String charset1 = "1234567890!#$%&/()=¿?¡_-+*:";
	//Charset de caracteres cuando se descifra
	private String charset2 = "abcdefghijklmnopqrstuvwxyz ";
	
	/**
	 * Metodo que recibe un texto y cifra el contenido de 
	 * acuerdo a los charset definidos
	 * @param texto
	 * @return texto
	 */
	public String cifrar(String texto){
		//Convierto a minuscula las letras del alfabeto que existan en el texto
		texto = texto.toLowerCase();
		//Reemplazo los caracteres del charset2 con los del charset1
		for (int i = 0; i < charset2.length(); i++) {
			texto = texto.replace(charset2.charAt(i), charset1.charAt(i));
		}
		//Retorno el texto cifrado con el charset2
		return texto;
	}
	
	/**
	 * Metodo que recibe un texto y descifra el contenido de 
	 * acuerdo a los charset definidos
	 * @param texto
	 * @return texto
	 */
	public String descifrar(String texto){
		//Convierto a minuscula las letras del alfabeto que existan en el texto
		texto = texto.toLowerCase();
		//Reemplazo los caracteres del charset1 con los del charset2
		for (int i = 0; i < charset1.length(); i++) {
			texto = texto.replace(charset1.charAt(i), charset2.charAt(i));
		}
		//Retorno el texto cifrado con el charset2
		return texto;
	}
	
	public static void main(String[] args){
		
		//Instancia de la clase Cipher y creacion de un nuevo objeto
		Cipher cipher = new Cipher();
		
		//Cifrando texto
		String textoCifrado = cipher.cifrar("codes and tags... ");
		System.out.println(textoCifrado);
		
		//Descifrando texto
		String textoDescifrado = cipher.descifrar(textoCifrado); 
		System.out.println(textoDescifrado);
		
		//Ejemplo con varias cadenas
		String[] cadenas = new String[4];
		cadenas[0] = "Los pollitos dicen, pio pio pio... cuando tienen hambre, cuando tienen frio... 1234567890";
		cadenas[1] = "Habia una vez una iguana con una cara de rana";
		cadenas[2] = "Hoy es Sabado y esta lloviendo en bogota, que vaina...";
		cadenas[3] = "Este es mi ultimo ejemplo jejeje....";
		
		//Cifrando cada cadena del arreglo
		System.out.println("\n Cifrando unas cuantas cadenas...");
		for (int i = 0; i < cadenas.length; i++) {
			cadenas[i] = cipher.cifrar(cadenas[i]);
			System.out.println("Cadena " + (i + 1) + " : " + cadenas[i]);
		}
		
		//Ahora Descifrando el contenido de las cadenas
		System.out.println("\n Descifrando las cadenas de ahorita...");
		for (int i = 0; i < cadenas.length; i++) {
			cadenas[i] = cipher.descifrar(cadenas[i]);
			System.out.println("Cadena " + (i + 1) + " : " + cadenas[i]);
		}
	}
}
