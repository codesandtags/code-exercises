package org.codesandtags.cstutoringcenter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Problem20 {
	
	File file;
	
	public static void main(String[] args) {
		
		System.out.println(new Problem20("src/test/resources/decimals.txt").getTotalOnes());
		
	}
	
	public Problem20(String file) {		
		this.file = new File(file);
		if(!this.file.exists()){
			System.err.println("ERROR : El archivo no existe");
		}
	}
	
	public int getTotalOnes(){
		int totalOnes = 0;
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = "";
			
			while( (line = br.readLine()) != null ){
				
				line = getBinary(Integer.parseInt(line));
				System.out.println("=>" + line);
				
				for (int i = 0; i < line.length(); i++) {
					String number = String.valueOf(line.charAt(i));
					if(number.equals("1")){
						totalOnes++;
					}
				}
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return totalOnes;
	}
	
	public String getBinary(int number){
		return Integer.toBinaryString(number);
	}
}
