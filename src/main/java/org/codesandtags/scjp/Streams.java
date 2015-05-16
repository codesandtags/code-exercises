package org.codesandtags.scjp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Streams {
	public static void main(String[] args) throws IOException{
		
		Streams ejemplo = new Streams();
		
		ejemplo.ejemploObjectOutput();
		
	}
	
	public void ejemploObjectInput() throws IOException{
		
		
	}
	
	public void ejemploObjectOutput() throws IOException{
		
		FileOutputStream fs = new FileOutputStream("resources/cocoman.obj");
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(new Persona("Cocoman", 23));
		os.close();
		
	}

}

class Persona implements Serializable{
	String nombre;
	int edad;
	
	Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
}