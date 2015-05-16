package org.codesandtags.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class EnormousInput {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input);		
		// Lines in the input
		int lines = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		// Times that k is divisible by t
		int times = 0;
		for(int i = 0; i < lines; i++){
			if(Integer.parseInt(br.readLine())%k == 0){
				times++;
			}
		}
		System.out.println(times);
	}
}