
public class Dragon extends Monster
{
	   final int BASE_STRENGTH = 50;
	   
	   
	   public Dragon(String inName, int inLevel, int inSize)
	   {
	      super("Dragon", inName, inLevel);
	      setSize(inSize);
	      setStrength(this.calcSTR());
	      setHitPoints(super.calcHP());
	      setMove(this.calcMove());
	   }
	   public int calcSTR()
	   {
	      int siz = getSize();
	      int lvl = getLevel();
	      int str = lvl * siz / 3 + BASE_STRENGTH;
	      return str;
	   }
	   public int calcMove() 
	   {
	   return (getStrength() + getLevel()) / getSize();
	   }
	}
