package org.codesandtags.utils;

import java.util.StringTokenizer;

public class InvertirTexto {
	public static void main(String[] args){
		
		InvertirTexto invertir = new InvertirTexto();
		System.out.println(" Texto : " + invertir.invertirTexto("jejejejejeje se olos euq slos ut sarolav sasoc omoc atse.. ijjijiji"));
		
		System.out.println(" Texto : " + invertir.invertirTexto("jejejeje Wow, interesante forma de escribir lo que piensas!!!... Esa pelicula es muy bonita =)... Esa es la actitud, nunca pero nunca te rindas porque con tu forma de ser y esa personalidad tan maravillosa te esperan grandes cosas en esta vida :D Hakuna Matata!!!... Te deseo una excelente semana"));
	}
	
	public String invertirTexto(String texto){
		
		StringBuilder resultado = new StringBuilder();
		StringBuilder p;
		StringTokenizer palabras = new StringTokenizer(texto);
		
		while(palabras.hasMoreTokens()){
			p = new StringBuilder(palabras.nextToken()).reverse();
			resultado.append(p).append(" "); 
		}
		
		return resultado.toString();
	}
}
