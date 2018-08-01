package symbolic;
import java.util.HashMap;

public class Cos extends Unary {

	// Name of the expression
	private final String name = "cos";

	// Constructor for cos
	public Cos(Sexpr argument) {
		super(argument);
	}

	// Returns the name we declared previously
	public String getName() {
		return this.name;
	}

	// Evaluation of the expression
	public Sexpr eval(HashMap<String, Sexpr> variables) {
		return Symbolic.cos(argument.eval(variables));
	}
}