package org.codesandtags.scjp;

public class EjemploAbstractas {
	public static void main(String[] args) {
		
		Triangulo triangulo = new Triangulo(5, 7);
		System.out.println(String.format("Nombre : [%1$s]",triangulo.getNombre()) );
		System.out.println("=> " + triangulo.area());
		
		Figura figura = new Circulo();
		System.out.println("Area : " + figura.area());
		figura = new Triangulo(5, 6);
		System.out.println("Area : " + figura.area());

	}

}

abstract class Figura {

	private String nombre;

	public Figura(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public abstract double area();
}

class Circulo extends Figura {

	public Circulo() {
		super("Circulo");
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 888;
	}

}

class Triangulo extends Figura {
	
	private int base, altura;

	public Triangulo(int x, int y) {
		super("Triangulo");
		base = x;
		altura = y;
	}
	
	public int getBase(){
		return base;
	}
	
	public int getAltura(){
		return altura;
	}
	
	
	@Override
	public double area() {
		return base * altura / 2;
	}
}