import java.util.*;

public class P03LargestSequenceOfEqualStrings {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter input string here: ");
		String [] words = input.nextLine().trim().split("\\s+");

		int maxLength = 1;
		int currLength = 1;
		String maxString = words[0];
		String currSequence = words[0];
		for (int i = 1; i < words.length; i++) {
			
			String currString = words[i];
			if (currString.equals(currSequence)) {
				currLength++;
				if (currLength > maxLength) {
					maxLength = currLength;
					maxString = currSequence;
				}
			}
			else {
				currLength = 1;
				currSequence = currString;
			}
		}

		for (int i = 0; i < maxLength; i++) {
			System.out.print(maxString  + " ");
		}
	}
}