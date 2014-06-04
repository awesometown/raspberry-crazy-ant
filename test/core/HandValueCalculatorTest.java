package core;

import core.model.Card;
import core.model.CardValues;
import core.model.Hand;
import core.model.Suit;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HandValueCalculatorTest {

	@Test
	public void simpleAdditionGivesCorrectResult() {
		HandValueCalculator calc = new HandValueCalculator();

		Hand h = new Hand(new Card(1, Suit.CLUBS), new Card(2, Suit.CLUBS), new Card(3, Suit.CLUBS));
		CardValues cv = new CardValues();

		int value = calc.calculateHandValue(h, cv);
		assertEquals(value, 6);

	}

	@Test
	public void pairGivesProduct() {
		HandValueCalculator calc = new HandValueCalculator();

		Hand h = new Hand(new Card(6, Suit.CLUBS), new Card(6, Suit.CLUBS));
		CardValues cv = new CardValues();

		int value = calc.calculateHandValue(h, cv);
		assertEquals(value, 36);
	}
}
