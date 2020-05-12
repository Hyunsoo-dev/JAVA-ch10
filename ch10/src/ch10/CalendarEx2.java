package ch10;

import java.util.Calendar;

public class CalendarEx2 {
	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"","��","��","ȭ","��","��","��","��"};

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2020, 4, 11);
		System.out.println("date1 �� " + toString(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] +"���� �̰�" );
		System.out.println("����(date2)�� " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "���� �Դϴ�.");
	}

	private static String toString(Calendar date1) {
		String Year = Integer.toString(date1.get(Calendar.YEAR));
		String Month = Integer.toString(date1.get(Calendar.MONTH)+1);
		String Day = Integer.toString(date1.get(Calendar.DATE));
		return Year +"�� "+ Month + "�� " + Day + "�� ";
	}
	
}
