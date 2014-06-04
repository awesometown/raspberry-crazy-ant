package core.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hand {
	private List<Card> cards;

	public Hand() {
		this.setCards(new ArrayList<Card>());
	}

	public Hand(List<Card> cards) {
		this.setCards(cards);
	}

	public Hand(Card ... cards) {
		this(new ArrayList<Card>(Arrays.asList(cards)));
	}

	public void addCard(Card card) {
		getCards().add(card);
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
}
