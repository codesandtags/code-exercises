package org.codesandtags.scjp;

public class EjemploBucles {
	
	public static void main(String[] args) {

		externo:
		for (int i = 0; i < 5; i++) {
			while(true){
				System.out.println("Hola");
				break externo;
			}
		}
		System.out.println("Chao");
		//metodo();
	}
	
	static void metodo(){
		metodo();
	}

}
