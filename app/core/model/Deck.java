package core.model;

import java.util.*;

public class Deck {
	private Stack<Card> cards;

	public Deck() {
		cards = new Stack<Card>();

		for(Suit suit : Suit.values()) {
			for(int rank = 1; rank < 13; rank++) {
				cards.add(new Card(rank, suit));
			}
		}
	}

	public Card dealCard() {
		return cards.pop();
	}

	public int getNumCards() {
		return cards.size();
	}

	public void shuffle() {
		Collections.shuffle(cards);
	}
}
