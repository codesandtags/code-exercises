package org.codesandtags.cstutoringcenter;

import java.math.BigInteger;

public class Problem81 {
	
	
	String[][] morseCode = {
			{"0","-----"},
			{"1",".----"},
			{"2","..---"},
			{"3","...--"},
			{"4","....-"},
			{"5","....."},
			{"6","-...."},
			{"7","--..."},
			{"8","---.."},
			{"9","----."},
	};
	
	
	public static void main(String[] args) {
		
		Problem81 solve = new Problem81();
		System.out.println(solve.getFactorial(100));
		String txtMorse = solve.getMessageMorse(solve.getFactorial(100).toString());
		System.out.println(solve.countCharacters(txtMorse, "."));
		
	}
	
	public BigInteger getFactorial(int max){
		
		BigInteger factorial = BigInteger.ONE;
		
		for (int i = 1; i <= max; i++) {
			factorial = factorial.multiply( BigInteger.valueOf(i) );
			//System.out.println(i + " => "+ factorial);
		}
		
		return factorial;
	}
	
	public String getMessageMorse(String msg){
		
		StringBuilder morse = new StringBuilder();
		
		for (int i = 0; i < msg.length(); i++) {
			String letter = String.valueOf(msg.charAt(i));
			
			for (int j = 0; j < morseCode.length; j++) {
				if(letter.equals(morseCode[j][0])){
					morse.append(morseCode[j][1]); 
				}
			}
		}
		return morse.toString();
	}
	
	public int countCharacters(String msg, String character){
		int count = 0;
		
		for (int i = 0; i < msg.length(); i++) {
			String letter = String.valueOf(msg.charAt(i));
			if(letter.equals(character)){
				count++;
			}
		}
		
		return count;
	}

}
