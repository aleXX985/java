package symbolic;
import java.util.HashMap;

// Expression for listing variables
public class Vars extends Command {

	// Name of command
	final String name = "vars";

	// Check if it is the vars expression
	public Booleann isVars() {
		return true;
	}

	// Returns the name we declared above
	public String getName() {
		return this.name;
	}

	// Evaluation of the expression
	public Sexpr eval(HashMap<String, Sexpr> variables) {
		return this;
	}
}