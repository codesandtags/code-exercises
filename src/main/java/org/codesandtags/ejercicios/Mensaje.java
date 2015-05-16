package org.codesandtags.ejercicios;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * Muestra una ventana con un mensaje
 * 
 * @author codesandtags
 * 
 */
public class Mensaje extends JFrame {

	// Atributos de la clase
	String[] mensajes = { "Deja de perder el tiempo", "¿Ya estan las pruebas?" };
	Calendar tiempoFin, tiempoInicio;
	JLabel lmensaje;
	JLabel ltiempo;

	/**
	 * Constructor
	 */
	public Mensaje() {
		// Defino la hora de salida
		tiempoFin = Calendar.getInstance();
		tiempoFin.set(2011, 11, 24, 00, 00, 00);
		tiempoInicio = Calendar.getInstance();

		System.out.println(String.format("%1$tH:%1$tM:%1$tS", tiempoFin));
		System.out.println(String.format("%1$tH:%1$tM:%1$tS", tiempoInicio));

		// Configuracion de la ventana
		this.setSize(500, 300);
		this.setTitle(" .:: Testing POL ::. ");
		this.setLocation(getWidth() / 2, getHeight() / 2);
		this.setLayout(null);

		// Tiempo
		ltiempo = new JLabel("");
		ltiempo.setBounds(100, 10, 480, 180);
		ltiempo.setFont(new Font("verdana", Font.BOLD, 38));
		ltiempo.setForeground(Color.red);
		this.add(ltiempo);

		// Mensaje
		lmensaje = new JLabel("");
		lmensaje.setBounds(15, 50, 480, 180);
		lmensaje.setFont(new Font("verdana", Font.BOLD, 25));
		lmensaje.setForeground(Color.black);
		this.add(lmensaje);

		// Thread
		Thread hilo = new Thread(new Runnable() {
			public void run() {

				boolean activo = true;
				// Evalua que el hilo este activo
				Calendar faltante = Calendar.getInstance();

				tiempoFin.set(tiempoInicio.get(Calendar.HOUR) - Calendar.HOUR,
						tiempoFin.get(Calendar.HOUR));
				tiempoFin.set(Calendar.MINUTE, tiempoFin.get(Calendar.MINUTE)
						+ tiempoInicio.get(Calendar.MINUTE));

				Calendar tmp = Calendar.getInstance();
				while (activo) {
					try {
						// Duermo el hilo
						Thread.sleep(1000);
						tiempoFin.add(Calendar.SECOND, -1);
						int horas = tiempoFin.get(Calendar.HOUR)
								- tmp.get(Calendar.HOUR);
						int minutos = tiempoFin.get(Calendar.MINUTE)
								- tmp.get(Calendar.MINUTE);
						int segundos = tiempoFin.get(Calendar.SECOND)
								- tmp.get(Calendar.SECOND);

						// ltiempo.setText(String.format("%2d : %2d : %2d ",horas,
						// minutos, segundos));
						ltiempo.setText(String.format("%1$tH :%1$tM : %1$tS ",
								tiempoFin));
						lmensaje.setText(" Falta para el despliegue ");
						// Resto 1 segundo
					} catch (Exception e) {
						e.printStackTrace();
					}
				}

			}
		});

		hilo.start();
		// Se muestra la pantalla
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Mensaje mensaje = new Mensaje();
	}

}
