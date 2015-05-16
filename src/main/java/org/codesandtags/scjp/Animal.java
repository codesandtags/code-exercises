package org.codesandtags.scjp;

/**
 * 
 * Modificadores de Acceso : 
 * 
 * 
 * 
 * @author Hunter
 *
 */

abstract class Animal {
	
	public Animal() {
		System.out.println("Soy un animal!!!");
	}
	
	public Animal(String nombre){
		this.nombre = nombre;
	}
	
	protected String nombre = "Animal";
	protected int patas;
	
	protected void comer(){
		System.out.println("Soy un " + nombre + " que come");
	}
	
	private void secreto(){
		System.out.println("Como soy privado no te lo puedo decir");
	}
	
	/**
	 * Define que es lo que se debe hacer, pero no dice como
	 */
	 abstract void caminar();
	
}

abstract class ElCoco extends Animal{
	
}

class Mamifero extends Animal{

	/**
	 * Override significa "SobreEscritura", sobreescribir un metodo
	 * Recordar que aqui le digo como hacer las cosas,
	 * Osea como caminar :)
	 */
	@Override
	void caminar() {
		System.out.println("Yo camino en cuatro patas");
		
	}
	
	public void tomarLeche(){
		System.out.println("Yo tomo Algarra y tu?");
	}
	
	public Mamifero() {
		System.out.println("Soy un mamifero");
	}
	
}

class Ave extends Animal{

	/**
	 * Override significa "SobreEscritura", sobreescribir un metodo
	 * Recordar que aqui le digo como hacer las cosas,
	 * Osea como caminar :)
	 */
	@Override
	void caminar() {
		System.out.println("Yo camino en 2 patas");
	}
	
	public void ponerHuevo(){
		System.out.println("Poniendo huevo... por favor espere");
	}
	
	public Ave() {
		super("Pajarito!");
		System.out.println("Soy un ave");
	}
	
}


class SoyEnvidosa{
	public SoyEnvidosa() {
		System.out.println("Si y que!!!");
	}
} 


class Curiosa extends SoyEnvidosa{
	public Curiosa() {
		System.out.println("Soy la que todo lo pregunta");
	}
	
}


class Ejemplo{
	
	public static void main(String[] args) {
		 
		//Mamifero perro = new Mamifero();
		//Ave piolin = new Ave();
		//System.out.println(piolin.nombre);
		Curiosa curiosa = new Curiosa();
		
	}
	
}
