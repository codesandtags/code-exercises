package org.codesandtags.ejercicios.ecci;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Clase que muestra una ventana de Login y simula la validacion de un usuario
 * tomado de un arreglo de datos definidos en la clase DAO.
 * 
 * Esta se la representacion de la vista
 * 
 * http://codesandtags.org
 * 
 */
public class Login extends JFrame implements ActionListener {

	// Atributos de la clase
	private Frame ventana;
	private Button botonValidar;
	private Label lusuario;
	private Label lclave;
	private TextField tusuario;
	private TextField tclave;
	private final int ancho = 400;
	private final int alto = 320;
	private final int x = 350;
	private final int y = 230;

	/**
	 * Constructor que pinta la ventana de Login
	 */
	public Login() {
		pintarVentana();
		eventosVentana();
	}

	/**
	 * Configuracion para pintar la ventana
	 */
	private void pintarVentana() {
		// Instancia de la ventana y titulo
		ventana = new Frame(".:: Acceso de Usuarios ::.");
		// Defino la posicion y el tamaño de la ventana
		ventana.setBounds(x, y, ancho, alto);
		ventana.setLayout(null);
		ventana.setBackground(Color.black);
		ventana.setForeground(Color.green);

		// Labels
		lusuario = new Label("Usuario : ");
		lusuario.setBounds(80, 100, 100, 25);
		lusuario.setFont(new Font("verdana", Font.TRUETYPE_FONT, 14));
		lclave = new Label("Clave    : ");
		lclave.setBounds(80, 130, 100, 25);
		lclave.setFont(new Font("verdana", Font.TRUETYPE_FONT, 14));

		// TextFields
		tusuario = new TextField();
		tusuario.setBounds(185, 100, 100, 25);
		tusuario.setForeground(Color.black);
		tusuario.setFont(new Font("verdana", Font.BOLD, 12));
		tclave = new TextField();
		tclave.setBounds(185, 130, 100, 25);
		tclave.setForeground(Color.black);
		tclave.setEchoChar('*');
		tclave.setFont(new Font("verdana", Font.BOLD, 12));

		// Botones
		botonValidar = new Button(" Validar ");
		botonValidar.setBounds(160, 250, 100, 30);
		botonValidar.addActionListener(this);
		botonValidar.setForeground(Color.black);

		// Adicion de componentes
		ventana.add(botonValidar);
		ventana.add(lusuario);
		ventana.add(lclave);
		ventana.add(tusuario);
		ventana.add(tclave);
	}

	/**
	 * Manejo de eventos de la ventana
	 */
	private void eventosVentana() {
		// Manejo de eventos de la ventana
		ventana.addWindowListener(new WindowAdapter() {
			// Cerrando ventana
			public void windowClosing(WindowEvent e) {
				System.out.println("Se ha cerrado la ventana");
				System.exit(0);
			}

			// Ventana abierta
			public void windowOpened(WindowEvent e) {
				System.out.println("Ventana abierta");
			}

			// Ventana activa
			public void windowActivated(WindowEvent e) {
				System.out.println("Ventana activa");
			}

			// Ventana inactiva
			public void windowDeactivated(WindowEvent e) {
				System.out.println("Ventana inactiva");
			}

			// Cuando se minimiza la ventana
			public void windowIconified(WindowEvent e) {
				System.out.println("Ventana minimizada");
			}

			// Cuando se maximiza la ventana
			public void windowDeiconified(WindowEvent e) {
				System.out.println("Ventana restaurada");
			}
		});

	}

	/**
	 * Manejo de eventos en la aplicacion en la interaccion con el usuario, por
	 * ejemplo el boton validar
	 */
	public void actionPerformed(ActionEvent e) {
		// Pulsar el boton validar
		if (e.getSource() == botonValidar) {
			String usuario = tusuario.getText();
			String clave = tclave.getText();

			Operaciones operacion = new Operaciones();

			if (operacion.validar(usuario, clave)) {
				JOptionPane.showMessageDialog(ventana, " Bienvenido " + usuario
						+ "!", " Validacion Login ",
						JOptionPane.INFORMATION_MESSAGE);
			} else {
				JOptionPane.showMessageDialog(ventana, " Acceso Denegado ",
						" Validacion Login ", JOptionPane.ERROR_MESSAGE);
			}
		}
	}

	/**
	 * Muestra la ventana
	 */
	public void mostrar() {
		ventana.setVisible(true);
	}

	/**
	 * Metodo main de la clase que se encarga el arreglo
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// Creacion del objeto login
		Login login = new Login();
		login.mostrar();
	}

}
