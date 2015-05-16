package org.codesandtags.ejercicios;

public class EjemploInterface {

	public static void main(String[] args) {

		// Instanciacion de Objetos
		GoldenRetriever perro1 = new GoldenRetriever("Lala");
		Labrador perro2 = new Labrador("Cristal");
		Chihuahua perro3 = new Chihuahua("Godzilla");

		// Ejemplo ...
		System.out.println(perro1.toString());
		perro1.jugar("Frisbee");
		perro1.comer(1, "Pedigree");
		perro1.ladrar();
		System.out.println();

		System.out.println(perro2.toString());
		perro2.jugar("Botella");
		perro2.comer(3, "Ladrina para Ladradores");
		perro2.ladrar();
		System.out.println();

		System.out.println(perro3.toString());
		perro3.jugar("Llantas de camion");
		perro3.comer(10, "Tachuelas para Mastodontes");
		perro3.ladrar();
		System.out.println();

	}

}

interface Perro {

	public void ladrar();

	public void jugar(String juguete);

	public void comer(int cantidad, String tipoComida);

}

class GoldenRetriever implements Perro {

	String nombre;

	public GoldenRetriever(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void ladrar() {
		System.out.println("Guau Guau");
	}

	/**
	 * Juguete : Juega con palos, frisbees, pelotas de futbol, pelotas de tenis,
	 * niños
	 */
	@Override
	public void jugar(String juguete) {
		System.out.println("El Golden Retriever juega con : " + juguete);
	}

	@Override
	public void comer(int cantidad, String tipoComida) {
		System.out.println("El Golden come " + cantidad + " de " + tipoComida);
	}

	@Override
	public String toString() {
		return "Este GoldenRetriever se llama " + this.nombre;
	}

}

class Labrador implements Perro {

	String nombre;

	public Labrador(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void ladrar() {
		System.out.println("Guauuuuuuuuuuu Guau Guau");
	}

	/**
	 * Juguete : Juega con palos, frisbees, pelotas de futbol, pelotas de tenis,
	 * niños
	 */
	@Override
	public void jugar(String juguete) {
		System.out.println("El Labrador juega con : " + juguete);
	}

	@Override
	public void comer(int cantidad, String tipoComida) {
		System.out
				.println("El Labrador come " + cantidad + " de " + tipoComida);
	}

	@Override
	public String toString() {
		return "Este Labrador se llama " + this.nombre;
	}
}

class Chihuahua implements Perro {

	String nombre;

	public Chihuahua(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public void ladrar() {
		System.out
				.println("Guau Guau Guau Guau Guau Guau Guau Guau Guau Miau!");
	}

	/**
	 * Juguete : Juega con peluches, pelotas de piquis
	 */
	@Override
	public void jugar(String juguete) {
		System.out.println("El Chiuaua juega con : " + juguete);
	}

	@Override
	public void comer(int cantidad, String tipoComida) {
		System.out.println("El Chiuaua come " + cantidad + " de " + tipoComida);
	}

	@Override
	public String toString() {
		return "Este Super Chihuahua se llama " + this.nombre;
	}
}
