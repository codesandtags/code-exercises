package org.codesandtags.utils;

import java.io.File;
import java.io.RandomAccessFile;

public class TestODesk {
	
	String str = "asdfasdf";
	static int a;
	int b;
	
	public void cosa(String x, int c){
		
	}
	
	public void cosa(int c, String x){
		
	}
	
	public void Cosa(int c, String x){
		
	}
	
	TestODesk(){
		
		String kk = "hello";
		System.out.println(kk.substring(2,3));
		
	}
	
	public static void main(String[] args) throws Exception{
		System.out.println("codes");
		
		TestODesk cosa = new TestODesk();
		//System.out.println(cosa.coco());
		
		int rand;
		rand = (int)Math.random();
		System.out.println(rand);
		
		int i=2;
		int j=3;
		int x = j & i;
		System.out.println("=>" + x);
		Integer cox = 10;
		
		update(cox);
		
		
	}
	
	public static void update(Integer ing){
		System.err.println(ing);
		ing = 15;
		System.err.println(ing);
	}
	
	public String coco() throws Exception{
		throw new Exception("changos");
	}
	
	private class A{
		A(){
			System.out.println("A");
		}
		
	}
	
	private class B extends A{
		B(){
			System.out.println("B");
		}
	}

}
