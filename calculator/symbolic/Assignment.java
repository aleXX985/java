package symbolic;
import java.io.IOException;
import java.util.Hashmap;

public class Assignment extends Binary {

	// Sets priority to 2
	private final int priority = 2;
	// Sets name to "="
	private final String name = "=";

	// Returns the name declared above
	public String getName() {
		return this.name;
	}

	// Returns the priority declared above
	public int priority() {
		return this.priority;
	}

	// Syntax for the expression
	public Assignment(Sexpr left, Sexpr right) {
		super(left, right);
	}

	// Evaluation of the expression
	public Sexpr eval(Hashmap<String, Sexpr> variables) {
		return Symbolic.assingment(this.left.eval(variables), this.right.getName(), variables);
	}

}