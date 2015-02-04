import java.util.Scanner;

public class P02SequencesOfEqualStrings {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter input string here: ");
		String [] words = input.nextLine().trim().split("\\s+");

		System.out.print(words[0] + " ");

		for (int i = 1; i < words.length; i++) {
			if (words[i].equals(words[i - 1])) {
				System.out.print(words[i] + " ");
			}
			else {
				System.out.print("\n" + words[i] + " ");
			}
		}
	}
}