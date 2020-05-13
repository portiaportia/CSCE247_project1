//an abstract class with 3 children: QuarterBack, LineMan, and Receiver
public abstract class Player{
	protected String name; //name of the player
	private boolean defence = false;//on "defence" or not
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;
	
	/* function: toString method
	 * input: name of a player
	 * output: none
	 * */
	public Player(String name) {
		this.name = name;
	}

	/* function: toggle the roles from offences to defences
	 * input: none
	 * output: none
	 * */
	public void turnover() {
		if(defence == true) {
			defence = false;
		}else {
			defence = true;
		}
	}
	
	/* function: prints the actions each role did
	 * input: none
	 * output: a string with the status of each player's action
	 * */
	public String play() {
		String playString = null;
		if(defence == true && this.defenceBehavior != null) {
			playString = defenceBehavior.play();
			}else if(defence == false&&this.offenceBehavior != null){
				playString = offenceBehavior.play();
			}
		if(playString == null)
			playString = " not playing";
		return playString;
	}
	
	//used by child classes to set the defence behavior accordingly
	public abstract void setDefenceBehavior();
	
	//used by child classes to set the offence behavior accordingly
	public abstract void setOffenceBehavior();
}
