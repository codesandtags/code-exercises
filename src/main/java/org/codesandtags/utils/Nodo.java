package org.codesandtags.utils;

import javax.swing.JOptionPane;

public class Nodo {

	int valor;
	Nodo sig;

	public Nodo() {
		this.sig = null;
	}

	public Nodo(int x) {
		this.valor = x;
		this.sig = null;
	}

	void insert(int x) {
		Nodo n = new Nodo(x);
		n.sig = this.sig;
		this.sig = n;
	}

	public static void main(String[] args) {
		// TODO code application logic here
		Nodo cabeza = new Nodo();
		boolean crear = true;

		while (crear != false) {

			int x = Integer.parseInt(JOptionPane
					.showInputDialog("Ingrese el valor del nodo"));
			cabeza.insert(x);
			
			System.out.println("Nodo creado : " + cabeza);
			
			int pregunta = Integer
					.parseInt(JOptionPane
							.showInputDialog("Desea crear otro nodo ? \n Ingrese 1 para crear otro o ingrese otro valor para no seguir creando"));

			if (pregunta != 1) {
				crear = false;
			}
		}
		
		int x = 0;
		while(cabeza.sig != null){
		
			System.out.println("Nodo  > " + cabeza);
			System.out.println("Valor > " + cabeza.valor);
			
			if(x == 10) break;
			x++;
		}
	}
}
