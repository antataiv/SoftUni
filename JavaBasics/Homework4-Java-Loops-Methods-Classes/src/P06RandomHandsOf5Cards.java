import java.util.*;

public class P06RandomHandsOf5Cards {
	public static void main(String[] args) {
		String[] suits = new String[] {"\u2663", "\u2666", "\u2665", "\u2660"};
		String[] cards = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		Random rand = new Random();

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter how many random hands to be generated: ");
		int n = Integer.parseInt(input.nextLine());

		for (int i = 0; i < n; i++) {
			HashSet<String> hand = new HashSet<String>();
			while (hand.size() < 5) {
				String card = cards[rand.nextInt(13)];
				String suit = suits[rand.nextInt(4)];

				hand.add(card+suit);
			}
			for (String item : hand) {
				System.out.print(item + " ");
			}
			System.out.println();
		}
	}
}