package org.codesandtags.cstutoringcenter;

public class Problem7 {

	public static void main(String[] args) {

		System.out.println(new Problem7().getFunction(50));
	}

	public double getFunction(int x) {

		double f = (Math.pow(4, x) + Math.pow(x, 3) + Math.pow(x, 2) + 
					x - Math.pow(2, x)) / Math.pow(3, x);

		return f;
	}

}
