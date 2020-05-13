//SackBehavior: a child of interface 2: DefenceBehavior
public class SackBehavior implements DefenceBehavior {
	/* function: return the defence sack behavior
	 * input: none
	 * output: a string
	 * */
	@Override
	public String play() {
		return "Sack the quarterback";
	}
}
