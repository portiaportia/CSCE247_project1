//PassBehavior: a child of interface 1: OffenceBehavior
import java.util.Random;
public class PassBehavior implements OffenceBehavior{
	/* function: return the offence pass behavior
	 * input: none
	 * output: a string
	 * */
	public String play() {
		Random rand = new Random();
		String type = " ";
		int n = rand.nextInt(5);
		if( n == 0) {
			type = "slant route";
		}else if ( n == 1) {
			type = " out route";
		}else if ( n == 2) {
			type = "seem route";
		}else if(  n == 3) {
			type = "screen pass";
		}else if( n == 4) {
			type = "hail mary";
		}
		return " throws a " + type;
	}
}
