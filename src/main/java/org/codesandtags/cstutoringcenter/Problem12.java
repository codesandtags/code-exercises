package org.codesandtags.cstutoringcenter;

public class Problem12 {
	
	public static void main(String[] args) {
		
		Problem12 solve = new Problem12();
		System.out.println(solve.getF(105));
		System.out.println(solve.getG(105));
		
		System.out.println(solve.getF(105) * solve.getG(105));
	}

	
	public long getF(int x){
		//f(x) = 50x^3 - 46x^2 + 25x - 14
		long f = (long)( (50 * Math.pow(x, 3)) - (46 * Math.pow(x, 2)) + (25 * x) - 14);
		return f;
	}
	
	public long getG(int x){
		//g(x) = 49x^3 + 45x^2 - 20x^3 + 195x - 4
		long g = (long)( (49 * Math.pow(x, 3)) + (45 * Math.pow(x, 2)) 
				- (20 * Math.pow(x, 3)) + (195 * x) - 4);
		return g;
	}
}
