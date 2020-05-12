package ch10;

import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2020, 4, 11);
		System.out.println("date1 은 " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] +"요일 이고" );
		System.out.println("오늘(date2)은 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일 입니다.");
	}

	private static String toString(Calendar date1) {
		String Year = Integer.toString(date1.get(Calendar.YEAR));
		String Month = Integer.toString(date1.get(Calendar.MONTH)+1);
		String Day = Integer.toString(date1.get(Calendar.DATE));
		return Year +"년 "+ Month + "월 " + Day + "일 ";
	}
	
}
