package core.model;

import java.util.HashMap;
import java.util.Map;

public class CardValues {

	private Map<Integer, Integer> rankValues;

	private Map<Suit, Integer> suitValues;

	public CardValues() {
		this.rankValues = new HashMap<Integer, Integer>();
		this.suitValues = new HashMap<Suit, Integer>();

		for(int i = 1; i <= 13; i++) {
			rankValues.put(i, i);
		}

		for(Suit s : Suit.values()) {
			suitValues.put(s, s.getValue());
		}
	}

	public Map<Integer, Integer> getRankValues() {
		return this.rankValues;
	}

	public Map<Suit, Integer> getSuitValues() {
		return this.suitValues;
	}
}
