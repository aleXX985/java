package symbolic;
import java.util.HashMap;

// Expression for negation
public class Negation extends Unary {

	// Name of the operation
	final String name = "-";

	// Constructor for negation
	public Negation(Sexpr argument) {
		super(argument);
	}

	// Returns the name we declared above
	public String getName() {
		return this.name;
	}

	// Evaluation of the expression
	public Sexpr eval(HashMap<String, Sexpr> variables) {
		return Symbolic.negation(argument.eval(variables));
	}
}