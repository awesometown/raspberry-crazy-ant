package viewmodels;

import java.util.HashMap;
import java.util.Map;

public class RuleSetViewModel {

	private Map<Integer, Integer> rankValues;
	private Map<String, Integer> suitValues;

	public RuleSetViewModel() {
		this.rankValues = new HashMap<Integer, Integer>();
		this.suitValues = new HashMap<String, Integer>();
	}

	public Map<Integer, Integer> getRankValues() {
		return rankValues;
	}

	public Map<String, Integer> getSuitValues() {
		return suitValues;
	}
}
