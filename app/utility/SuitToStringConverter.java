package utility;

import core.model.Suit;
import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.converter.Converter;
import ma.glasnost.orika.metadata.Type;

public class SuitToStringConverter extends CustomConverter<Suit, String> {

	public boolean canConvert(Class<Suit> sourceClass, Class<? extends String> destinationClass) {
		return true;
	}

	@Override
	public String convert(Suit source, Type<? extends String> destinationClass) {
		switch(source) {
			case CLUBS:
				return "clubs";
			case DIAMONDS:
				return "diamonds";
			case HEARTS:
				return "hearts";
			case SPADES:
				return "spades";
			default:
				return "unknown";
		}
	}
}