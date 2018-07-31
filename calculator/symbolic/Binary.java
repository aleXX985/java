package symbolic;

public abstract class Binary extends Sexpr {
	protected Sexpr left;
	protected Sexpr right;

	public Binary(Sexpr left, Sexpr right) {
		this.left = left;
		this.right = right;
	}

	public String toString() {

		if(this.priority() < this.left.priority()) {
			left.toString() = "(" + left.toString() + ")";
		}

		if(this.priority() < this.right.priority()) {
			right.toString() = "(" + right.toString() + ")";
		}

		return left.toString() + " " + getName() + " " + right.toString();
	}
}