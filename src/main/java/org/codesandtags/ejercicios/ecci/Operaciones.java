package org.codesandtags.ejercicios.ecci;

/***
 * Clase que se encarga de realizar las operaciones de la ventana de Login. Esta
 * es la representacion del controlador quien recibe los eventos gestionados por
 * el usuario
 * 
 * http://codesandtags
 */
public class Operaciones {

	/**
	 * Se instancia la clase DAO y se invoca el metodo validar el cual devuelve
	 * un boolean con el resultado de la validacion
	 * 
	 * @param usuario
	 * @param clave
	 * @return
	 */
	public boolean validar(String usuario, String clave) {
		DAO dao = new DAO();
		return dao.validar(usuario, clave);
	}
}
