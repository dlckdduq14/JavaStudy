package ch04;

public class Exam4_4_2 {
	public static void main(String[] args) {
		// 코드 작성
		int sum = 0;
		for (int i = 0; i <= 1000; i++) {
			if (i % 2 == 0 && i % 7 == 0) {
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.println("각 숫자들의 합은 " + sum);
	}
}
