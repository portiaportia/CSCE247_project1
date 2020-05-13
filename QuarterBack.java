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
		this.setOffenceBehavior();
	}

	/* function: set the offence action the QuarterBack player took
	 * input: none
	 * output: none
	 * */
	@Override
	public void setOffenceBehavior() {
		Random rand = new Random();
		int n = rand.nextInt(2);
		if( n == 0) {
			this.offenceBehavior = runBehavior;
		}else if ( n == 1) {
			this.offenceBehavior = passBehavior;
		};  
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
