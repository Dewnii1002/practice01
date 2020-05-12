package practice01;

public class Prob02 {

	public static void main(String[] args) {
		// 중첩반복문

		int num = 1;
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 10; j++) {
				sum = sum + 1;
				System.out.print(sum + "\t");
				
			}
			sum = num + i;
			System.out.print("\n");
		}
	}

}