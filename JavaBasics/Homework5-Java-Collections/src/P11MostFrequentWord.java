import java.util.*;

public class P11MostFrequentWord {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Enter input text here: ");
		String[] inputText = input.nextLine().trim().toLowerCase().split("[^a-zA-Z]+");

		TreeMap<String, Integer> uniqueWordsCount = new TreeMap<String, Integer>();
		int maxWordCount = 0;

		for (int i = 0; i < inputText.length; i++) {
			String currentWord = inputText[i];
			int counter = 0;
			for (String word: inputText) {
				if (currentWord.equals(word)) {
					counter++;
				}
			}
			if (counter > maxWordCount) {
				maxWordCount = counter;
			}

			uniqueWordsCount.put(currentWord, counter);
		}

		for (String word : uniqueWordsCount.keySet()) {
			if (uniqueWordsCount.get(word) == maxWordCount) {
				System.out.println(word + " -> " + uniqueWordsCount.get(word) + " times");
			}
		}
	}
}