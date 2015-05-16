package org.codesandtags.sql;

import java.awt.ScrollPane;
import java.sql.DatabaseMetaData;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MostrarDatosJTable extends JFrame {

	JScrollPane scroll;
	JTable tabla;
	DefaultTableModel datos;

	/**
	 * Constructor, que configura la ventana y muestra el JScrollPane con un
	 * JTable incluido
	 */
	public MostrarDatosJTable() {
		// Configuracion del JFrame
		this.setLayout(null);
		this.setSize(340, 260);
		this.setTitle(" Ejemplo de JScrollPane ");
		configurarJScrollPane();
	}

	public void configurarJScrollPane() {
		// Datos de la tabla
		datos = new DefaultTableModel();
		// Adicion Columnas de la tabla
		datos.addColumn("id");
		datos.addColumn("Pais");
		datos.addColumn("Continente");
		
		Object[] objectos = {"cosa","a"};
		
		//Recuperacion de los datos
		//datos.addRow(Object{"a"});
		
		
		//Adicion de los datos a la tabla
		tabla = new JTable(datos);

		// Configuracion del Scroll y adicion al JFrame
		scroll = new JScrollPane(tabla);
		scroll.setBounds(10, 10, 300, 200);
		this.add(scroll);
	}

	public void mostrarVentana() {
		this.setVisible(true);
	}

	/**
	 * Ejemplo
	 */
	public static void main(String args[]) {
		MostrarDatosJTable ejemplo = new MostrarDatosJTable();
		ejemplo.mostrarVentana();
	}
}
