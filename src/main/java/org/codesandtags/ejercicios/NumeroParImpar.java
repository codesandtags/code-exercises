package org.codesandtags.ejercicios;

public class NumeroParImpar {
	
	public static void main(String[] args){
		//Instancia de la clase
		NumeroParImpar ejemplo = new NumeroParImpar();
		
		//Validacion de varios numeros
		ejemplo.validar(5);
		ejemplo.validar(8);
		ejemplo.validar(654561);
		ejemplo.validar(-13);
		ejemplo.validar(0);
		
	}
	
	/**
	 * Metodo que valida si un numero es par (even) o impar (odd)
	 * @param n
	 */
	public void validar(int n){
		
		//Se valida que el numero sea par con el operador modulo % de 2
		if(n % 2 == 0){
			System.out.println("El numero " + n + " es par");
		}else{
			System.out.println("El numero " + n + " es impar");
		}
		
	}
}
