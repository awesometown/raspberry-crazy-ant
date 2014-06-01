package core.model;

import java.util.List;

public enum Suit {

	SPADES(4),
	DIAMONDS(3),
	CLUBS(2),
	HEARTS(1);

	private int value;

	Suit(int value) {
		this.value = value;
	}

	public int getValue() {
		return this.value;
	}
}
