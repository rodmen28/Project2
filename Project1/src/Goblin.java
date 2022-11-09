
public class Goblin extends Monster {

	public Goblin(String inName, int inLevel)
		{
			super("Goblin", inName, inLevel);
		    setStrength(super.calcSTR());
		    setHitPoints(super.calcHP());
		}
	

}
