package controllers;

import com.google.inject.Inject;
import core.model.Suit;
import core.services.DeckService;
import ma.glasnost.orika.MapperFacade;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import core.model.Card;
import core.model.Hand;
import viewmodels.CardViewModel;
import viewmodels.GetHandsResponse;
import viewmodels.HandViewModel;

import javax.inject.Singleton;
import java.util.List;

@Singleton
public class Hands extends Controller {

	private DeckService deckService;
	private MapperFacade mapper;

	@Inject
	public Hands(DeckService deckService, MapperFacade mapper) {
		this.deckService = deckService;
		this.mapper = mapper;
	}

	public Result getHand() {
		List<Hand> hands = deckService.dealHands(3, 5);
		List<HandViewModel> handVms = mapper.mapAsList(hands, HandViewModel.class);
		GetHandsResponse response = new GetHandsResponse(handVms);
		return ok(Json.toJson(response));
	}

	public Result getCard() {
		Card c= new Card(3, Suit.CLUBS);
		CardViewModel vm = mapper.map(c, CardViewModel.class);
		return ok(Json.toJson(vm));
	}
}
