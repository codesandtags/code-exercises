package org.codesandtags.cstutoringcenter;

import java.util.HashMap;
import java.util.Iterator;

public class Problem4 {
	
	public static void main(String[] args) {
		
		Problem4 solve = new Problem4();
		System.out.println(solve.getProduct("practice"));
		System.out.println(solve.getProduct("Programming Challenges are fun"));
		
	}
	
	public long getProduct(String text){
		
		long product = 1;
		String[][] telephone = {
				{"A","2"},	{"B","2"},	{"C","2"},
				{"D","3"},	{"E","3"},	{"F","3"},
				{"G","4"},	{"H","4"},	{"I","4"},
				{"J","5"},	{"K","5"},	{"L","5"},
				{"M","6"},	{"N","6"},	{"O","6"},
				{"P","7"},	{"R","7"},	{"S","7"},
				{"T","8"},	{"U","8"},	{"V","8"},
				{"W","9"},	{"X","9"},	{"Y","9"}
		};
		

		for (int i = 0; i < text.length(); i++) {
			
			for (int j = 0; j < telephone.length; j++) {
				
				String letter = String.valueOf(text.charAt(i)).toUpperCase();
				
				if( letter.equals(telephone[j][0])  ){
					product *= Long.parseLong(telephone[j][1]);
				}
			}
			
		}
		
		return product;
	}

}
