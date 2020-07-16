package ch08;

public class Ex8_3 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);	// 고의로 ArithmeticException을 발생시킴
			System.out.println(4);		// 실행 X
		} catch (Exception e) {
			System.out.println(5);
		}	// try-catch의 끝
		
		System.out.println(6);
	}
}
