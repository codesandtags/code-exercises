package org.codesandtags.codechef;

//http://chaosinmotion.com/blog/?p=622
//http://www.luschny.de/math/factorial/FastFactorialFunctions.htm
//http://www.luschny.de/math/factorial/FactorialDigits.html
//http://www.mates-fskyqmk.net/mates/img%20facpolinomios/factpol.pdf

import java.util.Scanner;
public class FactorialBTS {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		for(int i=0; i<times; i++){
			long n = sc.nextLong();
			System.out.println(getZeros(n));
		}
	}
	/**
	 * Return the n zeros in the factorial
	 * @param n
	 * @return
	 */
	static long getZeros(long n){
		int zeros = 0;
		while(n > 0){
			n /= 5;
			zeros += n;
		}
		return zeros;
	}
}
