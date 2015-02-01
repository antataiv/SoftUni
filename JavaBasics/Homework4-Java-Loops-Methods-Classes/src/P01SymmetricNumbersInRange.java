import java.util.Scanner;

public class P01SymmetricNumbersInRange {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter start and end numbers (a b) from 0 to 999: ");
		int start = input.nextInt();
		int end = input.nextInt();
		boolean symmetricNumberFound = false;

		for (int currentNum = start; currentNum <= end; currentNum++) {
			if (currentNum < 10) {
				System.out.print(currentNum + " ");
				symmetricNumberFound = true;
			}
			else if (currentNum >=10 && currentNum < 100) {
				String numToString = String.valueOf(currentNum);
				if (numToString.charAt(0) == numToString.charAt(1)) {
					System.out.print(currentNum + " ");
					symmetricNumberFound = true;
				}
			}
			else {
				String numToString = String.valueOf(currentNum);
				if (numToString.charAt(0) == numToString.charAt(2)) {
					System.out.print(currentNum + " ");
					symmetricNumberFound = true;
				}
			}
		}
		if (!symmetricNumberFound) {
			System.out.println("No symmetric numbers found!");
		}
	}
}