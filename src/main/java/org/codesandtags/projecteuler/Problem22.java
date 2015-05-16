package org.codesandtags.projecteuler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;

/**
 * 
 * Using names.txt (right click and 'Save Link/Target As...'), a 46K text file
 * containing over five-thousand first names, begin by sorting it into
 * alphabetical order. Then working out the alphabetical value for each name,
 * multiply this value by its alphabetical position in the list to obtain a name
 * score.
 * 
 * For example, when the list is sorted into alphabetical order, COLIN, which is
 * worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN
 * would obtain a score of 938 x 53 = 49714.
 * 
 * What is the total of all the name scores in the file?
 * 
 * @author codesandtags
 * 
 */

public class Problem22 {

	private File file;

	public static void main(String[] args) {
		Problem22 solve = new Problem22();
		long start = System.currentTimeMillis();
		
		solve.setFile(new File("resources/names.txt"));
		System.out.println("The total scores in the file is : "	+ solve.getTotalScores());
		
		long end = System.currentTimeMillis();

		System.out.println("Total " + (end - start) + " ms.");

	}

	/**
	 * Define el archivo
	 * 
	 * @param file
	 */
	public void setFile(File file) {
		this.file = file;
	}

	/***
	 * Obtiene el total
	 * 
	 * @return
	 */
	public long getTotalScores() {
		long scores = 0;

		try {

			// Variables de trabajo
			BufferedReader br = new BufferedReader(new FileReader(file));
			String linea = "";
			String datos = "";

			while ((linea = br.readLine()) != null) {
				datos += linea;
			}

			// Obtengo los datos, ajusto su estructura y los meto en un arreglo
			datos = datos.replace("\"", "");
			String[] names = datos.split(",");

			// Ordeno el arreglo de nombres
			Arrays.sort(names);

			// Aqui esta la magia
			for (int i = 0; i < names.length; i++) {
				long score = 0;
				// Para cada nombre en el arreglo obtengo de cada caracter y
				// resto 64, ya que las letras mayusculas comienzan en el
				// caracter 65
				for (int x = 0; x < names[i].length(); x++) {
					score += (names[i].charAt(x) - 64);
				}

				// Opero segun la formula y sumo el score al total
				score *= (i + 1);
				scores += score;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return scores;
	}
}
