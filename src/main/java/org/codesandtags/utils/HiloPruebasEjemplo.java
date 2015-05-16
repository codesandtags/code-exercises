package org.codesandtags.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HiloPruebasEjemplo extends Thread {

	private boolean continuar = true;

	public void detenerHilo() {
		continuar = false;
	}

	public void run() {

		while (continuar) {
			leerTeclado();
			try {
				sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public void leerTeclado() {
		BufferedReader br;
		String linea = null;
		try {
			System.out.print("Ingrese dato : ");
			br = new BufferedReader(new InputStreamReader(System.in));
			linea = br.readLine();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.err.println("Texto ingresado : " + linea);
		}
	}

	public static void main(String[] args) {
		HiloPruebasEjemplo hilo = new HiloPruebasEjemplo();
		hilo.start();
	}
}
