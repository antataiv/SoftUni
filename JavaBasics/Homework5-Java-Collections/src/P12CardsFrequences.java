import java.util.*;

public class P12CardsFrequences {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter input of cards: ");
		String[] cards = input.nextLine().trim().split("\\s+");
		double totalCards = cards.length;
		
		LinkedHashMap<String, Integer> cardFrequences = new LinkedHashMap<String, Integer>();
		
		for (String card : cards) {
			String face = card.substring(0, card.length() - 1);
			if (cardFrequences.containsKey(face)) {
				cardFrequences.put(face, cardFrequences.get(face) + 1);
			}
			else {
				cardFrequences.put(face, 1);
			}
		}
		
		for (String card : cardFrequences.keySet()) {
			double percent = cardFrequences.get(card) / totalCards * 100;
			System.out.printf("%S -> %.2f%%\n", card, percent);
		}
	}
}