package org.codesandtags.utils;

import java.util.*;

public class Trabajo {
	public static void main(String args[]) {
		menu();
	}

	public static void menu() {
		int opcion = 0;
		Scanner teclado = new Scanner(System.in);

		while (opcion != 5) {

			System.out.println("Hola, Bienvenido\n");
			System.out.println("Que desea hacer???");
			System.out.println("1 - Ejercicio1");
			System.out.println("2 - Ejercicio2");
			System.out.println("3 - Ejercicio3");
			System.out.println("4 - Ejercicio4");
			System.out.println("5 - Salir");
			System.out.print("\n Opcion = ");
			opcion = teclado.nextInt();

			switch (opcion) {
			case 1:
				Ejercicio1();
				break;
			case 2:
				Ejercicio2();
				break;
			case 3:
				Ejercicio3();
				break;
			case 4:
				Ejercicio4();
				break;
			case 5:
				System.out.println("Gracias por jugar. Insert Coin :P ");
				System.exit(0);
				break;
			default:
				System.out.println("Opcion invalida!");
				break;
			}
		}

	}

	public static void Ejercicio3() {
		int[] arreglo1;
		int i;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos elementos necesita?");
		arreglo1 = new int[teclado.nextInt()];

		int acumulador = 0;
		int promedio = 0;

		System.out.println("Ingreso de valores en el arreglo");
		for (i = 0; i < arreglo1.length; i++) {
			System.out.println("Ingrese el valor " + i + " del arreglo");
			arreglo1[i] = teclado.nextInt();
		}
		System.out.println("Valores del arreglo:");
		for (i = arreglo1.length - 1; i >= 0; i--) {
			System.out.println("Valor " + i + ": " + arreglo1[i]);
		}
		for (i = arreglo1.length - 1; i >= 0; i--) {
			acumulador = acumulador + arreglo1[i];
		}
		promedio = acumulador / arreglo1.length;
		System.out.println("Suma de los valores del arreglo: " + acumulador);
		System.out.println("El promedio del arreglo: " + promedio);
	}

	public static void Ejercicio1() {

		int[] Numeros;
		int i;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Cuantos numeros desea ingresar ?");
		Numeros = new int[teclado.nextInt()];

		System.out.println("Ingrese los numeros");
		for (i = 0; i < Numeros.length; i++) {
			System.out.println("Ingrese valor " + i + " del arreglo");
			Numeros[i] = teclado.nextInt();
		}

		for (i = Numeros.length - 1; i >= 0; i--) {
			if (Numeros[i] % 2 == 0) {
				System.out.println("Par en indice " + i + " valor: "
						+ Numeros[i]);
			}
		}

	}

	public static void Ejercicio2() {

		int[] numeros;
		int cantidad = 0;
		Scanner teclado = new Scanner(System.in);

		System.out.print("\n Ingrese cantidad de numeros : ");
		cantidad = teclado.nextInt();
		// Se inicializa el arreglo
		numeros = new int[cantidad];

		// Se piden los numeros
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(" Ingrese numero [" + (i + 1) + "] : ");
			numeros[i] = teclado.nextInt();
		}

		// mostramos los numeros antes
		System.out.println("\n Numeros Antes \n");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Numero [" + (i + 1) + "] " + numeros[i]);
		}

		// Se ordenan los numeros de menor a mayor
		for (int i = 0; i < numeros.length; i++) {
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[i] < numeros[j]) {
					int temp = numeros[i];
					numeros[i] = numeros[j];
					numeros[j] = temp;
				}
			}
		}

		// mostramos los numeros despues
		System.out.println("\n Numeros Despues2 \n");
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Numero [" + (i + 1) + "] " + numeros[i]);
		}

	}

	public static void Ejercicio4() {

		int[] arreglo1;
		int[] arreglo2;
		int i;

		Scanner teclado = new Scanner(System.in);
		System.out.println("Cuantos elementos necesita?");
		arreglo1 = new int[teclado.nextInt()];

		System.out.println("Ingreso de valores en el arreglo");
		for (i = 0; i < arreglo1.length; i++) {
			System.out.println("Ingrese el valor " + i + " del arreglo");
			arreglo1[i] = teclado.nextInt();
		}

		System.out.println("La longitud del arreglo es " + arreglo1.length);
		arreglo2 = new int[arreglo1.length / 2];
		int z;
		System.arraycopy(arreglo1, arreglo1.length / 2, arreglo2, 0,
				arreglo1.length / 2);
		for (z = 0; z < arreglo2.length; z++) {

			System.out.println("Arreglo 2 - Elemento en indice " + z + ": "
					+ arreglo2[z]);

		}
	}

}