package core.model;

public class Card {

	private int rank;
	private Suit suit;

	public Card(int rank, Suit suit) {
		this.setRank(rank);
		this.setSuit(suit);
	}


	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Suit getSuit() {
		return suit;
	}

	public void setSuit(Suit suit) {
		this.suit = suit;
	}
}
