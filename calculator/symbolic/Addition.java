package symbolic;
import java.io.IOException;
import java.util.HashMap;

// Sexpr class describing addition

public class Addition extends Binary {

	// The syntax for the addition
	public Addition(Sexpr first, Sexpr second) {
		super(first, second);
	}

	// Simply returns priority
	public int priority() {
		return 1;
	}

	// The actual evaluation of the expression
	public Sexpr eval(HashMap<String, Sexpr> variables) {
		return Symbolic.addition(this.left.eval(variables), this.right.eval(variables));
	}

	// Fetches the name of the addition class "+"
	public String getName() {
		return "+";
	}
}