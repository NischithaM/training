package com.cruds.wrapperutility;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

public class DateFormatDemo {
		
	
	public static void main(String[] args) {
		DateFormat shortFormat = DateFormat.getDateInstance(
		DateFormat.SHORT,Locale.US);
		String s = "01/01/2014";

		try 
		{
			Date date = shortFormat.parse(s);
			System.out.println(shortFormat.format(date));
			DateFormat fullFormat = DateFormat.getDateInstance(
					DateFormat.FULL,Locale.ITALY);
			System.out.println(fullFormat.format(date));

		} 
		catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
