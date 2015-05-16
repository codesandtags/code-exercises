package org.codesandtags.cstutoringcenter;

import java.math.BigInteger;

public class Problem19 {
	
	public static void main(String[] args) {
		
		System.out.println(new Problem19().getTotalNumericalPatter(20));
		
	}
	
	public BigInteger getTotalNumericalPatter(int max){
		
		BigInteger number = BigInteger.ZERO;
		
		if (max > 1) {
			BigInteger exponent;
			for (int i = 1; i <= max; i++) {
				exponent = BigInteger.valueOf(i).pow(BigInteger.valueOf(i + 1).intValue());
				number = number.add(exponent);
			}	
		}
		
		return number;
	}

}
