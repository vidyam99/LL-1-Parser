import java.util.LinkedList;

public class EpsilonRule
{
	private static TerminalRule epsilon;
	private static LinkedList<GrammarRule> epsilonList;
	
	/**
	 * Returns the epsilon rule.
	 * @return - epsilon.
	 */
	public static TerminalRule getEpsilonRule()
	{
		if(epsilon == null)
			epsilon = new TerminalRule("EPSILON");
		return epsilon;
	}
	
	/**
	 * Returns a linked list that only contains epsilon.
	 * @return - epsion list.
	 */
	public static LinkedList<GrammarRule> getEpsilonList()
	{

		if(epsilonList == null)
		{
			epsilonList = new LinkedList<GrammarRule>();
			epsilonList.add(epsilon);
		}
		return epsilonList;
	}
}
