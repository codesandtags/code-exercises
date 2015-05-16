package org.codesandtags.uva;

/**
 * 100 - The 3n + 1 Solucion
 * Uva Judge
 */

//Librerias necesarias para correr el programa
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String linea = null;
		int a, b;
		while( (linea = br.readLine()) != null ){
			StringTokenizer st = new StringTokenizer(linea);
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			TresN1 tresn1 = new TresN1(a, b);
			System.out.println(a + " " + b + " " + tresn1.contarCiclos());
		}
	}

	public static class TresN1 {

		//Variables 
		private int menor;
		private int mayor;

		//Definicion del numero menor y mayor
		public TresN1(int a, int b) {
			if (a < b) {
				menor = a;
				mayor = b;
			} else {
				menor = b;
				mayor = a;
			}
		}
		
		/**
		 * Se obtiene el mayor numero de ciclos del rango de numeros
		 * @return
		 */
		public int contarCiclos() {
			int ciclos = 0;
			int maximo = 1;
			while (menor <= mayor) {
				ciclos = contar3n1(menor++);
				if (ciclos > maximo) {	maximo = ciclos;	}
			}
			return maximo;
		}
		
		/**
		 * Se obtiene la cantidad ciclos en el recorrido del 3n + 1
		 * @param x
		 * @return
		 */
		public static int contar3n1(int x) {
			int n = 1;
			while (x > 1) {
				if (x == 1)
					return n;
				if (x % 2 == 0)
					x >>= 1; //Operacion binaria
				else
					x = (x * 3) + 1;
				n++;
			}
			return n;
		}
	}
}
