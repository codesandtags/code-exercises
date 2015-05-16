package org.codesandtags.scjp;

public class ManejoExcepciones {
	
	public static void main(String[] args) {
		
//		try {
//			double operacion = 4 / 0;
//		} finally{
//			System.err.println("Antes de que se propague");
//		}
		
		resultado();

	}
	
	public static int resultado(){
		
		try {
			double operacion = 4 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Changos esto no sirvio");
			return 0;
		}finally{
			System.err.println("Se ejecuto la excepcion");
		}
		
		return 5;
	}
	
	
}
