package ch10;

import java.util.Stack;

public class StackEx1 {
	public static Stack<Object> back = new Stack<Object>();
	public static Stack<Object> forward = new Stack<Object>();
	
	public static void main(String[] args) {
	
		goURL("1.����Ʈ");
		goURL("2.����");
		goURL("3.���̹�");
		goURL("4.����");
		
		printStatus();
		
		goBack();
		System.out.println("=�ڷΰ��� ��ư�� ���� ��=");
		printStatus();
		
	}
	
	public static void printStatus() {
		System.out.println("back : " + back);
		System.out.println("forward : " + forward);
		System.out.println("����ȭ���� '" +  back.peek() + "' �Դϴ�.");
		System.out.println();
	}
	
	public static void goURL(String URL) {
		back.push(URL);
		if(!forward.empty())
			forward.clear();
	}
	
	public static void goForward() {
		if(!forward.empty())
			back.push(forward.pop());
	}
	
	public static void goBack() {
		if(!back.empty())
			forward.push(back.pop());
	}
	
	
	
	
}
