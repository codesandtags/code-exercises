package org.codesandtags.ejercicios;

/**
 * Esta clase permite hacer las conversiones de numeros mas comunes. Para hacer
 * mucho mas facil la conversion se utiliza la clase Integer, la cual
 * proporciona una implementacion para cambiar a cualquier base un numero.
 * 
 * - Convertir un numero de binario a decimal, octal, hexadecimal. 
 * - Convertir un numero de decimal a binario, octal, hexadecimal. 
 * - Convertir un numero de octal a decimal, hexadecimal, binario. 
 * - Convertir un numero de decimal a una base cualquiera. 
 *  
 * @author codesandtags
 * 
 */

public class ConversionNumeros {

	public static void main(String args[]) {
		// Instancia a la clase Conversion
		ConversionNumeros conversion = new ConversionNumeros();
		
		/**
		 * Binarios
		 */
		System.out.println("\n-------------------- Numeros Binarios ---------------------");
		// Convertir numero Binario a Decimal
		System.out.println(conversion.binarioToDecimal("10100100010101010"));
		// Convertir numero Binario a Octal
		System.out.println(conversion.binarioToOcta("10100100010101010"));
		// Convertir numero Binario a Hexadecimal
		System.out.println(conversion.binarioToHexa("10100100010101010"));

		/**
		 * Decimales
		 */
		System.out.println("\n-------------------- Numeros Decimales ---------------------");
		// Convertir numero decimal a Binario
		System.out.println(conversion.decimalToBinario(56478));
		// Convertir numero Decimal a Octal
		System.out.println(conversion.decimalToOcta(56478));
		// Convertir numero Decimal a Hexadecimal
		System.out.println(conversion.decimalToHexa(56478));

		/**
		 * Octales
		 */
		System.out.println("\n-------------------- Numeros Octales ---------------------");
		// Convertir numero Octal a Decimal
		System.out.println(conversion.octaToDecimal(74564));
		// Convertir numero Octal a Hexadecimal
		System.out.println(conversion.octaToHexa(74564));
		// Convertir numero Octal a Binario
		System.out.println(conversion.octaToBinario(74564));
		
		/**
		 * Hexadecimales
		 */
		System.out.println("\n-------------------- Numeros Hexadecimales ---------------------");
		// Convertir numero Hexadecimal a Binario
		System.out.println(conversion.hexaToBinario("c0d35"));
		// Convertir numero Hexadecimal a Binario
		System.out.println(conversion.hexaToDecimal("c0d35"));
		// Convertir numero Hexadecimal a Octal
		System.out.println(conversion.hexaToOctal("c0d35"));
		
		
		/**
		 * Cualquier base
		 */
		System.out.println("\n-------------------- Numeros de cualquier base ---------------------");
		//De base 2 a base 10
		System.out.println(conversion.toCualquierBase("10100100010101010", 2, 10));
		System.out.println(conversion.toCualquierBase("10100100010101010", 2, 8));
		System.out.println(conversion.toCualquierBase("10100100010101010", 2, 16));
		
		System.out.println(conversion.toCualquierBase("56478", 10, 2));
		System.out.println(conversion.toCualquierBase("56478", 10, 8));
		System.out.println(conversion.toCualquierBase("56478", 10, 10));
		
		System.out.println(conversion.toCualquierBase("74564", 8, 10));
		System.out.println(conversion.toCualquierBase("74564", 8, 16));
		System.out.println(conversion.toCualquierBase("74564", 8, 2));
		
		System.out.println(conversion.toCualquierBase("c0d35", 16, 2));
		System.out.println(conversion.toCualquierBase("c0d35", 16, 10));
		System.out.println(conversion.toCualquierBase("c0d35", 16, 8));
		
		System.out.println(conversion.toCualquierBase("123456", 24, 2));
		System.out.println(conversion.toCualquierBase("123456", 24, 4));
		System.out.println(conversion.toCualquierBase("123456", 24, 8));
		System.out.println(conversion.toCualquierBase("123456", 24, 10));
		System.out.println(conversion.toCualquierBase("123456", 24, 14));
		System.out.println(conversion.toCualquierBase("123456", 24, 16));
		System.out.println(conversion.toCualquierBase("123456", 24, 18));
		
	}

	/**
	 * Recibe un numero en base 10 (decimal) y lo devuelve en base 2 (Binario)
	 * 
	 * @param numero
	 * @return binario
	 */
	public String decimalToBinario(int numero) {
		System.out.print("Convirtiendo decimal  (" + numero + ") a binario >> ");
		return Integer.toBinaryString(numero);
	}
	
	/**
	 * Recibe un numero en base 10 (decimal) y lo devuelve en base 8 (Octal)
	 * 
	 * @param numero
	 * @return octal
	 */
	public String decimalToOcta(int numero) {
		System.out.print("Convirtiendo decimal (" + numero + ") a octal >> ");
		return Integer.toOctalString(numero);
	}
	
	
	/**
	 * Recibe un numero en base 10 (decimal) y lo devuelve en base 16 (Hexadecimal)
	 * 
	 * @param numero
	 * @return hexadecimal
	 */
	public String decimalToHexa(int numero) {
		System.out.print("Convirtiendo decimal (" + numero + ") a hexadecimal >> ");
		return Integer.toHexString(numero);
	}
		

