package org.codesandtags.scjp;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.*;

public class PruebaOdesk {

	public static void main(String[] srg){
		System.out.println("Tales");
		
		List I = new ArrayList();
		I.add("1");
		I.add("2");
		I.add(1,"3");
		
		System.out.println(I);
		
		String s = "Goodbye";
		int i = 5;
		char c = 'c';
		
		PruebaOdesk cosa = new PruebaOdesk();
		cosa.hola();
		
		int[] cosa2 = new int[2];
		int[] cosa3 = {1,2,3,4};
		
		int tales = (int)2.5;
		System.out.println(tales);
		
		System.gc();
		

		
	}
	
	private PruebaOdesk(){
		
	}
	
	public void hola(){
		System.out.println("Hello");
	}
	
	
	
}
