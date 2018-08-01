package symbolic;
import java.util.HashMap;

// Expression for subtraction
public class Subtraction extends Binary {

	// Set name to 
	final String name = "-";
	// Set priority
	final int priority = 1;

	// Constructor for "-"
	public Subtraction(Sexpr left, Sexpr right) {
		super(left, right);
	}

	// Get the name from above
	public String getName() {
		return this.name;
	}

	// Get the priority from above
	public int priority() {
		return this.priority;
	}

	// Evaluation of the expression
	public Sexpr eval(HashMap<String, Sexpr> variables) {
		return Symbolic.subtraction(this.left.eval(variables), this.right.eval(variables))
	}

}