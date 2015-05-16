package org.codesandtags.acm;

/**
 * Solucion de HelloKitty, Ejercicios de calentamiento ACM (WarmUp)
 * http://codesandtags.org
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HelloKitty {
	public static void main(String[] args) throws IOException {

		// Objeto para lectura de datos
		BufferedReader input = new BufferedReader(new InputStreamReader(
				System.in));
		String linea = null;
		while ((linea = input.readLine()) != null) {
			if (linea.equals(".")) {
				break;
			} else {
				StringTokenizer st = new StringTokenizer(linea);
				String word = st.nextToken();
				int n = Integer.parseInt(st.nextToken());
				helloKitty(word, n);
			}
		}
	}

	/**
	 * @param word
	 * @param n
	 * @return
	 */
	public static void helloKitty(String word, int n) {
		String result = "";
		// Se adiciona n veces la palabra enviada
		for (int i = 0; i < n; i++) {
			result += word;
		}

		// Se hace rotacion de cada letra, hasta que aparezca la
		// palabra en la primera columna
		for (int i = 0; i < word.length(); i++) {
			System.out.println(result);
			result = result.substring(1, result.length())
					+ result.substring(0, 1);
		}

	}
}
