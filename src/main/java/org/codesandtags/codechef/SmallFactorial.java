package org.codesandtags.codechef;

import java.math.BigInteger;
import java.util.Scanner;
public class SmallFactorial {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Lines to processs
		int lines = sc.nextInt();
		for(int i = 0;  i < lines; i++){
			int n = sc.nextInt();
			BigInteger fac = BigInteger.ONE;
			//Get the Factorial
			for (int j = 1; j <= n; j++) {
				fac = fac.multiply(BigInteger.valueOf(j));
			}
			System.out.println(fac);
		}
	}
}
