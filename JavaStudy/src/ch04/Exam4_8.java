package ch04;

public class Exam4_8 {
	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			// �ڵ� �ۼ�
			// if((i % 10) == 3)
			// System.out.println( i + " 3 �� ���ԵǾ��ֽ��ϴ�.");
			// if(((i % 10) / 10) % 10 == 3)
			// System.out.println( i + " 3 �� ���ԵǾ��ֽ��ϴ�.");
			// if(((((i % 10) / 10) % 10) /10) % 10 == 3)
			// System.out.println( i + " 3 �� ���ԵǾ��ֽ��ϴ�.");
			// if((((((i % 10) / 10) % 10) /10) % 10) /10 == 3)
			// System.out.println( i + " 3 �� ���ԵǾ��ֽ��ϴ�.");

			int n = i;
			while (n > 0) {

				int n2 = n % 10;
				if (n2 == 3) {
					System.out.println(n);
					break;

				}
				n = n / 10;
			}
		}
	}
}
