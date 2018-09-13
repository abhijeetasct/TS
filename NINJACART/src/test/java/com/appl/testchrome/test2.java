package com.appl.testchrome;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class test2 {

	public static void main(String[] args) {
//
//		Locale locale = new Locale("in", "IN");
//		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
//		String date = dateFormat.format(new Date());
//		System.out.println(date);
//		
//		
//		//  O/P-  2018 Jun 7
//	}
	
	
	 Date today = Calendar.getInstance().getTime();
	    
	    // print out today's date
	    System.out.println(today);
}
}