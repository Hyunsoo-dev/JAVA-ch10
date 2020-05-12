package ch10;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx1 {
	public static void main(String[] args) {
		Date d = new Date();
		
		String s = d.toString(); //date class�� toString method 
		System.out.println("���� ��¥ : " + s);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("���� ��¥ : " + sdf.format(d));
		
		SimpleDateFormat abc = new SimpleDateFormat("yy�� M�� dd��");
		System.out.println("���� ��¥ : " + abc.format(d));
		
		SimpleDateFormat sdf1 , sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5 , sdf6, sdf7, sdf8 , sdf9;
		
		sdf1 = new SimpleDateFormat("yyyy-mm-dd");
		sdf2 = new SimpleDateFormat("``yy�� MMM dd�� E����");
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		
		System.out.println(sdf1.format(d));
		System.out.println(sdf2.format(d));
		System.out.println(sdf3.format(d));
		System.out.println(sdf4.format(d));
		sdf5 = new SimpleDateFormat();
		
	}
}
