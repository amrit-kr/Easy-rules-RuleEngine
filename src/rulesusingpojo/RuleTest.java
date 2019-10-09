package rulesusingpojo;

import org.jeasy.rules.api.Facts;
import org.jeasy.rules.api.Rules;
import org.jeasy.rules.api.RulesEngine;
import org.jeasy.rules.core.DefaultRulesEngine;

public class RuleTest {
	
	 public static void main(String[] args) {
	        // define facts
	        Facts facts = new Facts();
	        facts.put("rain", true);

	        // define rules
	      //  Rule weatherRule = new DefaultRulesEngine()
	        Rules rules = new Rules();
	        rules.register(new WeatherRule());

	        // fire rules on known facts
	        RulesEngine rulesEngine = new DefaultRulesEngine();
	        rulesEngine.fire(rules, facts);
	    }
}
