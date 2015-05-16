package org.codesandtags.projecteuler;

/**
 * Starting in the top left corner of a 22 grid, there are 6 routes (without
 * backtracking) to the bottom right corner.
 * 
 * @author codesandtags
 * 
 */

public class Problem15 {
	
	public static void main(String[] args){
		
		Problem15 solve = new Problem15();
		//Obtiene todas las rutas posibles
		System.out.println(solve.getRoutes(2, 2));
		
	}
	
	public static int getRoutes(int x, int y){
		int routes = 0;
		int[][] grid = new int[x][y];
		
		
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				
			}	
		}
		
		
		routes += 1; //Left to Right and Down
		routes += 1; //Top to Down and Right
		
		return routes;
	}
}
