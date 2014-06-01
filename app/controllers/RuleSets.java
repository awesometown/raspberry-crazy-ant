package controllers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import core.model.CardValues;
import ma.glasnost.orika.MapperFacade;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import viewmodels.RuleSetViewModel;

@Singleton
public class RuleSets extends Controller {

	private MapperFacade mapper;

	@Inject
	public RuleSets(MapperFacade mapper) {
		this.mapper = mapper;
	}

	public Result getRuleSet() {
		CardValues cv = new CardValues();
		RuleSetViewModel vm = mapper.map(cv, RuleSetViewModel.class);
		return ok(Json.toJson(vm));
	}
}
