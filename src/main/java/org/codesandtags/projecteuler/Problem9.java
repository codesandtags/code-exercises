package org.codesandtags.projecteuler;

/***
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for
 * which,
 * 
 * a^2 + b^2 = c^2 For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
 * 
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find
 * the product abc.
 * 
 * @author codesandtags
 * 
 */

public class Problem9 {
	public static void main(String[] args) {
		Problem9 solve = new Problem9();
		System.out.println("The triplet for which a + b + c = 1000 is : "
				+ solve.bruteforcePythagorean(1000));
	}

	/**
	 * A partir de fuerza bruta basandose en el teorema de pitagoras encuentra 3
	 * numeros que sumados dan 100, y retorna el productos de los 3 
	 * numeros -> a * b * c
	 * 
	 * @param expected
	 * @return
	 */
	public int bruteforcePythagorean(int expected) {
		int num = 0;

		// Solucion del teorema de pitagoras
		for (int b = 1; b < expected; b++) {
			for (int a = 1; a < b; a++) {
				/**
				 * Se encuentran los lados del triangulo aplicando el teorema de
				 * pitagoras teniendo en cuenta que la sumatoria de los 3 lados
				 * debe dar el numero esperado == 1000
				 */
				if ((a * a) + (b * b) == (expected - a - b)
						* (expected - a - b)) {
					System.out.println("a = " + a + " b = " + b + " c = "
							+ (expected - a - b));
					num = a * b * (expected - a - b);
					break;
				}

			}
		}

		// Hakuna Matata
		return num;
	}

}
