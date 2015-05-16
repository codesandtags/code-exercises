package org.codesandtags.html;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

/**
 * LeerPaginaHtml con Java
 * 
 * @author codesandtags
 * 
 */
public class LeerPaginaHtml {

	public static void main(String[] args) {

		LeerPaginaHtml ejemplo = new LeerPaginaHtml();
		ejemplo.leerPagina("http://projecteuler.net");
		ejemplo.buscarTextoPagina("http://projecteuler.net", "and");
	}

	/**
	 * Realiza la lectura de una pagina enviada como parametro e imprime el
	 * contenido
	 * 
	 * @param url
	 * @return
	 */
	public String leerPagina(String url) {
		System.out.println("Leyendo Pagina : " + url);
		StringBuffer resultado = new StringBuffer();

		try {
			URL urlPagina = new URL(url);
			URLConnection urlConexion = urlPagina.openConnection();
			urlConexion.connect();

			// Creamos el objeto con el que vamos a leer
			BufferedReader lector = new BufferedReader(new InputStreamReader(
					urlConexion.getInputStream(), "UTF-8"));
			String linea = "";
			String contenido = "";

			while ((linea = lector.readLine()) != null) {
				resultado.append(String.valueOf(linea));
				resultado.append("\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Contenido : \n\n" + resultado.toString());
		return resultado.toString();
	}

	/**
	 * Realiza la lectura de una pagina enviada como parametro y busca las
	 * coincidencias de un texto especificado.
	 * 
	 * @param url
	 * @param texto
	 * @return
	 */
	public String buscarTextoPagina(String url, String texto) {
		System.out.println("Leyendo Pagina : " + url);
		StringBuffer resultado = new StringBuffer();
		int veces = 0;

		try {
			URL pagina = new URL(url);
			URLConnection uc = pagina.openConnection();
			uc.connect();

			// Creamos el objeto con el que vamos a leer
			BufferedReader lector = new BufferedReader(new InputStreamReader(
					uc.getInputStream(), "UTF-8"));
			String linea = "";
			String contenido = "";

			while ((linea = lector.readLine()) != null) {

				if (linea.contains(texto)) {
					int idx = 0, coincidencias = 0;

					while (linea.indexOf(texto, idx) > 0) {
						idx = linea.indexOf(texto, idx) + 1 + texto.length();
						coincidencias++;
					}

					resultado.append(String.valueOf(coincidencias
							+ " coincidencia(s) =>"));
					resultado.append(String.valueOf(linea));
					resultado.append("\n");

					veces += coincidencias;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Se encontro un total de : " + veces
				+ " coincidencias con la expresion [" + texto + "] ");
		System.out.println(resultado.toString());
		return resultado.toString();
	}
}