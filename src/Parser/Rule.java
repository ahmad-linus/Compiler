package Parser;
import Parser.Symbol;
import Parser.NonTerminal;

public class Rule {
	private Symbol leftHandSide;
	private Symbol[] rightHandSide;
	
	public Symbol getLeftHandSide() {
		return this.leftHandSide;
	}
	
	public Symbol[] getRightHandSide(){
		return this.rightHandSide;
	}
	
	public Rule(String rule){
		String[] symbols = rule.split(" ");
		this.leftHandSide = new NonTerminal(symbols[0]);
		if (symbols.length == 2) {  // epsilon rule
			rightHandSide = null;
			return;
		}
		else {
			this.rightHandSide = new Symbol[symbols.length - 2];
			for (int i = 2; i < symbols.length; i++)
				this.rightHandSide[i - 2] = new Symbol(symbols[i]);
		}
	}
	
	public boolean equals(Object rule){
		Rule Rule2 = (Rule) rule;
		
		if (! Rule2.getLeftHandSide().equals(this.leftHandSide))
			return false;
		Symbol[] RHS = Rule2.getRightHandSide();
		
		if (RHS.length != this.getRightHandSide().length)
			return false;
		
		for (int i = 0; i < this.getRightHandSide().length; i++){
			if (!this.rightHandSide[i].equals(RHS[i]))
				return false;
		}
		return true;
	}
}

class LRItem extends Rule{
	private int pointer;
	public LRItem(String rule, int pointer){
		super(rule);
		this.pointer = pointer;
	}
	
	public boolean equals(Object LR) {
		Rule Rule_2 = (Rule) LR;
		LRItem LR_2 = (LRItem) LR;
		if (super.equals(Rule_2) && LR_2.pointer == this.pointer)
			return true;
		else 
			return false;
	}
}
