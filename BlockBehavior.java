//BlockBehavior: a child of interface 2: DefenceBehavior
import java.util.Random;
public class BlockBehavior implements DefenceBehavior{
	/* function: return the defence block behavior
	 * input: none
	 * output: a string
	 * */
	@Override
	public String play() {
		Random rand = new Random();
		String type = " ";
		int n = rand.nextInt(4);
		if( n == 0) {
			type = "kick";
		}else if ( n == 1) {
			type = "punch";
		}else if ( n == 2) {
			type = "pass";
		}else if(  n == 3) {
			type = "catch";
		}
		return "Block a " + type ;
	}
		
	
