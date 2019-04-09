package ch04;

public class Exam4_6 {
	public static void main(String[] args) {
		int space = 0;
		for (int i = 0; i <= 5; i++) {
			//space = 5 - i;
			space = i - 1;
			for (int j = 0; j <= 5; j++) {
				if(j <= space) {
					System.out.print(" ");
				}else {
					System.out.print("*");	
				}
			}
			System.out.println();
		}
	}

}
