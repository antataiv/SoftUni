import java.util.Scanner;

public class P05CountAllWords {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter input text here: ");
		String[] inputText = input.nextLine().trim().split("[^a-zA-Z]+");
		
		System.out.println(inputText.length);
	}
}