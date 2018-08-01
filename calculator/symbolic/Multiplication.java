package symbolic;
import java.util.HashMap;

// Expression for multiplication
public class Multiplication extends Binary {

	// Constructor for multiplication
	public Multiplication(Sexpr left, Sexpr right) {
		super(left, right);
	}

	// Returns the name of the operation
	public String getName() {
		return "*";
	}

	// Returns the priority of the operation
	public int priority() {
		return 1;
	}

	// Evaluation of the expression
	public Sexpr eval(HashMap<String, Sexpr> variables) {
		return Symbolic.multiplication(left.eval(variables), right.eval(variables));
	}
}