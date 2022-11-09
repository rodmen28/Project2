
public class Mage extends Character {

	public Mage(String inName, int inLevel)
	{
		super("Warrior", inName, inLevel);
	    setStrength(super.calcSTR());
	    setHitPoints(super.calcHP());
	}
}
