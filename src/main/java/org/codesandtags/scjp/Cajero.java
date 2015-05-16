package org.codesandtags.scjp;

public class Cajero {
	
	public static void main(String[] args) {
		Cuenta c = new Cuenta();
		
		try {
			c.ingresar(100);
			c.extraer(20);
			System.out.println(c.getSaldo());
			c.extraer(80);
			System.out.println(c.getSaldo());
			c.extraer(10);
		} catch (Exception e) {
			System.err.println("La cuenta no puede quedar en saldo rojo");
		}
		
	}

}

class Cuenta{
	
	double saldo;
	
	public Cuenta() {
		saldo = 0;
	}
	
	public void ingresar(double x){
		saldo += x;
	}
	
	public void extraer(double x) throws Exception{
		if(saldo < x){
			throw new Exception();
			
		}else{
			saldo -= x;
		}
	}
	
	public double getSaldo(){
		return saldo;
	}
	
}
