package org.codesandtags.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CambiarLowerUpeer {
	public static void main(String[] args) {
		
		CambiarLowerUpeer ejemplo = new CambiarLowerUpeer();
		ejemplo.setArchivo("D:\\WorkCerberus\\LAP\\IssuesLAP\\4.2.1\\Reportes\\PPS-416\\ParamsBundle_en.properties");
		System.out.println(ejemplo.getToLowerCase());
		ejemplo.setArchivo("D:\\WorkCerberus\\LAP\\IssuesLAP\\4.2.1\\Reportes\\PPS-416\\ParamsBundle_es.properties");
		System.out.println(ejemplo.getToLowerCase());
		ejemplo.setArchivo("D:\\WorkCerberus\\LAP\\IssuesLAP\\4.2.1\\Reportes\\PPS-416\\ParamsBundle_pt.properties");
		System.out.println(ejemplo.getToLowerCase());
		System.out.println(ejemplo.getToUpperCase());
		
	}

	private File archivo;

	public void setArchivo(String archivo) {
		try {
			this.archivo = new File(archivo);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getToLowerCase() {
		StringBuilder contenido = new StringBuilder();
		String linea = "";
		BufferedReader lector;

		try {

			lector = new BufferedReader(new FileReader(archivo));
			while ((linea = lector.readLine()) != null) {
				contenido.append(linea.toLowerCase()).append("\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return contenido.toString();
	}

	public String getToUpperCase() {
		StringBuilder contenido = new StringBuilder();
		String linea = "";
		BufferedReader lector;

		try {

			lector = new BufferedReader(new FileReader(archivo));
			while ((linea = lector.readLine()) != null) {
				contenido.append(linea.toUpperCase()).append("\n");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return contenido.toString();
	}
}
