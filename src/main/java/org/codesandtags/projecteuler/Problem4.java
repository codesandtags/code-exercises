package org.codesandtags.projecteuler;

/**
 * A palindromic number reads the same both ways. The largest palindrome made
 * from the product of two 2-digit numbers is 9009 = 91 x 99.
 * 
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * @author codesandtags
 * 
 */

public class Problem4 {

	public static void main(String[] args) {
		Problem4 solve = new Problem4();
		System.out.println("Largest palindrome for 3 Digits : "
				+ solve.largestPalindrome(3));

	}

	/**
	 * Devuelve el palindromo mas grande obtenido del producto de x Digitos
	 * 
	 * @param digits
	 * @return
	 */
	public long largestPalindrome(int digits) {
		// Palindromo
		long palindrome = 1;
		// Numero menor de x Digitos
		int a = (int) (Math.pow(10, digits) / 10);
		// Numero mayor de X Digitos
		int b = (int) (Math.pow(10, digits) - 1);

		// Operaciones para obtener el producto
		for (int i = a; i <= b; i++) {
			for (int k = b; k >= a; k--) {
				// Resultado del producto de X Digitos
				String resultado = String.valueOf(i * k);
				// Evaluacion si es palindromo
				if (isPalindorme(resultado)) {
					// System.out.println(i + "x" + k + "=" + resultado );
					// Se valida si palindromo actual es mayor al anterior
					if (Long.valueOf(resultado) > palindrome) {
						palindrome = Long.valueOf(resultado);
					}
				}

			}
		}
		// Hakuna Matata
		return palindrome;
	}

	/**
	 * Devuelve un boolean indicando si la palabra es palindrome
	 * 
	 * @param word
	 * @return
	 */
	public boolean isPalindorme(String word) {
		return word.endsWith(new StringBuilder(word).reverse().toString());
	}

}
