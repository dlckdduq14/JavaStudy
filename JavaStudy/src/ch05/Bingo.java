package ch05;

public class Bingo {
	public static void main(String[] args) {
		int[] bingo = new int[25];
		for (int i = 0; i < 25; i++) {
			bingo[i] = i + 1;
		}
		for (int i = 0; i < 1000; i++) {
			int temp =0;
			int random = (int)(Math.random() * 25);
			temp = bingo[0];
			bingo[0] = bingo[random];
			bingo[random] = temp;
			}
		for (int j = 0; j <= 25; j++) {
			System.out.print(bingo[j + 1] + " \t " );
			if( j % 5 == 0)
				System.out.println();
		}
	}
}
