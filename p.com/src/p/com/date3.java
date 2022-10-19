package p.com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class date3 {
public static void main(String[] args) {
	LocalDate ld=LocalDate.now();
	String str=ld.format(DateTimeFormatter.ISO_DATE);
	System.out.println(str);
	LocalDate ld2=LocalDate.of(2018, 10, 2);
	String str2=ld2.format(DateTimeFormatter.ISO_DATE);
	System.out.println(str2);
			
			}
}
