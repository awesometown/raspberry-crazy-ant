package core;

import core.model.Card;
import core.model.CardValues;
import core.model.Hand;

import java.util.HashMap;
import java.util.Map;

public class HandValueCalculator {

	public int calculateHandValue(Hand h, CardValues values) {
		Map<Integer, Integer> rankCounts = new HashMap<>();
		for(Card c : h.getCards()) {
			updateRankCount(rankCounts, c);
		}
		int runningTotal = 0;
		for(Integer rank : rankCounts.keySet()) {
			int rankBaseValue = values.getRankValues().get(rank);
			int occurrences = rankCounts.get(rank);
			int rankTotalValue = (int)Math.pow(rankBaseValue,occurrences);
			runningTotal += rankTotalValue;
		}
		return runningTotal;
	}

	private void updateRankCount(Map<Integer, Integer> rankCounts, Card c) {
		Integer currentVal;
		if(rankCounts.containsKey(c.getRank())) {
			currentVal = rankCounts.get(c.getRank());
		} else {
			currentVal = 0;
		}
		rankCounts.put(c.getRank(), currentVal + 1);
	}
}
