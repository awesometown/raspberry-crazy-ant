package core.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hand {
	public List<Card> cards;

	public Hand() {
		this.cards = new ArrayList<Card>();
	}

	public Hand(List<Card> cards) {
		this.cards = cards;
	}

	public Hand(Card ... cards) {
		this(new ArrayList<Card>(Arrays.asList(cards)));
	}

	public void addCard(Card card) {
		cards.add(card);
	}
}
