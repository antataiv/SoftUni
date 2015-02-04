import java.util.Scanner;

public class P07CountSubstringOccurrences {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter input text here: ");
		String inputText = input.nextLine().trim().toLowerCase();
		
		System.out.println("Enter the substring you will be searching for: ");
		String keySubstring = input.nextLine().trim().toLowerCase();
		int counter = 0;
		
		for (int i = 0; i < inputText.length() - keySubstring.length() + 1; i++) {
			String currSubstring = inputText.substring(i, i + keySubstring.length());
			if (currSubstring.equals(keySubstring)) {
				counter++;
			}
		}
		
		System.out.println(counter);
	}
}