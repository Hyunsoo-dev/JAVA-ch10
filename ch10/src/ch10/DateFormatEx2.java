package ch10;

import java.util.Calendar;
import java.util.Date;

public class DateFormatEx2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2005,9,3);
		
		Date day = cal.getTime();
	}
}
