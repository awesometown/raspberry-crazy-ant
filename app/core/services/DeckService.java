package core.services;

import core.model.Deck;
import core.model.Hand;

import java.util.ArrayList;
import java.util.List;

public class DeckService {

	public List<Hand> dealHands(int numHands, int handSize) {
		Deck deck = new Deck();
		if (totalCardsNeeded(numHands, handSize) > deck.getNumCards()) {
			throw new IllegalArgumentException("Insufficient cards in deck to deal specified number of hands");
		}
		deck.shuffle();
		List<Hand> hands = createEmptyHands(numHands);
		for(int i = 0; i < handSize; i++) {
			for(Hand hand : hands) {
				hand.addCard(deck.dealCard());
			}
		}
		return hands;
	}

	private int totalCardsNeeded(int numHands, int handSize) {
		return numHands * handSize;
	}

	private List<Hand> createEmptyHands(int numHands) {
		List<Hand> hands = new ArrayList<Hand>();
		for(int i = 0; i < numHands; i++) {
			hands.add(new Hand());
		}
		return hands;
	}
}
