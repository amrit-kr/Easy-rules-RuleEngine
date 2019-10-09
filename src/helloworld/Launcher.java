package helloworld;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;

public class Launcher {

	public static void main(String[] args) {
		
		// Create Facts
		Facts facts = new Facts();
		
		// Create Rules
		Rules rules = new Rules();
		rules.register(new HelloWorldRule());
		
		// Create a Rule Engine and Fire rules on Known Facts
		RulesEngine ruleEngine = new DefaultRulesEngine();
		ruleEngine.fire(rules, facts);
	}

}
