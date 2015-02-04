import java.util.*;

public class P10ExtractAllUniqueWords {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter input text here: ");
		String[] inputText = input.nextLine().trim().toLowerCase().split("[^a-zA-Z]+");
		
		TreeSet<String> words = new TreeSet<String>();
		for (String word : inputText) {
			words.add(word);
		}
		
		for (String word : words) {
			System.out.println(word);
		}
	}
}