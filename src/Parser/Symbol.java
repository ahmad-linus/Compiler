package Parser;

public class Symbol {
	private String core;
	public Symbol(String newCore){
		this.setCore(newCore);
	}
	
	public boolean equals(Object sym){
		Symbol symbol = (Symbol) sym;
		return this.core.equals(symbol.getCore());
	}
	
	public String getCore() {
		return core;
	}

	public void setCore(String core) {
		this.core = core;
	}
}

class NonTerminal extends Symbol {
	public NonTerminal(String newCore) {
		super(newCore);
	}
}

class Terminal extends Symbol {
	public Terminal(String newCore){
		super(newCore);
	}
}

