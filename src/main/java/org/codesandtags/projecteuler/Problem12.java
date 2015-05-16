package org.codesandtags.projecteuler;

import java.util.Calendar;


public class Problem12 {
	public static void main(String[] args){
		Problem12 solve = new Problem12();
		System.out.println(" " + solve.getTheFirstTriangle(4));
		System.out.println(" " + solve.getTheFirstTriangle(6));
		System.out.println(" " + solve.getTheFirstTriangle(500));
		
	}

	public int getTheFirstTriangle(int divisors){
		Calendar inicio = Calendar.getInstance();
		int term    = 0;
		int triangle = 0;
		int ndivisors = 0;
		
		for (int i = 1; ndivisors < divisors; i++) {
			ndivisors = 0;
			triangle += i;
			term++;
			
			//Obtiene la cantidad de divisores
			for (int k = 1; k <= triangle; k++) {
				if(triangle % k == 0){
					ndivisors++;
				}
			}
		}
		System.out.println("term : " + term + " : triangle : " + triangle + " : divisors : " + divisors);
		Calendar fin = Calendar.getInstance();
		System.out.println("Tiempo : " + (fin.getTimeInMillis() - inicio.getTimeInMillis()));
		return triangle;
	}
	
}
