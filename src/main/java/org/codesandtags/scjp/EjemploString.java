package org.codesandtags.scjp;

public class EjemploString {
	
	public static void main(String[] args){
		
		String cadena  ="habia una vez una iguana";
		if(cadena.startsWith("esta")){
			System.out.println("Listones");
		}
		
		if(cadena.startsWith("del",1)){
			cadena = cadena.replaceAll("del", "");
			System.out.println("=>" + cadena);
		}
		
		System.out.println("=> " + 127 % 10);
		
		System.out.println(cadena.substring(7));
		String otra = String.valueOf(cadena.charAt(0));
		
		otra.startsWith("x");
		otra.endsWith("x");
		
	}
}
