package org.codesandtags.projecteuler;

import java.util.Calendar;

/**
 * You are given the following information, but you may prefer to do some
 * research for yourself.
 * 
 * 1 Jan 1900 was a Monday. Thirty days has September, April, June and November.
 * All the rest have thirty-one, Saving February alone, Which has twenty-eight,
 * rain or shine. And on leap years, twenty-nine. A leap year occurs on any year
 * evenly divisible by 4, but not on a century unless it is divisible by 400.
 * How many Sundays fell on the first of the month during the twentieth century
 * (1 Jan 1901 to 31 Dec 2000)?
 * 
 * @author codes and tags
 * 
 */

public class Problem19 {

	private final int YEAR = 1900;

	public static void main(String[] args) {
		
		long start = System.currentTimeMillis();
		
		Problem19 solve = new Problem19();
		System.out.println("=>" + solve.daysOfCentury2());
		
		long end = System.currentTimeMillis();
		System.out.println("Total : " + (end - start) + " ms");
		
	}
	
	public int daysOfCentury2(){
		
		int sundays = 0;
		Calendar inicio = Calendar.getInstance();
		Calendar fin = Calendar.getInstance();
		inicio.set(1901,0, 0);
		fin.set(2000,11, 31);
		
		int x = 0;
		
		while(inicio.compareTo(fin) < 0){
			inicio.add(Calendar.DAY_OF_MONTH, 1);
			
			if(inicio.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
				if(inicio.get(Calendar.DAY_OF_MONTH) == 1){
					System.out.println(inicio.getTime());
					sundays++;	
				}
			}
			
			/*
			if(x == 50){
				System.out.println(inicio.getTime());
				System.out.println(fin.getTime());
				break;
			}
			*/
			x++;
		}
		
		return sundays;
	}

	public int daysOfCentury() {
		
		
		int[] daysOfWeek = new int[7];
		int[] months     = new int[12];
		int yearStart = 1900;
		int yearEnd   = 1914;
		int days = 0;
		
		months[0] = 31; //Enero
		months[1] = 28; //Febrero
		months[2] = 31; //Marzo
		months[3] = 30; //Abril
		months[4] = 31; //Mayo
		months[5] = 30; //Junio
		months[6] = 31; //Julio
		months[7] = 31; //Agosto
		months[8] = 30; //Septiembre
		months[9] = 31; //Octubre
		months[10] = 30; //Noviembre
		months[11] = 31; //Diciembre
		
		
		while(yearStart < yearEnd){
			days = 0;
			
			//Validacion para el año bisiesto
			if(yearStart % 4 == 0 || yearStart % 400 == 0){
				months[1] = 29;
			}else{
				months[1] = 28;
			}
			
			for (int m = 0; m < months.length; m++) {
				days += months[m];
			}
			
			System.out.println("Dias año : " + yearStart +  " = " + days);
			yearStart++;
		}
		
		return daysOfWeek[0];
	}
}
