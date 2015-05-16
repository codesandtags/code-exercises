package org.codesandtags.acm;

import java.io.*;
import java.util.*;

public class he {
    
    public static void main(String[] args) throws IOException{
        //Lectura de entrada estandar
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String linea = null;
        StringTokenizer st;
        
        while( (linea = entrada.readLine()) != null){
            //Si la entrada es igual a 0 0 retorna
            if(linea.equals("0 0")) return;
            st = new StringTokenizer(linea);
            //Nro de Atacantes y defensores
            int A = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());

            //Definicion de arreglos para el manejo de atacantes y defensores
            int[] atacantes = new int[A];
            int[] defensores = new int[D];
                        
            //Entrada de distancias de atacantes
            st = new StringTokenizer(entrada.readLine());
            for (int i = 0; i < atacantes.length; i++) {
                atacantes[i] = Integer.parseInt(st.nextToken());
            }
            
            //Entrada de distancias de defensores
            st = new StringTokenizer(entrada.readLine());
            for (int i = 0; i < defensores.length; i++) {
                defensores[i] = Integer.parseInt(st.nextToken());
            }
            
            //Solucion del problema
            //1. Ordenamiento ascendente
            Arrays.sort(atacantes);
            Arrays.sort(defensores);
            
            //System.out.println(">> : " + atacantes[0] + ":" + defensores[0]);
            
            //2. Comparaciones y salida
            if(atacantes[0] < defensores[0]){
                System.out.println("Y");
            }else if(atacantes[0] > defensores[0]){
                System.out.println("N");
            }else{
                //Aqui se complica la vaina
                int nAtacantes  = 0;
                int nDefensores = 0;
                //Cantidad Atacantes
                for (int i = 0; i < atacantes.length; i++) {
                    if(atacantes[i] == atacantes[0]) nAtacantes++;
                }
                for (int i = 0; i < defensores.length; i++) {
                    if(defensores[i] == defensores[0]) nDefensores++;
                }
                
                if(nDefensores - nAtacantes >= 1){
                    System.out.println("N");
                }else{
                    System.out.println("y");
                }
            }
        }
        
        System.exit(0);
    }
}