package org.codesandtags.scjp;

public class EjemploHilos extends Thread implements Runnable {

	public static void main(String[] args) {

		// Ejemplo de un hilo extendido
		HiloExtendido hiloextendido = new HiloExtendido();
		hiloextendido.setVelocidad(300);
		hiloextendido.setRepeticiones(5);
		// Se cambia el estado de los hilos para que comiencen a ejecutarse
		hiloextendido.start();

		// Ejemplo de un hilo
		// Aqui se muestra la ventaja de utilizar la implementacion de un hilo
		// Con Runnable, ya que se puede utilizar en el constructor de Thread
		// Y ampliar sus caracteristicas
		HiloImplementado hiloimplementado = new HiloImplementado();
		hiloimplementado.setVelocidad(100);
		hiloimplementado.setRepeticiones(10);

		Thread t1 = new Thread(hiloimplementado, "pollo");
		Thread t2 = new Thread(hiloimplementado, "perro");

		t1.start();
		t2.start();

	}

}

/**
 * Este hilo se extiende de la clase Thread, donde se debe implementar el metodo
 * run(), donde estara la magia
 */
class HiloExtendido extends Thread {

	private int repeticiones;
	private int velocidad;

	public void run() {

		Thread.currentThread().setName("HiloExtendido");
		System.out.println("Hilo : " + Thread.currentThread().getName());
		for (int i = 0; i < repeticiones; i++) {
			System.out.println("Habia una vez " + (i + 1) + " iguana(s)...");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	/**
	 * Define la cantidad de repeticiones utilizadas en la iteracion del bucle
	 * for
	 * 
	 * @return
	 */
	public int getRepeticiones() {
		return repeticiones;
	}

	public void setRepeticiones(int repeticiones) {
		this.repeticiones = repeticiones;
	}

	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Define la velocidad en milisegundos con la que sera dormido el hilo
	 * 
	 * @param velocidad
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

}

/**
 * Este Hilo utiliza la interface Runnable, la cual obliga a que se implemente
 * el metodo run() donde estara la magia de lo que haga el hilo
 */
class HiloImplementado implements Runnable {

	private int repeticiones;
	private int velocidad;

	/*
	 * Implementacion del metodo run, de la interface Runnable
	 * 
	 * @see java.lang.Runnable#run()
	 */
	public void run() {

		String nombreHilo = Thread.currentThread().getName();
		System.out.println("Hilo : " + nombreHilo);
		for (int i = 0; i < repeticiones; i++) {
			System.out.println("Habia una vez " + (i + 1) + " " + nombreHilo
					+ "(s)...");
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	/**
	 * Define la cantidad de repeticiones utilizadas en la iteracion del bucle
	 * for
	 * 
	 * @return
	 */
	public int getRepeticiones() {
		return repeticiones;
	}

	public void setRepeticiones(int repeticiones) {
		this.repeticiones = repeticiones;
	}

	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Define la velocidad en milisegundos con la que sera dormido el hilo
	 * 
	 * @param velocidad
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

}
