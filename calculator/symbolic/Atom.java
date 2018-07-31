package symbolic;

// Class for public Atom symbolic expressions.
public abstract class Atom extends Sexpr {

	public String toString() {
		return this.getName();
	}
} 