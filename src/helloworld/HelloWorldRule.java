package helloworld;

import org.jeasy.rules.annotation.Action;
import org.jeasy.rules.annotation.Condition;
import org.jeasy.rules.annotation.Rule;

@Rule(name = "Hello World Rule" ,description = "Always Print Hello World")
public class HelloWorldRule {

	@Condition
	public boolean when() {
		return true;
	}
	
	@Action
	public void then() throws Exception
	{
		System.out.println("Hello World");
	}
}
