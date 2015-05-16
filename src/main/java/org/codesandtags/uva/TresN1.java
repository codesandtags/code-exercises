package org.codesandtags.uva;

class TresN1 {

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
	
	public static void main(String[] args) {
		
		TresN1 solve = new TresN1(1, 100);
		System.out.println(solve.contar3n1(22));
		int maximo = 1;
		int numero = 1;
		
		for(int i=1; i <= 1000000; i++){
			System.out.println(i + " => " + solve.contar3n1(i));
			
			if(solve.contar3n1(i) > maximo){
				maximo = solve.contar3n1(i);
				numero = i;
			}
		}
		
		System.out.println(numero + " : " + maximo);
	}
}