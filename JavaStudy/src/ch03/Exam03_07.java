package ch03;

public class Exam03_07 {
	public static void main(String[] args) {
		int num = 12345;
		// �ڵ� �ۼ� (% ������)
		int total = 0;
		while(num>0) {
		int num1 = num % 10;
		num = num / 10;
		total += num;
		}
		System.out.println("�� �ڸ� ������ �� : " + total);
	}
}
