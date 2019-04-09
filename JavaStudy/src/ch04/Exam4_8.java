package ch04;

public class Exam4_8 {
	public static void main(String[] args) {
		for (int i = 1; i <= 1000; i++) {
			// 코드 작성
			// if((i % 10) == 3)
			// System.out.println( i + " 3 이 포함되어있습니다.");
			// if(((i % 10) / 10) % 10 == 3)
			// System.out.println( i + " 3 이 포함되어있습니다.");
			// if(((((i % 10) / 10) % 10) /10) % 10 == 3)
			// System.out.println( i + " 3 이 포함되어있습니다.");
			// if((((((i % 10) / 10) % 10) /10) % 10) /10 == 3)
			// System.out.println( i + " 3 이 포함되어있습니다.");

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
