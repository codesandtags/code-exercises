package org.codesandtags.projecteuler;

public class Problem136 {
	public static void main(String[] args) {
		Problem136 solve = new Problem136();
		System.out.println("The number of solutions for 20 is : "
				+ solve.getSolutionByEquation(20));
		System.out.println("The number of solutions for 1000 is : "
				+ solve.getSolutionByEquation(1000));

	}

	public int getSolutionByEquation(int n) {
		int solutions = 0;

		for (int x = 0; x <= n; x++) {
			for (int y = 0; y <= x; y++) {
				for (int z = 0; z <= y; z++) {
					long equation = (x * x) - (y * y) - (z * z);
					if (equation == n && (x - y) == (y - z)) {
						System.out.println(x + "-" + y + "-" + z + "=>" + equation);
						solutions++;
					}
				}
			}
		}

		return solutions;
	}
}
