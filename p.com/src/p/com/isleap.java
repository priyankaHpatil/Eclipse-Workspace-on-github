package p.com;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class isleap {
public static void main(String[] args) {
	LocalDate ld=LocalDate.of(2017, 1, 13);
	LocalDateTime ld1=ld.atTime(2, 2, 2);
	System.out.println(ld1);
	System.out.println(ld.isLeapYear());
}
}
