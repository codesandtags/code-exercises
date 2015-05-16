package org.codesandtags.math;

/* Codigo mejorado 
 * Encuentra la suma de todos los valores enteros de la solucion de las
 * formulas cuadraticas tomadas de un archivo
 * @author  DMK
 * Agradecimientos especiales al señor HaDeS por su buen reto =)
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.*;

public class Cuadraticas {
    public static void main(String args[]) throws IOException, ArrayIndexOutOfBoundsException{
        //String archivo = "quadratic.txt";
		try{			
			//String archivo = args[0];
			String archivo = "c:\\Hunter\\cuadraticas.txt";
			sumarCuadraticasEnteras(archivo);
		}catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("Por favor ingrese el nombre del fichero a procesar ");
			System.out.println("Ejemploe : java Cuadraticas miFichero.txt");
		}
    }

    public static void sumarCuadraticasEnteras(String archivo) throws IOException{
        //Variables de control
        int necuaciones     = 0;
        String formulaError = "";
        //Variables para la formula
        long a,b,c,suma = 0;     //Valores de la ecuacion cuadratica
        int pos;        //Posicion para el substring
        String chunk;   //Trozo que va guardando la operacion
        double x1 = 0, x2 = 0, h = 0, raiz = 0; //Valores de salida
            
        //Verifico si el archivo existe
        try{
            //Variables para el manejo de archivos
            //Fichero de entrada
            File fe = new File(archivo);        
            BufferedReader br = new BufferedReader(new FileReader(fe));
            //Fichero de salida
            PrintWriter out = new PrintWriter(new FileWriter("salida.txt"));

            //Leo el fichero
            String linea = "";
            while( (linea = br.readLine())!= null){
                //Remplazo caracteres en blanco
      
                linea = linea.replace("	", "");
                linea = linea.replace("--", "+");
                linea = linea.replace("x+-", "x-");
                linea = linea.replace("x--", "x+");
                linea = linea.replace("x++-", "x-");
                linea = linea.replace("+++", "+");      
                
                //Obtengo el valor de a
                pos = linea.indexOf("x^2");
                chunk = linea.substring(0, pos);
                a = Long.parseLong(chunk);
                //System.out.println(a);

                //Obtengo el valor de b
                pos = linea.indexOf("+");
                chunk = linea.substring((pos + 1),linea.indexOf("x",pos));
                if(chunk.length() == 0)
                    b = 1;
                else
                    b = Long.parseLong(chunk);

                //Obtengo el valor de c
                pos = linea.indexOf("x",pos);
                if(linea.indexOf("x+",pos) > 1)
                    chunk = linea.substring((pos + 2),linea.length());
                else
                    chunk = linea.substring((pos + 1),linea.length());

                if(chunk.length() == 0)
                    c = 0;
                else
                    c = Long.parseLong(chunk);

               //Realizo operacion de la raiz
               h = (b*b - 4*a*c);
               //Evaluo si h es negativo
                if(h < 0)
                    raiz = Math.sqrt((h * -1));
                else
                    raiz = Math.sqrt(h);

                x1 = ((-b) + (raiz)) / (2*a);
                x2 = ((-b) - (raiz)) / (2*a);

                //out.println("#" + necuaciones + " >>  x1  " + x1 + "   ==    x2: " + x2);

                //Realizo la suma de los numeros sin parte decimal
                if(x1 % 1 == 0){
                    necuaciones++;
                    suma += (long)x1;
                    out.println("#" + necuaciones + " : " + x1);
                }
                
                //Sumo los valores enteros de x1 y x2
                //Imprimo resultados
                if(x2 % 1 == 0){
                    necuaciones++;
                    suma += (long)x2;
                    out.println("#" + necuaciones + " : " + x2);
                }
                if( (x1 % 1 != 0 && x2 % 1 != 0)){
                    necuaciones++;
                    formulaError = "#" + necuaciones + " : " + linea + "\n";
                }
                
                //out.println(linea);
            }
            br.close();         //Cierro el archivo de lectura

            //Muestro varios resultados para comparar la respuesta
            out.println("Total de ecuaciones identificadas : " + necuaciones);
            out.println("La suma de los numeros es : " + suma);
            out.println("Las siguientes formulas tienen error : " + formulaError);
            
            out.flush();
            out.close();
        }catch(FileNotFoundException ex){
            System.out.println(" ERROR : Lo siento tio, pero el archivo "  + archivo + " no esta en ");
        }
    }
}