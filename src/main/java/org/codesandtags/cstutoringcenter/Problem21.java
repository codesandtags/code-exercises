package org.codesandtags.cstutoringcenter;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Problem21 {
	
	File file;
	
	public static void main(String[] args) {
		
		System.out.println(new Problem21("src/test/resources/decimalsB.txt").getTotalHexaD());
		
	}
	
	public Problem21(String file) {		
		this.file = new File(file);
		if(!this.file.exists()){
			System.err.println("ERROR : El archivo no existe");
		}
	}
	
	public int getTotalHexaD(){
		int totalOnes = 0;
		
		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(file));
			String line = "";
			
			while( (line = br.readLine()) != null ){
				
				line = getHexadecimal(Integer.parseInt(line)).toUpperCase();
				System.out.println("=>" + line);
				
				for (int i = 0; i < line.length(); i++) {
					String number = String.valueOf(line.charAt(i));
					if(number.equals("D")){
						totalOnes++;
					}
				}
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
		
		return totalOnes;
	}
	
	public String getHexadecimal(int number){
		return Integer.toHexString(number);
	}
}
