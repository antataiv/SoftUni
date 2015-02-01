public class P03FullHouse {
	public static void main(String[] args) {
		String[] suits = new String[] {"\u2663", "\u2666", "\u2665", "\u2660"};
		String[] cards = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
		int fullHouses = 0;

		for (int suit1 = 0; suit1 < suits.length - 2; suit1++) {
			for (int suit2 = suit1 + 1; suit2 < suits.length; suit2++) {
				for (int suit3 = suit2 + 1; suit3 < suits.length; suit3++) {
					for (int suit4 = 0; suit4 < suits.length; suit4++) {
						for (int suit5 = suit4 + 1; suit5 < suits.length; suit5++) {
							for (int face1 = 0; face1 < cards.length; face1++) {
								for (int face2 = 0; face2 < cards.length; face2++) {
									String card1 = cards[face1] + suits[suit1];
									String card2 = cards[face1] + suits[suit2];
									String card3 = cards[face1] + suits[suit3];
									String card4 = cards[face2] + suits[suit4];
									String card5 = cards[face2] + suits[suit5];
									if (face1 != face2) {
										System.out.printf("%s %s %s %s %s \n", card1, card2, card3, card4, card5);
										fullHouses++;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println(fullHouses);
	}
}