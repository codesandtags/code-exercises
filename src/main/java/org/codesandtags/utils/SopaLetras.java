package org.codesandtags.utils;

/**
 * Algoritmo que permite hacer busquedas de palabras en una sopa de letra, 
 * haciendo recorridos en todas las direcciones posibles. La sopa de letras 
 * debe ser de MxN
 * 
 * codesandtags
 **/
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class SopaLetras {
	private String[] palabras;
	private String[][] sopa;
	private String rutaArchivo;
	private boolean debug = false;

	public static void main(String[] args) {
		// Instancia al Objeto
		SopaLetras sopaletras = new SopaLetras();
		// Definicion del archivo de la sopa de letras
		sopaletras.setArchivo("resources/sopaletras.in");
		// Define las palabras a buscar en la sopa
		sopaletras.setPalabras(new String[] { "CODES", "OSO", "TAGS", "GOOGLE",
				"123", "HTML", "COCOMAN", "ZAREK", "PERRO" });
		System.out.println(sopaletras.getDatos());
		sopaletras.setDebug(true);
		sopaletras.cargarSopaLetras();
		// Hace magia y obtiene la solucion
		sopaletras.getSolucion();
	}

	/***
	 * Define el listado de palabras a buscar en la sopa de letras
	 * 
	 * @param palabras
	 */
	public void setPalabras(String palabras[]) {
		this.palabras = palabras;
	}

	/**
	 * Define la ruta del archivo donde esta la sopa de letras
	 * 
	 * @param rutaArchivo
	 */
	public void setArchivo(String rutaArchivo) {
		this.rutaArchivo = rutaArchivo;
	}

	/**
	 * Habilita el modo debug para visualizar los detalles de cada busqueda
	 * 
	 * @param debug
	 */
	public void setDebug(boolean debug) {
		this.debug = debug;
	}

	/**
	 * Muestra el texto que hace seguimiento a la palabra encontrada
	 * 
	 * @param palabra
	 * @param x
	 * @param y
	 * @param direccion
	 */
	public void hacerDebug(String palabra, int x, int y, String direccion) {
		System.out.println("   - Encontro " + palabra + " en : [" + (x + 1)
				+ "] + " + "[" + (y + 1) + "] hacia " + direccion);
	}

	/**
	 * Obtiene los datos del archivo y los devuelve en un String
	 * 
	 * @return datos
	 */
	public String getDatos() {
		StringBuilder datos = new StringBuilder();
		try {
			BufferedReader archivo = new BufferedReader(new FileReader(
					rutaArchivo));

			// Variables para crear la sopa de letras
			String linea = "";
			int columnas = 0;
			int filas = 0;

			// Realiza la lectura del archivo
			while ((linea = archivo.readLine()) != null) {
				// Obtiene el numero de columnas en la primera lectura
				if (columnas == 0)
					columnas = linea.length();
				// Cuenta la cantidad de filas
				filas++;
				datos.append(linea).append("\n");
			}
			// crea el tamano del tablero
			sopa = new String[filas][columnas];
			// cierra el archivo
			archivo.close();

		} catch (Exception e) {
			System.err.println("ERROR : Changos algo ha fallado :S ");
			e.printStackTrace();
		}

		// Se devuelven los datos leidos
		return datos.toString();
	}

	/**
	 * Carga los datos en la sopa de letras
	 */
	public void cargarSopaLetras() {
		// Obtiene los datos y los parte por cada salto de linea
		StringTokenizer st = new StringTokenizer(getDatos(), "\n");
		System.out.println(" [ Tamaño de la Sopa ] ");
		System.out.println(" - Alto  : " + sopa.length);
		System.out.println(" - Ancho : " + sopa[0].length);
		// De cada linea saca cada letra y la almacena en la sopa de letras
		for (int i = 0; i < sopa.length; i++) {
			String linea = st.nextToken();
			for (int k = 0; k < sopa[0].length; k++) {
				sopa[i][k] = String.valueOf(linea.charAt(k));
			}
		}
	}

	/**
	 * Realiza la busqueda de palabras horizontalemente de izquierda a derecha y
	 * de derecha a izquierda
	 * 
	 * @param palabra
	 * @return
	 */
	public int buscarHorizontales(String palabra) {
		// Contador de coincidencias hacia la izquierda y hacia la derecha
		int toIzquierda = 0, toDerecha = 0;

		// Obtiene las secuencias horizontales izquierda a derecha
		for (int i = 0; i < sopa.length; i++) {
			// Se define como limite la longitud de la columna - tamano de
			// la palabra
			for (int k = 0; k <= sopa[0].length - palabra.length(); k++) {
				// Arma el conjunto de letras a buscar : Busqueda al derecho
				String conjuntoLetras = "";
				for (int m = 0; m < palabra.length(); m++) {
					conjuntoLetras += sopa[i][k + m];
				}

				// Cuando encuentra la palabra
				if (conjuntoLetras.equals(palabra)) {
					toDerecha++;
					if (debug)
						hacerDebug(palabra, i, k, "la derecha");
				}

				// Arma el conjunto de letras a buscar : Busqueda al derecho
				conjuntoLetras = "";
				for (int m = 0; m < palabra.length(); m++) {
					conjuntoLetras = sopa[i][k + m] + conjuntoLetras;
				}
				// Cuando encuentra la palabra
				if (conjuntoLetras.equals(palabra)) {
					toIzquierda++;
					if (debug)
						hacerDebug(palabra, i, k, "la izquierda");
				}
			}
		}

		if (debug) {
			System.out.println(" - Coincidencias izq - der : " + toDerecha);
			System.out.println(" - Coincidencias der - izq : " + toIzquierda);
		}

		// Total de coincidencias horizontales
		return toIzquierda + toDerecha;
	}

	/**
	 * Realiza la busqueda de palabras verticales de arriba a abajo y de abajo a
	 * arriba
	 * 
	 * @param palabra
	 * @return
	 */
	public int buscarVerticales(String palabra) {
		// Contador de coincidencias hacia la izquierda y hacia la derecha
		int toArriba = 0, toAbajo = 0;

		// Obtiene las secuencias horizontales izquierda a derecha
		for (int i = 0; i < sopa[0].length; i++) {
			// Se define como limite la longitud de la fila - tamano de
			// la palabra
			for (int k = 0; k <= sopa.length - palabra.length(); k++) {
				// Arma el conjunto de letras a buscar : Busqueda al derecho
				String conjuntoLetras = "";
				for (int m = 0; m < palabra.length(); m++) {
					conjuntoLetras += sopa[k + m][i];
				}

				// Cuando encuentra la palabra
				if (conjuntoLetras.equals(palabra)) {
					toArriba++;
					if (debug)
						hacerDebug(palabra, k, i, "abajo");
				}

				// Arma el conjunto de letras a buscar : Busqueda al derecho
				conjuntoLetras = "";
				for (int m = 0; m < palabra.length(); m++) {
					conjuntoLetras = sopa[k + m][i] + conjuntoLetras;
				}
				// Cuando encuentra la palabra
				if (conjuntoLetras.equals(palabra)) {
					toAbajo++;
					if (debug)
						hacerDebug(palabra, k, i, "arriba");
				}

			}
		}
		if (debug) {
			System.out.println(" - Coincidencias arr - aba : " + toArriba);
			System.out.println(" - Coincidencias aba - arr : " + toAbajo);
		}

		// Total de coincidencias horizontales
		return toArriba + toAbajo;
	}

	/**
	 * Realiza la busqueda de palabras en la diagonal principal hacia arriba y
	 * hacia abajo
	 * 
	 * @param palabra
	 * @return
	 */
	public int buscarDiagonalesPrincipales(String palabra) {
		// Contador de coincidencias hacia la izquierda y hacia la derecha
		int toAbajo = 0, toArriba = 0;

		// Obtiene las secuencias horizontales izquierda a derecha
		for (int i = 0; i <= sopa.length - palabra.length(); i++) {
			// Se define como limite la longitud de la columna - tamano de
			// la palabra
			for (int k = 0; k <= sopa[0].length - palabra.length(); k++) {
				// Arma el conjunto de letras a buscar : Busqueda al derecho
				String conjuntoLetras = "";
				for (int m = 0; m < palabra.length(); m++) {
					conjuntoLetras += sopa[i + m][k + m];
				}

				// Cuando encuentra la palabra
				if (conjuntoLetras.equals(palabra)) {
					toAbajo++;
					if (debug)
						hacerDebug(palabra, i, k, "la diagonal principal abajo");
				}

				// Arma el conjunto de letras a buscar : Busqueda al derecho
				conjuntoLetras = "";
				for (int m = 0; m < palabra.length(); m++) {
					conjuntoLetras = sopa[i + m][k + m] + conjuntoLetras;
				}
				// Cuando encuentra la palabra
				if (conjuntoLetras.equals(palabra)) {
					if (debug)
						hacerDebug(palabra, i, k,
								"la diagonal principal arriba");
					toArriba++;
				}
			}
		}

		if (debug) {
			System.out.println(" - Coincidencias diag principal arriba : "
					+ toArriba);
			System.out.println(" - Coincidencias diag principal abajo  : "
					+ toAbajo);
		}

		// Total de coincidencias horizontales
		return toAbajo + toArriba;
	}

	/**
	 * Realiza la busqueda de palabras en la diagonal principal hacia arriba y
	 * hacia abajo
	 * 
	 * @param palabra
	 * @return
	 */
	public int buscarDiagonalesInversas(String palabra) {
		// Contador de coincidencias hacia la izquierda y hacia la derecha
		int toAbajo = 0, toArriba = 0;

		// Obtiene las secuencias horizontales izquierda a derecha
		for (int i = 0; i <= sopa.length - palabra.length(); i++) {
			// Se define como limite la longitud de la columna - tamano de
			// la palabra
			for (int k = 0; k <= sopa[0].length - palabra.length(); k++) {
				// Arma el conjunto de letras a buscar : Busqueda al derecho
				String conjuntoLetras = "";
				for (int m = 0; m < palabra.length(); m++) {
					conjuntoLetras += sopa[i + m][palabra.length() + k - m - 1];
				}

				// System.out.println("Conjunto : " + conjuntoLetras);

				// Cuando encuentra la palabra
				if (conjuntoLetras.equals(palabra)) {
					toAbajo++;
					if (debug)
						hacerDebug(palabra, i, (palabra.length() + k - 1),
								"la diagonal inversa abajo");
				}

				// Arma el conjunto de letras a buscar : Busqueda al derecho
				conjuntoLetras = "";
				for (int m = 0; m < palabra.length(); m++) {
					conjuntoLetras = sopa[i + m][palabra.length() + k - m - 1]
							+ conjuntoLetras;
				}
				// Cuando encuentra la palabra
				if (conjuntoLetras.equals(palabra)) {
					if (debug)
						if (debug)
							hacerDebug(palabra, i, (palabra.length() + k - 1),
									"la diagonal inversa arriba");
					toArriba++;
				}
			}
		}

		if (debug) {
			System.out.println(" - Coincidencias diag principal arriba : "
					+ toArriba);
			System.out.println(" - Coincidencias diag principal abajo  : "
					+ toAbajo);
		}

		// Total de coincidencias horizontales
		return toAbajo + toArriba;
	}

	public void getSolucion() {
		// Variables
		int totalSecuencias = 0;
		int izquierda = 0, derecha = 0, arriba = 0, abajo = 0, diaDerecha = 0, diaIzquierda = 0, diaArriba = 0, diaAbajo = 0;
		int horizontales = 0, verticales = 0, diagonalPrincipal = 0, diagonalInversa = 0;

		// Recorrido y busqueda de las palabras
		System.out.println("\nBuscando palabras...");
		for (String palabra : palabras) {
			System.out.println("Buscando : " + palabra);
			// Cuenta la cantidad de coincidencias
			horizontales = buscarHorizontales(palabra);
			verticales = buscarVerticales(palabra);
			diagonalPrincipal = buscarDiagonalesPrincipales(palabra);
			diagonalInversa = buscarDiagonalesInversas(palabra);

			// Muestra el resultado y suma
			System.out
					.println("Resultado : "
							+ palabra
							+ " : "
							+ (horizontales + verticales + diagonalPrincipal + diagonalInversa)
							+ " veces");
			totalSecuencias += horizontales + verticales + diagonalPrincipal
					+ diagonalInversa;
		}

		System.out.println("\nTotal de palabras a buscar : " + palabras.length);
		System.out.println("Total de coincidencias encontradas : "
				+ totalSecuencias);
	}
}