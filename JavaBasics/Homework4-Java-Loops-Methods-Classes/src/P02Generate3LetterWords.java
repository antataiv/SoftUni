import java.util.Scanner;

public class P02Generate3LetterWords {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter set of characters to be used: ");
		char[] inputChars = input.nextLine().toCharArray();

		for (int letter1 = 0; letter1 < inputChars.length; letter1++) {
			for (int letter2 = 0; letter2 < inputChars.length; letter2++) {
				for (int letter3 = 0; letter3 < inputChars.length; letter3++) {
					System.out.printf("%c%c%c ", inputChars[letter1], inputChars[letter2], inputChars[letter3]);
				}
			}
		}
		System.out.println();
	}
}