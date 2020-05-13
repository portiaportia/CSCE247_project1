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
		this.setDefenceBehavior();
		offenceBehavior = new OBlockBehavior();
		
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
		Random rand = new Random();
		int n = rand.nextInt(3);
		if( n == 0) {
			this.defenceBehavior = blockBehavior;
		}else if ( n == 1) {
			this.defenceBehavior = stripBehavior;
		}else if ( n == 2) {
			this.defenceBehavior = sackBehavior;
		}
	}
}
