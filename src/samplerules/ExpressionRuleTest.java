package samplerules;

import java.util.HashMap;
import java.util.Map;

import org.mvel2.MVEL;
import org.mvel2.integration.VariableResolverFactory;
import org.mvel2.integration.impl.MapVariableResolverFactory;

/**
 * @author Amrit1.Kumar
 *
 */
public class ExpressionRuleTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("A", 0);
		map.put("B", 48);
		map.put("C", 11);
		map.put("D", 70);
		map.put("E", 10);
		map.put("F", 8);
		try {
			String expr1 = "( A >= 0) && (F > 2) && ( ( B < 10) || (C > 4 ))";
			String expr2 = "( D > 10) && (F < 1)";
			String expr3 = "( F > 4) && (C > 10) && ( B < 23 )";
			String expr4 = "( E > 9) || (C > 3) || (D > 44 )";
			VariableResolverFactory functionFactory = new MapVariableResolverFactory(map);
			System.out.println("result of expression1 : " + MVEL.eval(expr1, functionFactory));
			System.out.println("result of expression2 : " + MVEL.eval(expr2, functionFactory));
			System.out.println("result of expression3 : " + MVEL.eval(expr3, functionFactory));
			System.out.println("result of expression4 : " + MVEL.eval(expr4, functionFactory));

		//	System.out.println(MVEL.eval("EB>0 ", map));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
