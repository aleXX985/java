package symbolic;
import java.util.HashMap;

// Symbolic expression
public abstract class Sexpr {

	// Fetches name of expression
	public abstract String getName();

	// Fetches priority of expression
	public int priority() {
		return 0;
	}

	// Check to see if the expression is a constant
	public Boolean isConstant() {
		return false;
	}

	// Check to see if the expression is a variable
	public Boolean isVariable() {
		return false;
	}

	// Check if the expression is the quit expression
	public Boolean toQuit() {
		return false;
	}

	// Check if it is the vars expression
	public Boolean isVars() {
		return false;
	}

	// Get the value of an expression
	public double getValue() {
		return 0;
	}

	// Evaluation of the expression
	public abstract Sexpr eval(HashMap<String, Sexpr> variables);
}

