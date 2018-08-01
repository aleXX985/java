package symbolic;
import java.util.HashMap;
(
public class Constant extends Atom {
	
	private Double value;
	
	// Value of a Constant
	public Constant(double value) {
		this.value = value;
	}

	// Returns the name of the constant
	public String getName() {
		return this.value.toString();
	}

	// Checks if this is a constant
	public Boolean isConstant() {
		return true;
	}

	// Returns the value of a constant
	public double getValue() {
		return this.value;
	}

	// The actual evaluation of the constant
	public Sexpr eval(HashMap<String, Sexpr> variables) {
		return this;
	}

}