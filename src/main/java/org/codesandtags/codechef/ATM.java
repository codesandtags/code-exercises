package org.codesandtags.codechef;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		// Objeto para la lectura de datos
		Scanner sc = new Scanner(System.in);
		// Objetos para el formateo de la salida
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		dfs.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat("#.00", dfs);
		// Variables del programa
		int amount = sc.nextInt();
		float balance = sc.nextFloat();
		// Condicion del multiplo de 5 y de que exista dinero suficiente
		if ((amount % 5 == 0) && balance >= (amount + 0.5)) {
			balance = (float) (balance - amount - 0.5);
		}
		System.out.println(df.format(balance));

	}
}
