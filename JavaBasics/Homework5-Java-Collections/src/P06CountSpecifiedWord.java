import java.util.Scanner;

public class P06CountSpecifiedWord {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter input text here: ");
		String[] inputText = input.nextLine().trim().toLowerCase().split("[^a-zA-Z]+");
		
		System.out.println("Enter the word you will be searching for: ");
		String keyWord = input.nextLine().trim();
		int counter = 0;

		for (String word : inputText) {
			if (word.equals(keyWord)) {
				counter++;
			}
		}

		System.out.println(counter);
	}
}