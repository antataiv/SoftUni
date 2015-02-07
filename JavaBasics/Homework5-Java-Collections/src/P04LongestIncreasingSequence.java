import java.util.Scanner;

public class P04LongestIncreasingSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String[] numbersAsStr = input.nextLine().trim().split("\\s+");
		int[] numbersArray = new int[numbersAsStr.length];
		for (int i = 0; i < numbersAsStr.length; i++) {
			numbersArray[i] = Integer.parseInt(numbersAsStr[i]);
		}
		int counter = 1;
		int bestEndIndex = 0;
		int bestCount = 1;
		System.out.print(numbersArray[0]);
		for (int i = 1; i < numbersArray.length; i++) {
			if (numbersArray[i] > numbersArray[i - 1]) {
				System.out.printf(" %d", numbersArray[i]);
				counter++;
				if (counter > bestCount) {
					bestCount = counter;
					bestEndIndex = i;
				}
			} else {
				System.out.printf("\n%d", numbersArray[i]);
				counter = 1;
			}
		}
		System.out.printf("\nLongest: ");
		for (int i = bestEndIndex - bestCount + 1; i <= bestEndIndex; i++) {
			System.out.printf("%d ", numbersArray[i]);
		}
	}
}