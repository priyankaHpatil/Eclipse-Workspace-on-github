package p.com;

import java.time.LocalDate;

public class date1 {

	public static void main(String[] args) {
		String str="2011-09-01";
		LocalDate d1=LocalDate.parse(str);
System.out.println(d1);
String strr="2012-10-22";
LocalDate d2=LocalDate.parse(strr);
System.out.println(d2.getYear());
System.out.println("cjh");
	}

}
 