
public class Hunter extends Character{

	public Hunter(String inName, int inLevel)
	{
		super("Warrior", inName, inLevel);
	    setStrength(super.calcSTR());
	    setHitPoints(super.calcHP());
	}
}
