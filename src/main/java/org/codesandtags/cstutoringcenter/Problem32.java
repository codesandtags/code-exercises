package org.codesandtags.cstutoringcenter;

import java.math.BigInteger;
import java.util.ArrayList;

public class Problem32 {
	
	static ArrayList<String> numberPrimes = new ArrayList<String>();
	
	public static void main(String[] args) {
		Problem32 solve = new Problem32();
		
		BigInteger number = BigInteger.ZERO;
		String fibo = null;;
		int primes = 0;

		for (int i = 0; i < 250; i++) {
			number = solve.getFibonacci(i);
			
			if(number.isProbablePrime(1)){
				System.out.println(" Prime => " + number);
				primes++;
			}
			
		}
		
		System.out.println(" Primes ===> " + primes);

		
	}
	
	public BigInteger getFibonacci(long n){
		BigInteger a = BigInteger.ONE;
		BigInteger b = BigInteger.ZERO;
		
		for (int i = 0; i < n; i++) {
			a = a.add(b);
			b = a.subtract(b);
		}
		
		return b;
	}

}
