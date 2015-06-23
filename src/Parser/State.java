package Parser;
import java.util.HashSet;
import Parser.LRItem;

public class State {
	private HashSet<LRItem> items;
	
	public State(LRItem[] kernel) {
		
	}
	
	private void Closure(){
		
		
	}
	
	public boolean equals(Object state){
		return false;
	}
	
	public static void main(String[] args) {
		
		HashSet<String> a = new HashSet<String>();
		a.add("hello");
		a.add("bye");
		System.out.println(a.contains("bye"));
	}
}
