import java.util.Random;

public class Monster extends Entity {
	   public Monster()
	   {
	      setName("none");
	      setLevel(1);
	      setSize(1);
	      setMove(1);
	      setStrength(1);
	      setHitPoints(1);
	    }
	   
	   
	   public Monster(String inType, String inName, int inLevel)
	   {
	      setType(inType);
	      setName(inName);
	      setLevel(inLevel);
	      setSize(1);
	      setMove(calcMove());
	      setStrength(calcSTR());
	      setHitPoints(calcHP());
	   }
	   
	   
	   public int calcSTR()
	   {
	      Random r = new Random();
	      r.setSeed(System.currentTimeMillis());
	      int rand = r.nextInt(8) + 3;
	      
	      int x = getLevel();
	      int y = getSize();
	      
	      int str = x * y + rand;
	      return str;
	   }
	   
	   
	   public int calcHP()
	   {
	      int x = getStrength();
	      int y = getLevel();
	      
	      int hp = x * y / 2;
	      return hp;
	   }
	   
	   public int calcMove() 
	   {
	      if (getSize() > 3) 
	      {
	         return (getSize() + getLevel());
	      } 
	      else 
	      {
	         return (3 + getLevel()/2);
	      }
	   }
}
