package org.codesandtags.topcoder;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HowEasy {

	public int pointVal(String str) {
		// Arreglo de caracteres que almacenan cada palabra
		String[] words = str.split(" ");
		// Objetos para el manejo de expresiones regular
		Pattern p = Pattern.compile("[^a-zA-Z.]");
		Matcher m;
		int sum = 0;
		int avg = 0;
		for (int i = 0; i < words.length; i++) {
			m = p.matcher(words[i]);
			if (m.find()) {
				sum = 0;
				break;
			} else {
				sum += words[i].length();
			}
		}

		// Se obtiene el promedio y valida la respuesta
		avg = sum / words.length;

		if (avg <= 3) {
			return 250;
		} else if (avg <= 5) {
			return 500;
		} else {
			return 1000;
		}
	}

}