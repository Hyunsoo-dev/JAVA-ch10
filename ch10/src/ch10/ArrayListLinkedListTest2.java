package ch10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest2 {

	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>(1000000);
		LinkedList<Object> ll = new LinkedList<Object>();

		add(al);
		add(ll);
		
		System.out.println("=접근시간테스트=");
		System.out.println("ArrayList : " + access(al));
		System.out.println("LinkedList : " + access(ll));
		
	}
	
	public static void add(List<Object> list) {
		
		for(int i = 0; i < 1000000 ; i++) list.add(i + "");
		
	}
	
	public static long access(List<Object> list) {
		long start = System.currentTimeMillis();
		
		for(int i = 0 ; i < 100000 ; i++) list.get(i);
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}

	
	
}




 