package org.codesandtags.utils;

import java.util.Iterator;
import java.util.List;
import java.io.File;
import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

public class ArchivoXML {

	public static void main(String[] args) {

		ArchivoXML ejemplo = new ArchivoXML();
		ejemplo.leerArchivo("src/main/resources/archivo.xml");
		//System.out.println("Hola como estas");

	}

	public void leerArchivo(String xmlFile) {
		// Se crea el SAXBuilder para realizar el parseo del archivo XML
		SAXBuilder builder = new SAXBuilder();
		File xml = new File(xmlFile);

		try {
			// Se crea un objeto de tipo documento el cual permitira manipular
			// el archivo
			Document document = (Document) builder.build(xml);
			// Se obtiene el elemento raiz
			Element rootNode = document.getRootElement();
			// Se obtiene la lista de elementos de la raiz
			List<Element> miembros = rootNode.getChildren("miembro");

			// Recorrido de cada uno de los miembros : Primer Nivel
			for (Element miembro : miembros) {
				System.out.println(miembro.getName() + " : "
						+ miembro.getAttributeValue("id"));
				System.out.println("Nickname : "
						+ miembro.getChildText("nickname"));
				System.out.println("Cargo : " + miembro.getChildText("cargo"));
				System.out.println("Hobbies : ");

				// Recorrido de los hobbies de cada miembro : Segundo Nivel
				for (Element hobbie : miembro.getChild("hobbies").getChildren()) {
					System.out.println(" - " + hobbie.getValue());
				}

				System.out.println("------------------------------------");
			}

		} catch (IOException e) {
			e.printStackTrace();
		} catch (JDOMException e) {
			e.printStackTrace();
		}
	}

}
