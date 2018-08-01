package symbolic;
import java.util.HashMap;

public class Exp extends Unary {

	// Name of the expression
	final String name = "exp";

	// Constructor for Exp
	public Exp(Sexpr argument) {
		super(argument);
	}

	// Returns the name we declared above
	public String getName() {
		return this.name; 
	}

	// Evaluation of the expression
	public Sexpr eval(HashMap<String, Sexpr> variables) {
		return Symbolic.exp(argument.eval(variables));
	}
}