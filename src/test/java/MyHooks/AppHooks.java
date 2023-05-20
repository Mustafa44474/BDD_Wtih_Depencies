package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {
	@Before
	public void setup(Scenario sc) {
		System.out.println("PPL --> Execeution started for this Scenario -> "+ sc.getName());
		System.out.println(" $$$ Browser lauch ");
	}

	@After
	public void teardown(Scenario sc) {
		System.out.println("PPL --> Execeution end for this Scenario -> "+ sc.getName());
		System.out.println(" *** Browser lauch ");
	}

}
