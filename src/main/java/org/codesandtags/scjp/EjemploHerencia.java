package org.codesandtags.scjp;

public class EjemploHerencia {

	public static void main(String[] args) {
		System.out.println("Ejemplo de herencia y constructores");

		String cosa = "";
		Segunda segunda = new Segunda();
		segunda.saludos();
		
		int $valor = 0;
		System.out.println("Valor => " + $valor);
		
		System.out.println("listones \n\n\n");
		
		Tercera tercera = new Tercera();
		tercera.saludos();
	}

}

class Primera {

	public Primera() {
		System.out.println("=>Primera - SuperClase");
	}

	public Primera(String str) {
		System.out.println(String.format("Hello %1$s!.", str));
	}

	/**
	 * Esto muestra un saludo de la primera
	 * 
	 * @return
	 */
	protected String saludos() {
		return "Saludos!!!";
	}

}

class Segunda extends Primera {
	public Segunda() {
		super("Cocoman");
		System.out.println("=>Segunda - SubClase");

		System.out.println(this.saludos());

		Primera primera = new Primera();
		System.out.println("-->" + primera.saludos());

	}

	public void cosa() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.codesandtags.scjp.Primera#saludos()
	 */
	@Override
	protected String saludos() {
		return "Otro tipo de saludo!!";
	}
}

class Tercera extends Segunda {
	public Tercera() {
		System.out.println(" ---------------------- ");
		System.out.println("Y ahora esta es la tercera");
	}
}
