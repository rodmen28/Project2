
public class Ogre extends Monster {
	
	public Ogre(String inName, int inLevel)
	{
		super("Ogre", inName, inLevel);
	    setStrength(super.calcSTR());
	    setHitPoints(super.calcHP());
	}
}
