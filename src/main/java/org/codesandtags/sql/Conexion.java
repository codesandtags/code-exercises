package org.codesandtags.sql;

/***
 * Clase que permita relizar una conexion a una BD utilizando
 * JDBC.
 *
 * Driver postgresql : http://jdbc.postgresql.org/download.html
 * Driver mysql      : http://www.mysql.com/products/connector/
 * Lista de drivers API JDBC : http://developers.sun.com/product/jdbc/drivers
 * 
 *  http://codesandtags.org
 */

import java.sql.*;
import java.util.ArrayList;

public class Conexion {
		// Datos de conexion
		private final String driver = "org.postgresql.Driver";
		private final String name_db = "jdbc:postgresql://localhost:5432/codesandtags";
		private final String user_db = "postgres";
		private final String pass_db = "psql123_";
		private Connection con;
		private PreparedStatement pst;

		/**
		 * Constructor que realiza la conexion cuando se instancia un objeto
		 * Conexion
		 */
		public Conexion() {
			try {
				// Driver de conexion, en este caso estoy utilizando el de
				// postgresql
				Class.forName(driver);
				// Creo una conexion con la base de datos a partir de los datos de
				// conexion
				con = DriverManager.getConnection(name_db, user_db, pass_db);
			} catch (Exception e) {
				// Si ocurre un error lo capturo
				e.printStackTrace();
			}
		}	
		
		
		/**
		 * Obtiene un ArrayList
		 * @param sql
		 * @return ResultSet
		 */
		public ResultSet consulta(String sql) {
	        // Declaracion en null del resultSet
			ResultSet rs = null;
	        
	        try {
	            // Preparo la sentencia sql a ejecutar
	            pst = con.prepareStatement(sql);
	            // Obtengo los datos de la consulta en un resultset
	            rs = pst.executeQuery();
	            // Guardo los datos del ResultSet en un ResultSetMetadata para jugar
	            // un poco mas
	            
	            
	        } catch (SQLException e) {
	            // Capturo la excepcion en caso de error
	            e.printStackTrace();
	        }
	        return rs;
	    }

		/**
		 * Metodo que permite cerrar la conexion realizada a la BD
		 */
		public void desconectar() {
			try {
				// Cierro todas las conexiones con la base de datos
				// Automaticamente libero memoria y cierro las conexiones abiertas
				// en el objeto Connection
				con.close();
			} catch (Exception e) {
				// Controlo cualquier excepcion generada durante el cierre de la
				// conexion
				e.printStackTrace();
			}
		}		


}
