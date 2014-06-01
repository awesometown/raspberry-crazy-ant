/*
 * Created by IntelliJ IDEA.
 * User: John
 * Date: 2014-05-20
 * Time: 2:21 PM
 */
package utility;

import com.google.inject.AbstractModule;
import core.model.Card;
import core.model.CardValues;
import core.model.Hand;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import viewmodels.CardViewModel;
import viewmodels.HandViewModel;
import viewmodels.RuleSetViewModel;

public class CodingChallengeOrikaModule extends AbstractModule {
	protected void configure() {
		MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();
		registerMappings(mapperFactory);
		bind(MapperFactory.class).toInstance(mapperFactory);
		bind(MapperFacade.class).toInstance(mapperFactory.getMapperFacade());
	}

	private void registerMappings(MapperFactory mapperFactory) {
		mapperFactory.getConverterFactory().registerConverter(new SuitToStringConverter());
		mapperFactory.classMap(Card.class, CardViewModel.class);
		mapperFactory.classMap(Hand.class, HandViewModel.class);
		mapperFactory.classMap(CardValues.class, RuleSetViewModel.class);
	}
}
