package org.codesandtags.utils;

/**
 * Ejemplo que realiza el ordenamiento de un Arreglo en forma ascendente y descendente.
 * Para realizar el ordenamiento de forma descendente se requiere usar la clase Collections
 * por lo tanto necesitamos crear objetos a partir de las clases de envoltorio.
 *
 * @author Administrador
 * @version 1.0
 */
 
//Importo las clases necesarias
import java.util.Arrays;
import java.util.Collections;
 
public class EjemploSortArrays2 {
    public static void main(String[] args){
        //Creo un arreglo de Integer, aqui uso el autoboxing para realizar un
        //Cast implicito de los valores enteros a Integer (Objetos)
        Integer[] edades = {10,12,13,14,2,50,3,1,7,6};
        //Creo un arreglo de Doubles. autoboxing otra vez...
        Double[] temperaturas = {10.5,8.3,50.9,13.7,45.89,45.88,1.0,12.6};
        //Creo un arreglo de Strings. (Por defecto String siempre es trabajado como un objeto)
        String[] nombres = {"phicar","clerigo","dmk","radical","checho","lozano","cocoman"};
 
        //Uso simple del metodo sort para ordenamientos ascendentes
        System.out.print("\n [------- Ordenamientos de forma Ascendente --------]");
        //Ejemplo para el ordenamiento de enteros
        Arrays.sort(edades);
        //Ejemplo para el ordenamiento de doubles
        Arrays.sort(temperaturas);
        //Ejemplo para el ordenamiento de Strings
        Arrays.sort(nombres);
       
        //Muestro las edades ordenadas de forma ascendente
        System.out.print("\n\n[Edades] \n>> ");
        mostrar(edades);
 
        //Muestro las temperaturas ordenadas de forma ascendente
        System.out.print("\n\n[Temperaturas] \n>> ");
        mostrar(temperaturas);
 
        //Muestro los nombres ordenados de forma ascendente
        System.out.print("\n\n[Nombres] \n>> ");
        mostrar(nombres);
 
        //Uso del metodo sort combinado con el metodo reverseOrder para colecciones
        //el cual permite realizar un ordenamiento inverso
        System.out.print("\n\n [------- Ordenamientos de forma Descendente --------]");
        //Ejemplo para el ordenamiento de enteros
        Arrays.sort(edades, Collections.reverseOrder());
        //Ejemplo para el ordenamiento de doubles
        Arrays.sort(temperaturas, Collections.reverseOrder());
        //Ejemplo para el ordenamiento de Strings
        Arrays.sort(nombres, Collections.reverseOrder());
 
        //Muestro las edades ordenadas de forma desascendente
        System.out.print("\n\n[Edades] \n>> ");
        mostrar(edades);
 
        //Muestro las temperaturas ordenadas de forma desascendente
        System.out.print("\n\n[Temperaturas] \n>> ");
        mostrar(temperaturas);
 
        //Muestro los nombres ordenados de forma desascendente
        System.out.print("\n\n[Nombres] \n>> ");
        mostrar(nombres);
 
    }
 
    /**
     * Sobrecarga del metodo mostrar para Integers
     */
    public static void mostrar(Integer ... datos){
        for(int i : datos)
            System.out.print(i + ",");
    }
 
    /**
     * Sobrecarga del metodo mostrar para Doubles
     */
    public static void mostrar(Double ... datos){
        for(double d : datos)
            System.out.print(d + ",");
    }
 
    /**
     * Sobrecarga del metodo mostrar para Strings
     */
    public static void mostrar(String ... datos){
        for(String s : datos)
            System.out.print(s + ",");
    }
}