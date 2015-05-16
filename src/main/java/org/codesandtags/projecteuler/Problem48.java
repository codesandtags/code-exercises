package org.codesandtags.projecteuler;

import java.math.BigInteger;

public class Problem48 {
	public static void main(String[] args) {

		Problem48 solve = new Problem48();
		System.out.println("The Sum of Serie with 10 is : "
				+ solve.getSumOfSerie(10));

		String result = solve.getSumOfSerie(1000);
		System.out.println("The Sum of Serie with 1000 is : "
				+ result.substring(result.length() - 10, result.length()));

	}

	public String getSumOfSerie(int maxSerie) {
		BigInteger sumSerie = BigInteger.ZERO;
		for (int i = 1; i <= maxSerie; i++) {
			BigInteger serie = BigInteger.valueOf(i).pow(i);
			sumSerie = sumSerie.add(serie);
		}
		return sumSerie.toString();
	}

}
