package org.codesandtags.cstutoringcenter;

import java.io.File;

public class Problem11 {
	
	File diceText;
	
	
	public static void main(String[] args) {
		
	}
	
	public Problem11(String file) {
		diceText = new File(file);
		if(!diceText.exists()){
			System.err.println("ERROR : Sorry The file is don't exits" );
		}
	}
	

}
