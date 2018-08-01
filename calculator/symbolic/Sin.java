package symbolic;
import java.util.HashMap;

// Syntax and expression for sine
public class Sin extends Unary {
	
	// Set name of operation to sin
	final String name = "sin";

	// Constructor of sine
	Public Sin(Sexpr argument) {
		super(argument);
	}

	// Get the name declared above
	public String getName() {
		return this.name;
	}

	// Evaluation of the expression
	public Sexpr eval(HashMap<String, Sexpr> variables) {
		return Symbolic.sin(argument.eval(variables));
	}
}