
// Rule using an Expression Language:

package rulesusingexpression;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rule;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;
import org.jeasy.rules.mvel.MVELRule;

public class RuleTest {

	public static void main(String[] args) {
		// define facts
		Facts facts = new Facts();
		facts.put("rain", true);

		// define rules
		Rule weatherRule = new MVELRule()
				.name("weather rule")
				.description("if it rains then take an umbrella")
				.when("rain == true")
				.then("System.out.println(\"It rains, take an umbrella!\");");

		
		Rules rules = new Rules();
		rules.register(weatherRule);

		// fire rules on known facts
		RulesEngine rulesEngine = new DefaultRulesEngine();
		rulesEngine.fire(rules, facts);
	}
}
