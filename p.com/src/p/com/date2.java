package p.com;

import java.time.LocalDate;

public class date2 {
public static void main(String[] args) {
	LocalDate ld=LocalDate.now();
	System.out.println(ld);
	LocalDate ld2=ld.minusDays(1);
	System.out.println(ld2);
	LocalDate ld3=ld.plusDays(1);
	//System.out.println(ld3);
}
}
