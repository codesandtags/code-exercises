package org.codesandtags.codingbat;

public class Main {
	public static void main(String[] args) {

		Main problem = new Main();

//		int[] cosa = { 1, 1, 2, 2, 1, 2, 1 };
//		System.out.println(problem.noTriples(cosa));
//		System.out.println(problem.stringMatch("xxcaazz", "xxbaaz"));
//		System.out.println(problem.stringMatch("aaxxaaxx", "iaxxai"));
//		System.out.println(problem.stringMatch("iaxxai", "aaxxaaxx"));

		
//		int[] cosa = {1, 2, 7, 1};
//		int[] cosa = {1, 2, 8, 1};
		int[] cosa = {2, 7, 4};
		System.out.println(problem.has271(cosa));
		

	}

	public boolean noTriples(int[] nums) {
		boolean noTin = true;
		for (int i = 0; i < nums.length; i++) {
			if (i + 2 < nums.length && nums[i] == nums[i + 1]
					&& nums[i] == nums[i + 2]) {
				noTin = false;
				break;
			}
		}
		return noTin;
	}

	public int stringMatch(String a, String b) {
		int positions = 0;
		// when have the same length
		if (a.length() >= b.length()) {
			for (int i = 0; i < b.length() - 1; i++) {
				System.out.println(a.substring(i, i + 2) + " : "
						+ b.substring(i, i + 2));
				if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
					positions++;
				}
			}
		} else {
			for (int i = 0; i < a.length() - 1; i++) {
				System.out.println(a.substring(i, i + 2) + " : "
						+ b.substring(i, i + 2));
				if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
					positions++;
				}
			}
		}

		return positions;
	}

	public boolean has271(int[] nums) {
		boolean has271 = false;		
		for (int i = 0; i < nums.length; i++) {
			if((i+2) < nums.length){
				int a = nums[i];
				int b = nums[i+1];
				int c = nums[i+2];
				System.out.println(a + ":" + b + ":" + c);
				if( (b - a) == 5 && ((a - c) >= 2 && (a - c) <=2)){
					has271=true;
					break;
				}
			}
		}

		return has271;
	}

}
