package symbolic;
import java.util.HashMap;

// Functions for symbolic expressions
public class Symbolic {

	// Evaluation of addition
	public static Sexpr addition(Sexpr left, Sexpr right) {
		if(left.isConstant() && right.isConstant()) {
			return new Constant(left.getValue() + right.getValue());
		}
		return new Addition(left, right);
	}

	// Evaluation of subtraction
	public static Sexpr subtraction(Sexpr left, Sexpr right) {
		if(left.isConstant() && right.isConstant()) {
			return new Constant(left.getValue() - right.getValue());
		}
		return new Subtraction(left, right);
	}

	// Evaluation of multiplication
	public static Sexpr multiplication(Sexpr left, Sexpr right) {
		if(left.isConstant() && right.isConstant()) {
			return new Constant(left.getValue() * right.getValue());
		}
		return new Multiplication(left, right);
	}

	// Evaluation of division
	public static Sexpr division(Sexpr left, Sexpr right) {
		if(left.isConstant() && right.isConstant()) {
			return new Constant(left.getValue() / right.getValue());
		}
		return new Division(left, right);
	}

	// Evaluation of sine
	public static Sexpr sin(Sexpr argument) {
		if(argument.isConstant()) {
			return new Constant(Math.sin(argument.getValue()));
		}
		return new Sin(argument);
	}

	// Evaluation of cosine
	public static Sexpr cos(Sexpr argument) {
		if(argument.isConstant()) {
			return new Constant(Math.cos(argument.getValue()));
		}
		return new Cos(argument);
	}

	// Evaluation of logarithm
	public static Sexpr log(Sexpr argument) {
		if(argument.isConstant()) {
			return new Constant(Math.log(argument.getValue()));
		}
		return new Log(argument);
	}

	// Evaluation of exponent
	public static Sexpr exp(Sexpr argument) {
		if(argument.isConstant()) {
			return new Constant(Math.exp(argument.getValue()));
		}
		return new Exp(argument);
	}

	// Evaluation of negation
	public static Sexpr negation(Sexpr argument) {
		if(argument.isConstant()) {
			return new Constant(-argument.getValue());
		}
		return new Negation(argument);
	}




}