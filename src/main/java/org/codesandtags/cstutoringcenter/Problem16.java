package org.codesandtags.cstutoringcenter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Problem16 {
	
	File file;
	
	public static void main(String[] args) {
		
		System.out.println(new Problem16("src/test/resources/blackjacks.txt").getTotalBlackJack());
		
	}
	
	public Problem16(String file) {		
		this.file = new File(file);
		if(!this.file.exists()){
			System.err.println("ERROR : El archivo no existe");
		}
	}
	
	public int getTotalBlackJack(){
		int totalBlackJack = 0;
		BufferedReader br;
		
		try {
			br = new BufferedReader(new FileReader(file));
			String line = "";
			
			while( (line = br.readLine()) != null ){
				
				StringTokenizer st = new StringTokenizer(line, " ");
				
				int player1 = getTotalCards(st.nextToken(), st.nextToken());
				int player2 = getTotalCards(st.nextToken(), st.nextToken());
				int player3 = getTotalCards(st.nextToken(), st.nextToken());
				
				if(player1 == 21){
					totalBlackJack++;
				}
				if(player2 == 21){
					totalBlackJack++;
				}
				if(player3 == 21){
					totalBlackJack++;
				}
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return totalBlackJack;
	}
	
	public int getTotalCards(String c1, String c2){
		int total = 0;
		
		if(c1.matches("[A][HDCS]") || c2.matches("[A][HDCS]")){
			total += 11;	
		}
		if(c1.matches("(10|[JQK])[HDCS]") || c2.matches("(10|[JQK])[HDCS]")){
			total += 10;
		}
		
		
		if(total == 21){
			System.out.println(c1 + " " + c2 + " :: " + total);
		}
		
		return total;
	}

	
	
}
