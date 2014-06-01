import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import core.services.DeckService;
import play.Application;
import play.GlobalSettings;
import utility.CodingChallengeOrikaModule;

public class Global extends GlobalSettings {

	private Injector injector;

	@Override
	public void onStart(Application application) {
		injector = Guice.createInjector(new CodingChallengeOrikaModule(),
				new AbstractModule() {
					@Override
					protected void configure() {
						bind(DeckService.class);
					}
				}
		);
	}

	@Override
	public <T> T getControllerInstance(Class<T> aClass) throws Exception {
		return injector.getInstance(aClass);
	}
}