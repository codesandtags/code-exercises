package org.codesandtags.projecteuler;

/**
 * 
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * 
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out
 * in words, how many letters would be used? 
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and
 * forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20
 * letters. The use of "and" when writing out numbers is in compliance with
 * British usage.
 * 
 * @author codesandtags
 * 
 */

public class Problem17 {
	public static void main(String[] args) {
		Problem17 solve = new Problem17();
		System.out.println("=> " + solve.getNumberOfLetters(1000) + " letters");
	}

	/**
	 * Obtiene la cantidad de letras que contienen las palabras desde el numero
	 * uno hasta un maximo numero especificado
	 * 
	 * @param maxNumber
	 * @return
	 */
	public int getNumberOfLetters(int maxNumber) {
		int letters = 0;

		for (int i = 1; i <= maxNumber; i++) {
			letters += getNumberInWord(i).length();
			System.out.println(i + " => " + getNumberInWord(i));
		}

		return letters;
	}

	/**
	 * Devuelve en palabras un numero dado
	 * 
	 * @param number
	 * @return
	 */
	public String getNumberInWord(int number) {
		//Palabra del numero dado
		StringBuilder word = new StringBuilder();
		
		//Mientras que el numero sea diferente de cero sigue operando
		while (number != 0) {
			if (number < 10) {
				// System.out.println("antes number " + number);
				if (number == 1)	word.append("one");
				if (number == 2)	word.append("two");
				if (number == 3)	word.append("three");
				if (number == 4)	word.append("four");
				if (number == 5)	word.append("five");
				if (number == 6)	word.append("six");
				if (number == 7)	word.append("seven");
				if (number == 8)	word.append("eight");
				if (number == 9)	word.append("nine");
				number = 0;
				// System.out.println("despues number " + number);
			} else if (number >= 10 && number < 100) {
				// System.out.println("antes number " + number);
				if (number >= 10 && number < 20) {
					if (number == 10)	word.append("ten");
					if (number == 11)	word.append("eleven");
					if (number == 12)	word.append("twelve");
					if (number == 13)	word.append("thirteen");
					if (number == 14)	word.append("fourteen");
					if (number == 15)	word.append("fifteen");
					if (number == 16)	word.append("sixteen");
					if (number == 17)	word.append("seventeen");
					if (number == 18)	word.append("eighteen");
					if (number == 19)	word.append("nineteen");
					number = 0;
				} else {
					if (number >= 20 && number <= 29)	word.append("twenty");
					if (number >= 30 && number <= 39)	word.append("thirty");
					if (number >= 40 && number <= 49)	word.append("forty");
					if (number >= 50 && number <= 59)	word.append("fifty");
					if (number >= 60 && number <= 69)	word.append("sixty");
					if (number >= 70 && number <= 79)	word.append("seventy");
					if (number >= 80 && number <= 89)	word.append("eighty");
					if (number >= 90 && number <= 99)	word.append("ninety");
				}
				//Mod 10
				number %= 10;
			} else if (number >= 100 && number < 1000) {				
				if (number >= 100 && number <= 199)	word.append("onehundred");
				if (number >= 200 && number <= 299)	word.append("twohundred");
				if (number >= 300 && number <= 399)	word.append("threehundred");
				if (number >= 400 && number <= 499)	word.append("fourhundred");
				if (number >= 500 && number <= 599)	word.append("fivehundred");
				if (number >= 600 && number <= 699)	word.append("sixhundred");
				if (number >= 700 && number <= 799)	word.append("sevenhundred");
				if (number >= 800 && number <= 899)	word.append("eighthundred");
				if (number >= 900 && number <= 999)	word.append("ninehundred");
				if(number % 100 >= 1){
					word.append("and");
				}
				//Mod 100
				number %= 100;
			} else if (number >= 1000 && number < 10000) {
				if (number >= 1000 && number <= 1999)	word.append("onethousand");
				//Mod 1000 ... Be contined...
				number %= 1000;
			}
		}

		// Hakuna Matata
		return word.toString();
	}
}
