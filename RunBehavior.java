//RunBehavior: a child of interface 1: OffenceBehavior
import java.util.Random;
public class RunBehavior implements OffenceBehavior{
	/* function: return the offence run behavior
	 * input: none
	 * output: a string
	 * */
	public String play() {
		Random rand = new Random();
		String type = " ";
		int n = rand.nextInt(4);
		if( n == 0) {
			type = "drive (up the gut)";
		}else if ( n == 1) {
			type = " draw";
		}else if ( n == 2) {
			type = "pitch";
		}else if ( n == 3) {
			type = "reverse";
		}
		return " runs a " + type;
	}
}
