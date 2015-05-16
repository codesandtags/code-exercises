package org.codesandtags.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FormateoFechas {
	
	public static void main(String[] args) {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Calendar fecha = Calendar.getInstance();
		
		System.out.println(" => " + sdf.format(fecha.getTime()));
		
	}

}
