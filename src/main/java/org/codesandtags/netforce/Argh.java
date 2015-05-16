package org.codesandtags.netforce;
/**
 * Solucion al reto de netforce
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Argh {

	private String secuence = "123";
	private int[][] tablero;
	private String rutaArchivo;

	public static void main(String[] args) {
		System.out.println("Aqui comienza la magia");
		Argh reto = new Argh();
		reto.setArchivo("resources/argh.in");
		System.out.println(reto.getDatos());
		System.out.println(reto.getSolucion());
		
	}
	
	public void setArchivo(String rutaArchivo){
		this.rutaArchivo = rutaArchivo;
	}

	public String getDatos() {
		StringBuilder datos = new StringBuilder();

		try {
			BufferedReader archivo = new BufferedReader(new FileReader(
					rutaArchivo));
			
			//Variables para crear el tablero de datos
			String linea = "";
			int columnas = 0;
			int filas    = 0;
			//Realiza la lectura del archivo			
			while( (linea = archivo.readLine()) != null ){
				if(columnas == 0) columnas = linea.length();
				filas++;
				datos.append(linea).append("\n");
			}
			//crea el tamano del tablero
			tablero = new int[filas][columnas];
			
			archivo.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		//Se devuelven los datos
		return datos.toString();
	}
	
	public int getSolucion(){
		//Variables
		int totalSecuencias 	= 0;
		int izquierda = 0, derecha = 0, arriba = 0, abajo = 0, 
				diaDerecha = 0, diaIzquierda = 0, diaArriba = 0, diaAbajo = 0;
		StringTokenizer st 		= new StringTokenizer(getDatos(),"\n");
		boolean esSecuencia 	= false;
		
		//Mete los datos al tablero
		for(int i = 0; i < tablero.length; i++){
			String linea = st.nextToken();
			for (int k = 0; k < tablero[0].length; k++) {
				tablero[i][k] = Integer.parseInt("" + linea.charAt(k));
			}
		}
		
		//Obtiene las secuencias horizontales izq - der
		for(int i = 0; i < tablero.length; i++){
			for (int k = 0; k <= tablero[0].length - secuence.length(); k++) {
				String pedazo = "";	
				for (int m = 0; m < secuence.length(); m++) {
					pedazo += tablero[i][k + m];
				}
				if(pedazo.equals(secuence))		derecha++;
			}
		}
		
		//Obtiene las secuencias horizontales der - izq
		for(int i = 0; i < tablero.length; i++){
			for (int k = tablero[0].length - secuence.length(); k >= 0 ; k--) {
				String pedazo = "";	
				for (int m = secuence.length(); m > 0 ; m--) {
					pedazo += tablero[i][k + m - 1];
				}
				if(pedazo.equals(secuence))		izquierda++;
			}
		}
		
		//Obtiene las secuencias verticales arr - aba
		for(int i = 0; i < tablero.length; i++){
			for (int k = 0; k <= tablero[0].length - secuence.length(); k++) {
				String pedazo = "";	
				for (int m = 0; m < secuence.length(); m++) {
					pedazo += tablero[k + m][i];
				}
				if(pedazo.equals(secuence))		arriba++;				
			}
		}
		
		//Obtiene las secuencias verticales aba - arr
		for(int i = 0; i < tablero.length; i++){
			for (int k = tablero[0].length - secuence.length(); k >= 0 ; k--) {
				String pedazo = "";	
				for (int m = secuence.length(); m > 0 ; m--) {
					pedazo += tablero[k + m - 1][i];
				}
				if(pedazo.equals(secuence))		abajo++;
			}
		}
		
		//Obtiene las secuencias diagonales izq - der - arr - aba
		for(int i = 0; i <= tablero.length - secuence.length(); i++){
			for (int k = 0; k <= tablero[0].length - secuence.length(); k++) {
				String pedazo = "";	
				for (int m = 0; m < secuence.length(); m++) {
					pedazo += tablero[i + m][k + m];
				}
				if(pedazo.equals(secuence))		diaDerecha++;
			}
		}
		
		//Obtiene las secuencias diagonales der - izq - arr - aba
		for(int i = 0; i <= tablero.length - secuence.length(); i++){
			for (int k = tablero[0].length - secuence.length(); k >= 0 ; k--) {
				String pedazo = "";				
				for (int m = secuence.length(); m > 0; m--) {
					pedazo += tablero[i + m - 1][k + m - 1];
				}
				if(pedazo.equals(secuence))		diaIzquierda++;
			}
		}
		
		//Obtiene las secuencias diagonales izq - der - aba - arr
		for(int i = tablero.length - 1; i >= secuence.length() - 1 ; i--){
			for (int k = 0; k <= tablero[0].length - secuence.length(); k++) {
				String pedazo = "";	
				for (int m = 0; m < secuence.length(); m++) {
					pedazo += tablero[i - m][k + m];
				}
				if(pedazo.equals(secuence))		diaArriba++;				
			}
		}
		
		//Obtiene las secuencias diagonales izq - der - aba - arr
		for(int i = tablero.length; i >= secuence.length() ; i--){
			for (int k = tablero[0].length - secuence.length(); k >= 0; k--) {
				String pedazo = "";	
				for (int m = secuence.length(); m > 0 ; m--) {
					pedazo += tablero[i - m][k + m - 1];
				}
				if(pedazo.equals(secuence))		diaAbajo++;				
			}
		}
		
		
		System.out.println("derecha : " + derecha);
		System.out.println("izquierda : " + izquierda);
		System.out.println("arriba : " + arriba);
		System.out.println("abajo : " + abajo);
		System.out.println("diaDerecha : " + diaDerecha);
		System.out.println("diaIzquierda : " + diaIzquierda);
		System.out.println("diaArriba : " + diaArriba);
		System.out.println("diaAbajo : " + diaAbajo);
		
		totalSecuencias = izquierda + derecha + arriba + abajo
				+ diaDerecha + diaIzquierda + diaArriba + diaAbajo;
		
		System.out.println("Total : " + totalSecuencias);
		
		return totalSecuencias;
	}
}