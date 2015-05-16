package org.codesandtags.cstutoringcenter;

public class Problem1 {
	
	public static void main(String[] args) {
		
		Problem1 solve = new Problem1();
		System.out.println(solve.getSumFactorial(15));
		
	}
	
	public long getSumFactorial(int factorial){
		
		long sum = 0;
		long fac = 1;
		
		for (int i = 1; i <= factorial; i++) {
			fac *= i;
			sum += fac;
		}
		
		return sum;
	}
}
