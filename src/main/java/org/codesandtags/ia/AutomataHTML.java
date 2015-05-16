package org.codesandtags.ia;

/**
 * Automata finito de estados que valida si una secuencia esta bien o mal 
 * escrita. teniendo en cuenta las siguientes reglas : 
 * 
 *  1. construida para los tags <b>,</b> y <br/>
 *  2. Se debe tener en cuenta el estado final
 *  3. Se debe tener en cuenta el estado de error
 * 
 */

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;


public class AutomataHTML {
    
    HashMap<String, Estado> estados = new HashMap<String, Estado>();;
    ArrayList<String> alfabeto;
    Estado actual;
    HashMap<String, Estado> estadosFinales;

    // Creacion de estados
    Estado q0       = new Estado("q0");
    Estado q1       = new Estado("q1");
    Estado q2       = new Estado("q2");
    Estado q3       = new Estado("q3");
    Estado q4       = new Estado("q4");
    Estado q5       = new Estado("q5");    
    Estado q6       = new Estado("q6");
    Estado q7       = new Estado("q7");
    Estado q8       = new Estado("q8");
    Estado q9       = new Estado("q9");
    Estado q10      = new Estado("q10");
    Estado q11      = new Estado("q11");
    Estado q12      = new Estado("q12");
    Estado q13      = new Estado("q13");
    Estado q14      = new Estado("q14");
    Estado q15      = new Estado("q15");
    Estado q100     = new Estado("q100");
    
    
    Object matrizTransicion[][] = {
        {q0,"r",q0},
        {q0,"*",q0},
        {q0,"b",q0},
        {q0,"/",q0},
        {q0,"<",q1},
        
        {q1,"b",q2},        
        {q1,"*",q100},
        {q1,"r",q100},
        {q1,"/",q100},
        {q1,">",q100},
        
        {q2,">",q3},
        {q2,"r",q9},
        {q2,"*",q100},
        
        {q3,"*",q4},
        {q3,"<",q5},
        
        {q4,"*",q4},
        {q4,"<",q5},
        
        {q5,"/",q6},
        {q5,"b",q12},
        
        {q6,">",q7},
        
        {q7,">",q8},    //Final
        
        {q8,"*",q8},    //Final
        {q8,"<",q1},    //Final
                
        {q9,"*",q100},
        {q9,">",q100},
        {q9,"b",q100},
        {q9,"/",q10},
        
        {q10,">",q8},   //Final
        {q10,"<",q1},   //Final
        
        {q12,"r",q13},
        
        {q13,"/",q14},
        
        {q14,">",q3},
        {q14,">",q15},
        
        {q100,"*",q100},//Error
        {q100,"b",q100},//Error
        {q100,"r",q100},//Error
        {q100,"<",q100},//Error
        {q100,"/",q100},//Error
        {q100,">",q100} //Error
    };
    
    
    public Estado getEstadoInicial(){
        return actual;
    }
    
    public HashMap<String, Estado> getEstadosFinales(){
        return estadosFinales;
    }
    
    public AutomataHTML() {
        estados         = new HashMap<String, Estado>();
        alfabeto        = new ArrayList<String>();
        estadosFinales  = new HashMap();
        
        // Creacion del alfabeto
        alfabeto.add("*");
        alfabeto.add("<");
        alfabeto.add(">");
        alfabeto.add("/");
        alfabeto.add("b");
        alfabeto.add("r");
        
        
        // Coleccion de estados
        estados.put(q0.getNombre(), q0);
        estados.put(q1.getNombre(), q1);
        estados.put(q2.getNombre(), q2);
        estados.put(q3.getNombre(), q3);
        estados.put(q4.getNombre(), q4);
        estados.put(q5.getNombre(), q5);        
        estados.put(q6.getNombre(), q6);
        estados.put(q7.getNombre(), q7);
        estados.put(q8.getNombre(), q8);
        estados.put(q9.getNombre(), q9);
        estados.put(q10.getNombre(), q10);
        estados.put(q11.getNombre(), q11);
        estados.put(q12.getNombre(), q12);
        estados.put(q13.getNombre(), q13);
        estados.put(q14.getNombre(), q14);
        estados.put(q100.getNombre(), q100);
        
        // Definicion del estado inicial
        actual = q0;
        
        // Definicion del estado final
        estadosFinales.put(q8.getNombre(), q8);
    }
    
    public static void main(String[] args) {
        System.out.println("Empezando...");
        
        // Posibles entradas
        String[] entradas = 
                        {
                            "html sin negrita <br/> <b> html con negrita </b>", //BIEN
                            "<br/>", //BIEN
                            "<b html sin negrita><br/>", //MAL
                            "<b><br/>html sin negrita", //MAL
                            "<br/>html sin <b>negrita",//MAL
                            "html sin negrita </b>" //MAL
                        };
        
        for(String entrada : entradas){
            
            AutomataHTML autotales = new AutomataHTML();
            int ncaracter  = 0;
            Estado estado = autotales.getEstadoInicial();
            
            System.out.println("Caso de Prueba => " + entrada);
            for(int i=0; i< entrada.length(); i++){
                String valor = String.valueOf(entrada.charAt(i));
                estado       = autotales.transicion(valor);
                String mensaje = MessageFormat.format(" {0} : [{1}] : columna : {2}", 
                        estado, valor, i);

                System.out.println(mensaje);

                // Identifica donde hubo el error de sintaxis por primera vez
                if(estado.getNombre().equals("q100") && ncaracter == 0){
                    ncaracter = i;
                }
            }

            if(estado.getNombre().equals("q100")){
                System.out.println("ERROR de sintaxis que empieza en la columna : " + ncaracter);
            } 
            else if(autotales.getEstadosFinales().containsKey(estado.getNombre())){
                System.out.println("BIEN Lvl up!");
            }else{
                System.out.println("ERROR falta cerrar algun tag, por favor revise");
                System.out.println("Estado no determinado, pilas => " + estado.getNombre());
            }
            
            System.out.println(" ");
        }
        
        System.out.println("... Terminado :)");
    }
    
    
    /**
     * Valida si el caracter ingresado corresponde a los del 
     * alfabeto definido, de lo contrario devuelve * 
     * asterisco
     * @param caracter
     * @return 
     */
    public String validarCaracterAlfabeto(String caracter){        
        
        boolean isValido = false;
        
        for(String caracterAlfabeto : alfabeto){
            if(caracterAlfabeto.equals(caracter)){
                isValido = true;
                break;      
            }
        }
        
        if(!isValido)
            caracter = "*";
        
        return caracter;
    }
    
    /**
     * Manejo de transiciones
     * @param estado
     * @param valor
     * @return 
     */
    public Estado transicion(String entrada) {

        entrada = validarCaracterAlfabeto(entrada);
        
        for (int i = 0; i < matrizTransicion.length; i++) {
            Object[] tabla   = matrizTransicion[i];
            Estado einicial  = (Estado)tabla[0]; //Columna 1 matrizTransicion
            String mensaje   = (String)tabla[1]; //Columna 2 matrizTransicion
            Estado efinal    = (Estado)tabla[2]; //Columna 3 matrizTransicion
            if(einicial==actual && mensaje.equals(entrada)){
                actual = efinal;
            }   
        }
        
        return actual;
    }

    
}

/**
 * Clase para el control de Estados
 */
class Estado {
    private String nombre;
   
    public String getNombre(){
        return nombre;
    }
   
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
   
    Estado(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return getNombre();
    }
    
}