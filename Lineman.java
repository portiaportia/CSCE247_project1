//a child of abstract class Player
import java.util.Random;
public class Lineman extends Player{
	//declares variables
	OffenceBehavior oBlockBehavior = new OBlockBehavior();
	DefenceBehavior blockBehavior = new BlockBehavior();
	DefenceBehavior stripBehavior = new StripBehavior();
	DefenceBehavior sackBehavior = new SackBehavior();
	/* function: constructors
	 * input: the name of the player
	 * output: none
	 */
	public Lineman(String name) {
		super(name);
		offenceBehavior = new OBlockBehavior();
		Random rand = new Random();
		int n = rand.nextInt(3);
		if( n == 0) {
			defenceBehavior = new BlockBehavior();
		}else if ( n == 1) {
			defenceBehavior = new StripBehavior();
		}else if ( n == 2) {
			defenceBehavior = new SackBehavior();
		}	
		
	}
	/* function:set the offence action the Line Man player took
	 * input: none
	 * output: none
	 * */
	@Override
	public void setOffenceBehavior() {
		this.offenceBehavior = oBlockBehavior;
	}
	
	
	/* function:set the defence action the Line Man player took
	 * input: none
	 * output: none
	 * */
	@Override
	public void setDefenceBehavior() {
		this.defenceBehavior = defenceBehavior;
	}
}
