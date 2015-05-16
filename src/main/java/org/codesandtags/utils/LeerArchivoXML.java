package org.codesandtags.utils;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LeerArchivoXML {

	public static void main(String argv[]) {

		try {
			//Referencia al archivo XML
			File file = new File("/home/hunter/Development/Projects/metrocuadrado/tareas/20121212/REVISTAM2.xml");
			//Convertir los datos en objetos
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(file);
			
			//
			doc.getDocumentElement().normalize();
			System.out.println("Elemento Raiz :  "
					+ doc.getDocumentElement().getNodeName());
			
			//Subelementos
			NodeList listadoAvisos = doc.getElementsByTagName("Aviso");
			System.out.println("Total de Avisos : " + listadoAvisos.getLength());
			
			int registros = 0;
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < listadoAvisos.getLength(); i++) {

				Node aviso = listadoAvisos.item(i);

				//Evalua que el dato a leer corresponda a un nodo
				if (aviso.getNodeType() == Node.ELEMENT_NODE) {
					registros++;
					Element elemento = (Element) aviso;
					
					sb.append("\n[Aviso] : ").append(registros).append("\n");
					sb.append("  NoOrden : ").append(getTagValue("NoOrden", elemento));
					sb.append("\n");

					
					//Lectura de la informacion del cliente, se realiza de la misma forma que los avisos
					sb.append("\n  [Informacion Cliente]\n");					
					NodeList listadoInformacionCliente = elemento.getElementsByTagName("InformacionCliente");
					for (int k = 0; k < listadoInformacionCliente.getLength(); k++) {
						Node informacionCliente = listadoInformacionCliente.item(k);
						Element elementoInformacion = (Element) informacionCliente;
						sb.append("    IdCliente : ").append(getTagValue("IdCliente", elementoInformacion)).append("\n");
						sb.append("    NombreCliente : ").append(getTagValue("NombreCliente", elementoInformacion)).append("\n");
						sb.append("    CiudadCliente : ").append(getTagValue("CiudadCliente", elementoInformacion)).append("\n");
						sb.append("    EmailCliente : ").append(getTagValue("EmailCliente", elementoInformacion)).append("\n");
					}
					
					
					//Lectura de la informacion del cliente, se realiza de la misma forma que los avisos
					sb.append("\n  [Informacion Proyecto]\n");					
					NodeList listadoInformacionProyecto = elemento.getElementsByTagName("InformacionProyecto");
					for (int k = 0; k < listadoInformacionCliente.getLength(); k++) {
						Node informacionProyecto = listadoInformacionProyecto.item(k);
						Element elementoInformacion = (Element) informacionProyecto;
						/*
						sb.append("    PathImagenes : ").append(getTagValue("PathImagenes", elementoInformacion)).append("\n");
						sb.append("    Foto : ").append(getTagValue("Foto", elementoInformacion)).append("\n");
						sb.append("    LogoUno : ").append(getTagValue("LogoUno", elementoInformacion)).append("\n");
						sb.append("    LogoDos : ").append(getTagValue("LogoDos", elementoInformacion)).append("\n");
						sb.append("    Fotomapa : ").append(getTagValue("Fotomapa", elementoInformacion)).append("\n");
						sb.append("    Logoyfoto : ").append(getTagValue("Logoyfoto", elementoInformacion)).append("\n");
						sb.append("    TipoInmued : ").append(getTagValue("TipoInmued", elementoInformacion)).append("\n");
						sb.append("    AreaConstruida : ").append(getTagValue("AreaConstruida", elementoInformacion)).append("\n");
						sb.append("    AreaPrivada : ").append(getTagValue("AreaPrivada", elementoInformacion)).append("\n");
						sb.append("    Comentarios : ").append(getTagValue("Comentarios", elementoInformacion)).append("\n");
						sb.append("    Plantilla : ").append(getTagValue("Plantilla", elementoInformacion)).append("\n");
						sb.append("    ZonaColor : ").append(getTagValue("ZonaColor", elementoInformacion)).append("\n");
						sb.append("    Municipio : ").append(getTagValue("Municipio", elementoInformacion)).append("\n");
						sb.append("    Nombrebarr : ").append(getTagValue("Nombrebarr", elementoInformacion)).append("\n");
						sb.append("    Nomenclatu : ").append(getTagValue("Nomenclatu", elementoInformacion)).append("\n");
						sb.append("    Numerocall : ").append(getTagValue("Numerocall", elementoInformacion)).append("\n");
						sb.append("    Proyecto : ").append(getTagValue("Proyecto", elementoInformacion)).append("\n");
						sb.append("    Titulopro : ").append(getTagValue("Titulopro", elementoInformacion)).append("\n");
						sb.append("    Unidconstr : ").append(getTagValue("Unidconstr", elementoInformacion)).append("\n");
						sb.append("    Uniddispon : ").append(getTagValue("Uniddispon", elementoInformacion)).append("\n");
						sb.append("    Zona : ").append(getTagValue("Zona", elementoInformacion)).append("\n");
						sb.append("    Calleavecr : ").append(getTagValue("Calleavecr", elementoInformacion)).append("\n");
						sb.append("    Comentarip : ").append(getTagValue("Comentarip", elementoInformacion)).append("\n");
						sb.append("    Longitud : ").append(getTagValue("Longitud", elementoInformacion)).append("\n");
						sb.append("    Latitud : ").append(getTagValue("Latitud", elementoInformacion)).append("\n");
						sb.append("    Estadoproy : ").append(getTagValue("Estadoproy", elementoInformacion)).append("\n");
						sb.append("    Telefono1 : ").append(getTagValue("Telefono1", elementoInformacion)).append("\n");
						sb.append("    Telefono2 : ").append(getTagValue("Telefono2", elementoInformacion)).append("\n");
						sb.append("    Telefono3 : ").append(getTagValue("Telefono3", elementoInformacion)).append("\n");
						sb.append("    Estrato : ").append(getTagValue("Estrato", elementoInformacion)).append("\n");
						sb.append("    Fotocodigo : ").append(getTagValue("Fotocodigo", elementoInformacion)).append("\n");
						sb.append("    Fotocodpro : ").append(getTagValue("Fotocodpro", elementoInformacion)).append("\n");
						sb.append("    Seccion : ").append(getTagValue("Seccion", elementoInformacion)).append("\n");
						sb.append("    Texto : ").append(getTagValue("Texto", elementoInformacion)).append("\n");
						sb.append("    Direccionc : ").append(getTagValue("Direccionc", elementoInformacion)).append("\n");
						sb.append("    Sececom : ").append(getTagValue("Sececom", elementoInformacion)).append("\n");
						sb.append("    Vis : ").append(getTagValue("Vis", elementoInformacion)).append("\n");
						sb.append("    Financiacion : ").append(getTagValue("Financiacion", elementoInformacion)).append("\n");
						*/
						
						//Tipo Inmueble
						sb.append("\n     [Tipo Inmueble]\n");					
						NodeList listadoTipoInmueble = elemento.getElementsByTagName("Inmueble");
						for (int m = 0; m < listadoInformacionCliente.getLength(); m++) {
							Node tipoInmueble = listadoTipoInmueble.item(m);
							Element elementoTipoInmueble = (Element) tipoInmueble;
							sb.append("       Activo : ").append(getTagValue("Activo", elementoTipoInmueble)).append("\n");
							sb.append("       AreaConstruida : ").append(getTagValue("AreaConstruida", elementoTipoInmueble)).append("\n");
							sb.append("       AreaPrivada : ").append(getTagValue("AreaPrivada", elementoTipoInmueble)).append("\n");
							sb.append("       Banos : ").append(getTagValue("Banos", elementoTipoInmueble)).append("\n");
							sb.append("       Comentari : ").append(getTagValue("Comentari", elementoTipoInmueble)).append("\n");
							sb.append("       Consecu : ").append(getTagValue("Consecu", elementoTipoInmueble)).append("\n");
							sb.append("       Cuartos : ").append(getTagValue("Cuartos", elementoTipoInmueble)).append("\n");
							sb.append("       Preciodes : ").append(getTagValue("Preciodes", elementoTipoInmueble)).append("\n");
							sb.append("       Tinmueble : ").append(getTagValue("Tinmueble", elementoTipoInmueble)).append("\n");
							sb.append("       Tipoinmue : ").append(getTagValue("Tipoinmue", elementoTipoInmueble)).append("\n");
							
						}
					}
					
					
				}
			}
			
			System.out.println(sb.toString());
			System.out.println("Total registros leidos : " + registros);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * Metodo que obtiene el valor de un tag
	 * @param tag
	 * @param elemento
	 * @return
	 */
	private static String getTagValue(String tag, Element elemento){
		NodeList lista = elemento.getElementsByTagName(tag).item(0).getChildNodes();
		Node valor = (Node) lista.item(0);
		if(valor != null){
			return valor.getNodeValue();	
		}else{
			return null;
		}
		
	}

}
