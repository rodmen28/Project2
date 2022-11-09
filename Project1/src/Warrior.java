
public class Warrior extends Character{
	
	public Warrior(String inName, int inLevel)
	{
		super("Warrior", inName, inLevel);
	    setStrength(super.calcSTR());
	    setHitPoints(super.calcHP());
	}

}
 