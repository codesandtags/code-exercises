package org.codesandtags.scjp;

import javax.swing.JOptionPane;

/**
 * Aqui esta la magia 
 * @author Checho
 */
public class Actividad3 {

	
	// Aqui se guardara en arreglos la cantidad de estudiantes a procesar
	public static String nombres[];
	public static String codigos[];
	public static String cedulas[];
	public static int MAX_CEDULA = 10; //Maxima longitud de la cedula
	public static int MAX_NOMBRE = 40; //Maxima longitud del nombre
	public static String[][] prefijos = { 
			{"201225", "ING. SISTEMAS"}, 
			{"201230", "ING INDUSTRIAL"}, 
			{"201235","ING FINANCIERA"}
			};
	
	
	/**
	 * Metodo que se encarga de validar el nombre
	 * @param nombre
	 * @return
	 */
	public static String validarNombre(String nombre){
		
		if(nombre.length() > MAX_NOMBRE){
			JOptionPane.showMessageDialog(null, "Mierda, el nombre no puede ser superior a " + MAX_NOMBRE +" caracteres");
			return "";
		}else{
			return nombre;
		}
		
	}
	
	/**
	 * Metodo que se encarga de validar la cedula
	 * @param cedula
	 * @return
	 */
	public static String validarCedula(String cedula){
		
		if(cedula.length() > MAX_CEDULA){
			JOptionPane.showMessageDialog(null, "Mierda, la cedula no puede ser superior a " + MAX_CEDULA +" digitos");
			return "";
		}else{
			return cedula;
		}
		
	}
	
	
	/**
	 * Obtiene con el prefijo del codigo la carrera
	 * @param codigo
	 * @return
	 */
	public static String obtenerCarrera(String codigo){

		String carrera = "NO SE QUE ES";
		
		for (int i = 0; i < prefijos.length; i++) {
			if(codigo.startsWith(prefijos[i][0])){
				carrera = prefijos[i][1];
				break;
			}
		}
		
		return carrera;
		
		
	}
	
	
	/**
	 * Muestra los datos de las personas
	 */
	public static void mostrarDatos(){
		
		String datos = "";
		datos += "   Nombre    :   Cedula     :      Codigo      :      Carrera \n";
		//Se leen y se concatenan todos los datos
		for (int i = 0; i < nombres.length; i++) {
			datos += " " + nombres[i] + " : ";
			datos += " " + cedulas[i] + " : ";
			datos += " " + codigos[i] + " : ";
			datos += " " + obtenerCarrera(codigos[i])  + "\n";
		}
		
		JOptionPane.showMessageDialog(null, datos);
		
	}
	
	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		
		int n = 0;
		
		do{
			n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de estudiantes : "));
		}while(n < 0);
		
		
		// Aqui esta la magia donde se valida el ingreso de la cantidad de estudiantes
		// Se inicializan los arreglos para menter a los gatos
		nombres = new String[n];
		cedulas = new String[n];
		codigos = new String[n];
		// Se controla la cantidad de entradas con un while
		
		for (int i = 0; i < n; i++) {
			String nombre = "";
			String cedula = "";
			String codigo = "";
			
			// Aqui va la peticion de los datos
			
			// Nombres
			do{
				nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante " + (i + 1) + " : ");
				//Si el nombre es igual a blanco vuelve a pedirlo
			}while(validarNombre(nombre).equals(""));
			
			// Cedulas
			do{
				cedula = JOptionPane.showInputDialog("Ingrese la cedula del estudiante " + (i + 1) + " : ");
				//Si el nombre es igual a blanco vuelve a pedirlo
			}while(validarCedula(cedula).equals(""));
			
			// Codigos
			codigo = JOptionPane.showInputDialog("Ingrese el codigo del estudiante " + (i + 1) + " : ");
			
			//Se alimentan los datos generales
			nombres[i] = nombre;
			cedulas[i] = cedula;
			codigos[i] = codigo;
		}
		
		
		// Aqui esta la magia que muestra los datos
		mostrarDatos();
		
	}
}