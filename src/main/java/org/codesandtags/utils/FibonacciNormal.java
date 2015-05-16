package org.codesandtags.utils;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class FibonacciNormal {
	public static void main(String[] args) throws IOException{
		
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String linea = "";
		StringTokenizer st;
		
		while( (linea = input.readLine()) != null){
			if(linea.equals("0 0")) return;
			st = new StringTokenizer(linea);
			long n = Long.parseLong(st.nextToken());
			
			fibo(n);
		}
		
	}
	
	public static void fibo(long n){
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ONE;
		for (int i = 0; i < n; i++) {
			a = a.add(b);
			b = a.subtract(b);
			System.out.println(b);
		}
	}
}
