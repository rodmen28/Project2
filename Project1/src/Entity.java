
public abstract class Entity implements Movement 
{

	   private String type, name;
	   private int level, size, strength, hitPoints, move;
	   
	   //setters
	   public void setType (String inType) 
	   {
	      type = inType;
	   }
	   public void setName(String inName)
	   {
	      name = inName;
	   }
	   public void setLevel (int inLevel) 
	   {
	      level = inLevel;
	   }
	   public void setSize(int inSize)
	   {
	      size = inSize;
	   }
	   public void setStrength(int inStrength)
	   {
	      strength = inStrength;
	   }
	   public void setHitPoints(int inHitPoints)
	   {
	      hitPoints = inHitPoints;
	   }
	   
	   //getters
	   public String getName()
	   {
	      return name;
	   }
	   public String getType()
	   {
	      return type;
	   }
	   public int getLevel()
	   {
	      return level;
	   }
	   public int getSize()
	   {
	      return size;
	   }
	   public int getStrength()
	   {
	      return strength;
	   }
	   public int getHitPoints()
	   {
	      return hitPoints;
	   }
	   
	   //movement
	   public abstract int calcMove();
	   public void setMove (int inMove) 
	   {
	      move = inMove;
	   }
	   public int getMove () 
	   {
	      return move;
	   }
	   
	   public String toString() {
	      String outStr = "";
	      outStr += name + " (";
	      outStr += type + ")\n";
	      outStr += "LVL: " + level + ", ";
	      outStr += "SZ: " + size + ", ";
	      outStr += "STR: " + strength + ", ";
	      outStr += "HP: " + hitPoints + ", " + "MV: " + move + "\n\n";
	      return outStr;
	   }
	   
	   public abstract int calcSTR();
	   public abstract int calcHP();
}
