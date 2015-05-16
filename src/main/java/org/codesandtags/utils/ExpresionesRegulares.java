package org.codesandtags.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/***
 * 
 * http://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html
 * http://www.metriplica.com/es/recursos/expresiones-regulares
 * http://www.mkyong.com/regular-expressions/how-to-validate-ip-address-with-regular-expression/
 * @author Codesandtags
 *
 */

public class ExpresionesRegulares {
	
	
	private static final String PATRON_IP = 
			"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
			"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
	
	private static final String PATRON_CELULAR = 
			"^([3][012]\\d\\d{7})$";
	
	private static final String PATRON_URL = 
			"^(http|https)://" +
			"(\\w{3}\\.\\w*|\\w*)\\." + 
			"(\\w{1,4})$";
			
	
	private Pattern pattern;
	private Matcher matcher;
	
	
	public static void main(String[] args){
		
		ExpresionesRegulares expresiones = new ExpresionesRegulares();
		
		try{
			
			System.out.println("antes");
			String numero = "8000743A8";
			
			
			System.out.println("=> ---- " + numero.matches("(.*)[^0-9](.*)"));
			
			if(numero.matches("[09]")){
				System.out.println("Tiene numeros");
			}
			
			System.out.println("Hola");
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
			
		
		
		//Validar y arreglar numero
		System.out.println(expresiones.validarArreglarNumero("860074389A"));
		System.out.println(expresiones.validarArreglarNumero(" 860074389A"));
		System.out.println(expresiones.validarArreglarNumero("8600 74389A"));
		System.out.println(expresiones.validarArreglarNumero("Z860074389"));
		

		//Validacion de IPs
		System.out.println(expresiones.validarDireccionIP("192.168.456.999"));		
		System.out.println(expresiones.validarDireccionIP("255.255.255.255"));
		System.out.println(expresiones.validarDireccionIP("0.0.0.0"));
		System.out.println(expresiones.validarDireccionIP("1.2.3.999"));
		
		//Validacion de telefono celular
		System.out.println(expresiones.validarTelefonoCelular("3123962374"));
		System.out.println(expresiones.validarTelefonoCelular("3013962374"));
		System.out.println(expresiones.validarTelefonoCelular("3203962374"));
		System.out.println(expresiones.validarTelefonoCelular("4033962374"));
		System.out.println(expresiones.validarTelefonoCelular("3403962374"));
		
		//Validacion url
		System.out.println(expresiones.validarURL("http://www.codesandtags.org"));
		System.out.println(expresiones.validarURL("https://www.codesandtags.org"));
		System.out.println(expresiones.validarURL("http://www."));
		System.out.println(expresiones.validarURL("https://codesandtags.org"));
		System.out.println(expresiones.validarURL("ftp://www.codesandtags.org"));
		
		String cadenaEspacios = "habia    una        vez una iguna       con una cara de       rana      .";
		System.out.println(" => " + cadenaEspacios);
		System.out.println(" => " + cadenaEspacios.replaceAll("\\s{1,20}", " "));
	
		
		
		System.out.println("Fin!");
	}
	
	
	public boolean validarDireccionIP(String expresion){
		pattern = Pattern.compile(PATRON_IP);
		matcher = pattern.matcher(expresion);
		System.out.print("=> " + expresion + " : ");
		return matcher.matches();
	}
	
	public boolean validarTelefonoCelular(String expresion){
		pattern = Pattern.compile(PATRON_CELULAR);
		matcher = pattern.matcher(expresion);
		System.out.print("=> " + expresion + " : ");
		return matcher.matches();
	}
	
	public boolean validarURL(String expresion){
		pattern = Pattern.compile(PATRON_URL);
		matcher = pattern.matcher(expresion);
		System.out.print("=> " + expresion + " : ");
		return matcher.matches();
	}
	
	public int validarArreglarNumero(String numero){
		numero = numero.replaceAll("[azAZ ]", "");
		return Integer.parseInt(numero);
	}
}
