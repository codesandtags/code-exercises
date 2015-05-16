package org.codesandtags.utils;

/**
* Realiza el ordenamiento de arreglos a partir de la clase Arrays y el metodo sort.
* Esta clase con tipos de dato basico permite realizar ordenamientos ascendentes.
* 
*/

//Importo las clases necesarias
import java.util.Arrays;

public class EjemploSortArrays {
   public static void main(String[] args){
       //Creo un arreglo de enteros
       int[] edades = {10,12,13,14,2,50,3,1,7,6};
       //Creo un arreglo de doubles
       double[] temperaturas = {10.5,8.3,50.9,13.7,45.89,45.88,1.0,12.6};
       //Creo un arreglo de Strings
       String[] nombres = {"phicar","clerigo","dmk","radical","checho","lozano","cocoman"};

       //Ejemplo para el ordenamiento de enteros
       Arrays.sort(edades);
       //Ejemplo para el ordenamiento de doubles
       Arrays.sort(temperaturas);
       //Ejemplo para el ordenamiento de Strings
       Arrays.sort(nombres);

       System.out.print("\n\n[Edades] \n>> ");
       for(int n:edades)
           System.out.print(n + ",");

       //Muestro las temperaturas ordenadas
       System.out.print("\n\n[Temperaturas] \n>> ");
       for(double t:temperaturas)
           System.out.print(t + ",");

       //Muestro los nombres ordenados
       System.out.print("\n\n[Nombres] \n>> ");
       for(String s:nombres)
           System.out.print(s + ",");
   }
}

