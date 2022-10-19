package com.Date;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class date {
public static void main(String[] args) {
	Locale l=Locale.FRENCH;
	DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT , l);
	Date d=new Date();
	String str=df.format(d);
	System.out.println(str);
	
	
}
}
