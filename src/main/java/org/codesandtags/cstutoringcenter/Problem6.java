package org.codesandtags.cstutoringcenter;

import java.math.BigInteger;

public class Problem6 {
	
	public static void main(String[] args) {
		
		BigInteger sum = BigInteger.ZERO;
		int a = 1;
		int b = 2;
		Problem6 solve = new Problem6();
		
		for (int i = 1; i <= 16; i++) {
			//System.out.println(solve.getFunction(a, b));
			sum = sum.add( solve.getFunction(a, b) );			
			System.out.println(i + ":" + solve.getFunction(a, b) + " => " + sum);
			a++;
			b++;
		}
		
		System.out.println(" => " + sum);
	}
	
	public BigInteger getFunction(int a, int b){
		
		BigInteger ba = BigInteger.valueOf(a);
		BigInteger bb = BigInteger.valueOf(b);
		BigInteger result = ba.pow(bb.intValue()).add(bb.pow(ba.intValue()));
		return result;
	}

}
