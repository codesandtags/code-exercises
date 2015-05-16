package org.codesandtags.cstutoringcenter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Problem15 {
	
	File diceText;
	
	public static void main(String[] args) {
		
		Problem15 solve = new Problem15("src/test/resources/plane.txt");
		solve.getStatistics();
		
	}
	
	public Problem15(String file) {
		diceText = new File(file);
		if(!diceText.exists()){
			System.err.println("ERROR : Sorry The file is don't exits" );
		}
	}
	
	public void getStatistics(){
		
		int quadI 	= 0;
		int quadII 	= 0;
		int quadIII	= 0;
		int quadIV 	= 0;
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(diceText));
			String line = "";
			
			while( (line = br.readLine()) != null){
				String[] coords = line.split(",");
				int x = Integer.parseInt(coords[0]);
				int y = Integer.parseInt(coords[1]);
				
				if(x >= 0 && y >= 0){
					quadI++;
				}else if(x <= 0 && y >= 0){
					quadII++;
				}else if(x <= 0 && y <= 0){
					quadIII++;
				}else if(x >= 0 && y <= 0){
					quadIV++;
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(" QUAD I   => " + quadI);
		System.out.println(" QUAD II  => " + quadII);
		System.out.println(" QUAD III => " + quadIII);
		System.out.println(" QUAD IV  => " + quadIV);
	}

}
