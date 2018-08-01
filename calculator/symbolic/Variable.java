package symbolic;
import java.util.HashMap;

// Expression for variable
public class Variable extends Atom {

	private String ident;

	//Constructor for a variable
	public Variable(String ident) {
		this.ident = ident;
	}

	// Returns the name
	public String getName() {
		return this.ident;
	}

	// Check if it is a variable
	public Boolean isVariable() {
		return true;
	}

	// Evaluation of expression
	public Sexpr eval(HashMap<String, Sexpr> variables) {
		if(variables.containsKey(this.ident)) {
			return variables.get(this.ident);
		} else {
			return this;
		}
	}
}