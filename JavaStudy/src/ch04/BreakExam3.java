package ch04;

public class BreakExam3 {
	public static void main(String[] args) {
		boolean allstop = false;
	
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				if(i == 4 && j == 4) {
					allstop = true;
					break;
				}
				if (i == j)
					break;
				System.out.print(j + " * " + i + " = " + (j * i) + "\t");
			}
			if(allstop == true)
				break;
			System.out.println();
			
		}
	}
}