
// Rules in a programmatic way with a fluent API:

package rulesusingfluentapi;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.core.RuleBuilder;

public class RuleTest {

	public static void main(String[] args) {
		
		// define facts
		Facts facts1 = new Facts();
		facts1.put("rain", true);

		Rule weatherRule = new RuleBuilder().name("weather rule").description("if it rains then take an umbrella")
				.when(s -> s.get("rain").equals(true)).then(s -> System.out.println("It rains, take an umbrella!"))
				.build();

		Rules rules = new Rules();
		rules.register(weatherRule);

		// fire rules on known facts
		RulesEngine rulesEngine = new DefaultRulesEngine();
		rulesEngine.fire(rules, facts1);
	}
}
