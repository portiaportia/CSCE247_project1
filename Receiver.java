//Receiver: a child of abstract class Player
public class Receiver extends Player {
	//declare variables
	OffenceBehavior receiveBehavior = new ReceiveBehavior();
	/* function: constructors
	 * input: the name of the player
	 * output: none
	 * */
	public Receiver(String name) {
		super(name);
		offenceBehavior = new ReceiveBehavior();
	}

	/* function:set the offence action the receiver player took
	 * input: none
	 * output: none
	 * */
	@Override
	public void setOffenceBehavior() {
		this.offenceBehavior = receiveBehavior;
	}

	/* function:set the defence action the receiver player took
	 * input: none
	 * output: none
	 * */
	@Override
	public void setDefenceBehavior() {
		this.defenceBehavior = null;
	}
}
