//QuarterBack: a child of abstract class Player
import java.util.Random;
public class QuarterBack extends Player {
	//declare variables
	OffenceBehavior runBehavior = new RunBehavior();
	OffenceBehavior passBehavior = new PassBehavior();
	/* function: constructors
	 * input: the name of the player
	 * output: none
	 * */
	public QuarterBack(String name) {
		super(name);
		Random rand = new Random();
		int n = rand.nextInt(2);
		if( n == 0) {
			this.offenceBehavior = new RunBehavior();
		}else if ( n == 1) {
			this.offenceBehavior = new PassBehavior();
		};  
	}

	/* function: set the offence action the QuarterBack player took
	 * input: none
	 * output: none
	 * */
	@Override
	public void setOffenceBehavior() {
		this.offenceBehavior = offenceBehavior;
	}

	/* function:set the defence action the Quarter Back player took
	 * input: none
	 * output: none
	 * */
	@Override
	public void setDefenceBehavior() {
		// TODO Auto-generated method stub
		this.defenceBehavior = null;
	}
}
