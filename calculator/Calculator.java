import symbolic.*;
import java.util.*;
import java.io.IOException;

public class Calculator {

	static final HashMap<String, Sexpr> variables = new HashMap<String, Sexpr>();

	static final boolean quit = false;

	public static void main(String[] arguments) throws IOException {
		System.out.println("Welcome to the symbolic calculator!");
		boolean run = true;
		Parser p = new Parser();

		while(run) {

			try {

				System.out.print("? ");
				Sexpr e = p.statement();

				if (e.isQuit()) {
					System.out.print("Goodbye!");
					run = false;
				} else if (e.isVars()) {
					printVars();
				} else {
					System.out.println(e);
					e = e.eval(variables).toString() + '\n';
					System.out.println(e);
				}
			} catch (SyntaxErrorException e) {
				System.out.print("Syntax Error: ");
				System.out.println(e.getMessage());
			}
		}
	}
}