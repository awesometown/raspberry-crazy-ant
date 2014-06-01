package controllers;

import com.google.inject.Singleton;
import play.mvc.Action;
import play.mvc.Controller;
import play.mvc.Result;

@Singleton
public class Application extends Controller {

	public Result index() {
		return ok("hi");
	}
}
