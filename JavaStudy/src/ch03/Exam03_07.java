package ch03;

public class Exam03_07 {
	public static void main(String[] args) {
		int num = 12345;
		// 코드 작성 (% 연산자)
		int total = 0;
		while(num>0) {
		int num1 = num % 10;
		num = num / 10;
		total += num;
		}
		System.out.println("각 자리 숫자의 합 : " + total);
	}
}
