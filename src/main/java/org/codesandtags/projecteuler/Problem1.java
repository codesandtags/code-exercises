package org.codesandtags.projecteuler;

/**
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
 * get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the
 * multiples of 3 or 5 below 1000.
 * 
 * @author codesandtags
 * 
 */

public class Problem1 {

	public static void main(String[] args) {

		Problem1 solve = new Problem1();
		System.out.println("Below 10 : " + solve.sumBelowMultiples(10));
		System.out.println("Below 1000 : " + solve.sumBelowMultiples(1000));

	}

	public long sumBelowMultiples(int n) {
		long sum = 0;
		for (int i = 0; i < n; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum += i;
				continue;
			}
		}
		return sum;
	}

}
