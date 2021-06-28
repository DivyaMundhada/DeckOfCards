package deckofCardsProblem;

import java.util.HashSet;
import java.util.Set;

public class DeckOfCards {

	void cardDistribution() {
		String suit[] = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String rank[] = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		String deck[][] = new String[4][13];
		Set<String> cards = new HashSet();
		String player[][] = new String[4][9];

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				deck[i][j] = suit[i] + rank[j];
		// System.out.println(deck[i][j]);
			}
		}
		int p1 = 0, p2 = 0, p3 = 0, p4 = 0, num = 1;

		while (num <= 36) {
			int randomSuit = (int) Math.floor(Math.random() * 10) % 4;
			int randomRank = (int) Math.floor(Math.random() * 100) % 13;

			if (cards.add(deck[randomSuit][randomRank])) {
				int option = num % 4;
				switch (option) {
				case 0:
					player[option][p1++] = deck[randomSuit][randomRank];
					break;
				case 1:
					player[option][p2++] = deck[randomSuit][randomRank];
					break;
				case 2:
					player[option][p3++] = deck[randomSuit][randomRank];
					break;
				case 3:
					player[option][p4++] = deck[randomSuit][randomRank];
					break;
				}
				num++;
			}

		}

		for (int i = 0; i < 4; i++) {
			System.out.println("***Player " + (i + 1) + "***");
			for (int j = 0; j < 9; j++) {
				System.out.println(player[i][j]);
			}
		}

	}

	public static void main(String[] args) {
		DeckOfCards obj = new DeckOfCards();
		obj.cardDistribution();
	}

}