	/**
	 * Recibe un numero en base 2 (binario) y lo devuelve en base 10 (decimal)
	 * 
	 * @param binario
	 * @return decimal
	 */
	public int binarioToDecimal(String binario) {
		System.out.print("Convirtiendo binario (" + binario + ") a decimal >> ");
		Integer numero = 0;
		try{
			numero = Integer.valueOf(binario, 2);
		}catch (NumberFormatException e) {
			System.err.print("\nERROR : El numero " + binario + " no es binario");
		}
		return numero.intValue();
	}
	
	/**
	 * Recibe un numero en base 2 (binario) y lo devuelve en base 16 (hexadecimal)
	 * 
	 * @param binario
	 * @return hexadecimal
	 */
	public String binarioToHexa(String binario) {
		System.out.print("Convirtiendo binario (" + binario + ") a hexadecimal >> ");
		Integer numero = 0;
		try{
			numero = Integer.valueOf(binario, 2);
		}catch (NumberFormatException e) {
			System.err.print("\nERROR : El numero " + binario + " no es binario");
		}
		return Integer.toHexString(numero);
	}
	
	/**
	 * Recibe un numero en base 2 (binario) y lo devuelve en base 8 (octal)
	 * 
	 * @param binario
	 * @return octal
	 */
	public String binarioToOcta(String binario) {
		System.out.print("Convirtiendo binario (" + binario + ") a octal >> ");
		Integer numero = 0;
		try{
			numero = Integer.valueOf(binario, 2);
		}catch (NumberFormatException e) {
			System.err.print("\nERROR : El numero " + binario + " no es binario");
		}
		return Integer.toOctalString(numero);
	}
	
	
	/**
	 * Recibe un numero en base 8 (octal) y lo devuelve en base 10 (decimal)
	 * 
	 * @param octal
	 * @return decimal
	 */
	public int octaToDecimal(int octal) {
		System.out.print("Convirtiendo octal (" + octal + ") a decimal >> ");
		Integer numero = 0;
		try{
			numero = Integer.valueOf(String.valueOf(octal), 8);
		}catch (NumberFormatException e) {
			System.err.print("\nERROR : El numero " + octal +"  no es octal");
		}
		return numero.intValue();
	}
	
	/**
	 * Recibe un numero en base 8 (octal) y lo devuelve en base 16 (hexadecimal)
	 * 
	 * @param octal
	 * @return hexadecimal
	 */
	public String octaToHexa(int octal) {
		System.out.print("Convirtiendo octal (" + octal + ") a Hexadecimal >> ");
		Integer numero = 0;
		try{
			numero = Integer.valueOf(String.valueOf(octal), 8);
		}catch (NumberFormatException e) {
			System.err.print("\nERROR : El numero " + octal +"  no es octal");
		}
		return Integer.toHexString(numero.intValue());
	}
	
	/**
	 * Recibe un numero en base 8 (octal) y lo devuelve en base 2 (binario)
	 * 
	 * @param octal
	 * @return decimal
	 */
	public String octaToBinario(int octal) {
		System.out.print("Convirtiendo octal (" + octal + ") a Binario >> ");
		Integer numero = 0;
		try{
			numero = Integer.valueOf(String.valueOf(octal), 16);
		}catch (NumberFormatException e) {
			System.err.print("\nERROR : El numero " + octal +"  no es octal");
		}
		return Integer.toBinaryString(numero.intValue());
	}	
	
	
	/**
	 * Recibe un numero en base 16 (hexadecimal) y lo devuelve en base 10 (decimal)
	 * 
	 * @param hexadecimal
	 * @return decimal
	 */
	public int hexaToDecimal(String hexa) {
		System.out.print("Convirtiendo hexadecimal (" + hexa + ") a Decimal >> ");
		Integer numero = 0;
		try{
			numero = Integer.valueOf(hexa, 16);
		}catch (NumberFormatException e) {
			System.err.print("\nERROR : El numero " + hexa +"  no es hexadecimal");
		}
		return numero.intValue();
	}
	
	/**
	 * Recibe un numero en base 16 (hexadecimal) y lo devuelve en base 8 (octal)
	 * 
	 * @param hexadecimal
	 * @return decimal
	 */
	public String hexaToOctal(String hexa) {
		System.out.print("Convirtiendo hexadecimal (" + hexa + ") a octal >> ");
		Integer numero = 0;
		try{
			numero = Integer.valueOf(hexa, 16);
		}catch (NumberFormatException e) {
			System.err.print("\nERROR : El numero " + hexa +"  no es hexadecimal");
		}
		return Integer.toOctalString(numero.intValue());
	}
			
	
	/**
	 * Recibe un numero en base 16 (hexadecimal) y lo devuelve en base 2 (binario)
	 * 
	 * @param hexadecimal
	 * @return decimal
	 */
	public String hexaToBinario(String hexa) {
		System.out.print("Convirtiendo hexadecimal (" + hexa + ") a binario >> ");
		Integer numero = 0;
		try{
			numero = Integer.valueOf(hexa, 16);
		}catch (NumberFormatException e) {
			System.err.print("\nERROR : El numero " + hexa +"  no es hexadecimal");
		}
		return Integer.toBinaryString(numero.intValue());
	}
	
	public String toCualquierBase(String num, int base1, int base2){
		System.out.print("Convirtiendo numero (" + num  + ") de base " + base1 + " a base " + base2 + ">> ");
		Integer numero = 0;
		try{
			numero = Integer.valueOf(num, base1);
		}catch (NumberFormatException e) {
			System.err.print("\nERROR : El numero " + num +" no es soportado en la base " + base1);
		}
		return Integer.toString(numero.intValue(), base2);	
	}


}
