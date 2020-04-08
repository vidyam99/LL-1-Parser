

import java.util.LinkedList;

public class TerminalRule extends GrammarRule 
{
	public TerminalRule(String sym)
	{
		this.symbol = sym;
	}

	@Override
	public boolean isTerminal() 
	{
		return true;
	}
	
	@Override
	public LinkedList<TerminalRule> getFirst()
	{
		LinkedList<TerminalRule> first = new LinkedList<TerminalRule>();
		first.add(this);
		return first;
	}

	/**
	 * Follow undefined for terminal, so we throw a runtime exception.
	 * This function will only be called with misuse of the functions
	 * and is only included for completion's sake.
	 */
	@Override
	public LinkedList<TerminalRule> getFollow()
	{
		throw new RuntimeException();
	}

	@Override
	public String toString()
	{
		return this.symbol;
	}
}
