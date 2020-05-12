package practice01;

import java.util.Scanner;

public class Prob04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		
		String text = scanner.nextLine();
		
		//중첩 loop
		
		/*int length = text.length();
		
		for(int i = 0; i < length; i++) {
			System.out.println(text.charAt(length));
		}
		
		char c0 = text.charAt(0);
		char c1 = text.charAt(1);
		char c2 = text.charAt(2);
		char c3 = text.charAt(3);
		char c4 = text.charAt(4);
		
		
		System.out.println(text);
		System.out.println(length);
		System.out.println(c0);
		
		*/

		
		scanner.close();
	}
}