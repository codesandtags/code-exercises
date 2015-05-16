package org.codesandtags.ejercicios;

public class EjemploMiNina implements SoyLaInterface, SoyLaInterfaceMasDivertida{

	String hola;
	
	@Override
	public void metodoRaro() {
		this.hola = "Bonjour";	
	}

	@Override
	public void metodoReir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodoSaltar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void metodoChangos() {
		// TODO Auto-generated method stub
		
	}

}


abstract class SoyAbstractaYRara{
	
	// Definir 
	public abstract void metodoRaro();
	
	// Implementar
	public void metodoRaro2(){
		System.out.println("A mi no me implementan, carajo!!");
	}
	
}

abstract class SoyMasAbstractaYRara{
	
	
}

interface SoyLaInterface{
	// Definir 
	void metodoRaro();
	void metodoChangos();
	
}

interface SoyLaInterfaceMasDivertida{
	// Definir 
	public abstract void metodoReir();
	void metodoSaltar();
	
}

