package symbolic;
import java.util.HashMap;

public class Division extends Binary {

	//Name of the expression
	final String name = "/";

	// Constructor for division
	public Division(Sexpr left, Sexpr right) {
		super(left, right);
	}

	// Returns name declared above
	public String getName() {
		return this.name;
	}

	// Returns the priority of the operation
	public int priority() {
		return 1;
	}

	// Evaluation of the expression
	public Sexpr eval(HashMap<String, Sexpr> variables) {
		return Symbolic.division(this.left.eval(variables), this.right.eval(variables));
	}
}