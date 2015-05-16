package org.codesandtags.scjp;

public class EjemploHiloSincronizado {

	public static void main(String[] args) {

		HiloSincronizado hilo = new HiloSincronizado();
		Thread t1 = new Thread(hilo, "h-1");
		Thread t2 = new Thread(hilo, "h-2");
		Thread t3 = new Thread(hilo, "h-3");
		Thread t4 = new Thread(hilo, "h-4");
		Thread t5 = new Thread(hilo, "h-5");

		t1.run();
		t2.run();
		t3.run();
		t4.run();
		t5.run();
	}

}

class HiloSincronizado implements Runnable {

	Accesos acceso;

	public HiloSincronizado() {
		acceso = new Accesos();
	}

	public void run() {
		int actual = acceso.getContador();
		actual++;
		acceso.setContador(actual);
		// Cantidad de accesos
		System.out.println("Total accesos [" + Thread.currentThread().getName()
				+ "]: " + acceso.getContador());
	}
}

class Accesos {

	private int contador;

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
}