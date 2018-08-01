package symbolic;
import java.util.HashMap;

// Expression for log
public class Log extends Unary {

	// Name of the operation
	final String name = "log";

	// Constructor for log
	public Log(Sexpr argument) {
		super(argument);
	}

	// returns the name we declared above
	public String getName() {
		return this.name;
	}

	// Evaluation of the expression
	public Sexpr eval(HashMap<String, Sexpr> variables) {
		return Symbolic.log(argument.eval(variables));
	}

}