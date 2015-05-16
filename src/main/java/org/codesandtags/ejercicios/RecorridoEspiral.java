package org.codesandtags.ejercicios;

/**
 * Clase que se encarga de mostrar un ejemplo del recorrido en espiral de 
 * una matriz / arreglo bidimensional
 * 
 * http://codesandtags
 */

public class RecorridoEspiral {
	public static void main(String[] args) {
		// Declaracion del arreglo bidimensional : Cuadrado
		int[][] matriz = new int[3][8];

		// Lleno el arreglo
		for (int i = 0; i < matriz.length; i++) {
			for (int m = 0; m < matriz[0].length; m++) {
				matriz[i][m] = (int) (Math.random() * 100);
			}
		}

		System.out.println("Tamano en X : " + matriz.length);
		System.out.println("Tamano en Y : " + matriz[0].length);
		
		// Lleno el arreglo
		System.out.println("\nMostrando matriz : ");
		for (int i = 0; i < matriz.length; i++) {
			for (int m = 0; m < matriz[0].length; m++) {
				System.out.print(" " + matriz[i][m]);
			}
			System.out.println("");
		}
		
		int x = 0; //Para manejar las filas
		int y = 0; //Para manejar las columnas
		int flag = 0;  //Bandera para saber que recorrido se debe realizar 
		int n = 0; //Contador de elementos
		//Total de elementos en la matriz
		int elementos = matriz.length * matriz[0].length;
		
		// Recorrido en espiral
		System.out.println("\nMostrando recorrido en espiral");
		while (n < elementos) {
			//System.out.println("\nFlag : " + flag);
			switch (flag) {
			case 0: // Recorrido de izquierda a derecha
				for (int m = x; m < matriz[0].length - y; m++) {
					System.out.print(" " + matriz[x][m]);
					n++;
				}
				flag++;
				break;

			case 1: //Recorrido de arriba abajo
				for (int m = x + 1; m < matriz.length - x; m++) {
					System.out.print(" " + matriz[m][matriz[0].length - 1 - y]);
					n++;
				}
				flag++;
				break;
			
			case 2: //Recorrido de derecha a izquierda
				for (int m = matriz[0].length - 2 - y; m >= y; m--) {
					System.out.print(" " + matriz[matriz.length - 1 - x][m]);
					n++;
				}
				flag++;
				break;
				
			case 3: //Recorrido de abajo a arriba
				for (int m = matriz.length - 2 - x; m >= x + 1; m--) {
					System.out.print(" " + matriz[m][y]);
					n++;
				}
				flag = 0;
				//Se aumentan las filas y las columnas para un subnivel en el espiral 
				x++;
				y++;
				break;
			}	
			
		}

	}
}
