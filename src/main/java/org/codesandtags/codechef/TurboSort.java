package org.codesandtags.codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class TurboSort {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//Number of lines
		int lines = Integer.parseInt(br.readLine());
		int[] n = new int[lines];
		//Get the nums
		for (int i = 0; i < n.length; i++) {
			n[i] = Integer.parseInt(br.readLine());
		}
		//Sort the nums
		Arrays.sort(n);
		//Show the nums
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n.length; i++) {
			sb.append(n[i] + "\n");
		}
		System.out.println(sb);
	}
}
