package org.codesandtags.cstutoringcenter;

import java.math.BigInteger;

public class Problem24 {

	public static void main(String[] args) {
		
		Problem24 solve = new Problem24();
		
		BigInteger result = solve.getCombination(17, 10).
				subtract(solve.getCombination(30, 12)).
				add(solve.getCombination(50, 3));
		
		System.out.println(" => " + result);
		System.out.println(solve.getFactorial(4));
		System.out.println(solve.getFactorial(5));
		System.out.println(solve.getFactorial(6));

	}
	
	
	public BigInteger getCombination(int n, int r){
		
		BigInteger combination = getFactorial(n).
				divide(getFactorial(r).multiply(getFactorial(n-r)));
		
		return combination;
	}
	
	
	public BigInteger getFactorial(int number){
		BigInteger factorial = BigInteger.ONE;
		for (int i = 1; i <= number; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}

}
