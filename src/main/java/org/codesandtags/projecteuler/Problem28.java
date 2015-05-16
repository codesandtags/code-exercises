package org.codesandtags.projecteuler;

/**
 * Starting with the number 1 and moving to the right in a clockwise direction a
 * 5 by 5 spiral is formed as follows:
 * 
 *  21 22 23 24 25
 *  20  7  8  9 10
 *  19  6  1  2 11
 *  18  5  4  3 12
 *  17 16 15 14 13
 * 
 * It can be verified that the sum of the numbers on the diagonals is 101.
 * 
 * What is the sum of the numbers on the diagonals in a 1001 by 1001 spiral
 * formed in the same way?
 * 
 * @author codesandtags
 * 
 */

public class Problem28 {
	
	public static void main(String[] args) {
		Problem28 solve = new Problem28();
		System.out.println("The sum is 5 x 5 : " + solve.getSumDiagonalSpiral(5) );
	}
	
	
	public int getSumDiagonalSpiral(int size){
		
		int sum = 0;
		int[][] spiral = new int[size][size];
		spiral = fillSpiral(spiral);
		showSpiral(spiral);
		
		return sum;
	}
	
	public int[][] fillSpiral(int matriz[][]){
		
		//Se obtiene la posicion central de la matriz para empezar a llenar
		int number = 1;
		int x = matriz.length / 2;
		int y = matriz.length / 2;
		int flag = 0; //Bandera para saber que recorrido realizar
		
		System.out.println("x : " + x + " -- y : " + y);
		//Se empieza llenando la mitad
		matriz[x][y] = 7;
		
		while(number < matriz.length){
			
			//Se parte del centro y se juega con las coordenadas x, y
			switch (flag) {
				case 0: //izquierda derecha
					for (int i = y; i < matriz[0].length; i++, y++) {
						matriz[x][y] = number++;
					}
					flag++;
					x++;
					y=0;
				break;
				case 1:
					
					flag++;
				break;
				case 2:
					
					flag++;
				break;
				case 3:
					
					flag = 0;
				break;
			}
			
			number++;
		}
			
		
		return matriz;
	}
	
	public void showSpiral(int matriz[][]){
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[0].length; j++) {
				System.out.print(" " + matriz[i][j]);
			}
			System.out.println("");
		}
	}

}
