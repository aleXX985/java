package symbolic;
import java.util.HashMap;

public class Quit extends Command {

	final String name = "Quit";

	public String getName() {
		return this.name;
	}

	public Boolean toQuit() {
		return true;
	}

	public Sexpr eval(HashMap<String, Sexpr> variables) {
		return this;
	}
}