package symbolic;

// Unary symbolic expression
public abstract class Unary extends Sexpr {

	protected Sexpr argument;

	// Priority of the expression
	public int priority() {
		return 0;
	}

	// Constructor for the operation
	public Unary(Sexpr argument) {
		this.argument = argument;
	}

	// Converting to string
	public String toString() {
		return this.getName() + "(" + argument.toString() + ")";
	}
}