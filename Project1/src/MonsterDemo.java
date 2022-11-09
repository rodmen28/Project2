
public class MonsterDemo {
	
	public static void main(String [] args)
    {
        Monster defMonster = new Monster();
        System.out.println(defMonster.toString());
        
        Goblin myGoblin = new Goblin("Narg", 3);
        System.out.println(myGoblin.toString()); 
        
        Dragon myDragon = new Dragon("Krell", 3, 9);
        System.out.println(myDragon.toString());
        
        Dragon myDragon2 = new Dragon("Tragath", 12, 5);
        System.out.println(myDragon2.toString());
        
        Monster Kobold = new Monster("Kobold", "Gnash", 1);
		System.out.println(Kobold.toString());
        
        Monster myMonster = new Monster();
        myMonster.setType("Cyclops");
        myMonster.setName("Bob");
        myMonster.setLevel(6);
        myMonster.setSize(9);
        myMonster.setStrength(myMonster.calcSTR());
        myMonster.setHitPoints(myMonster.calcHP());
        System.out.println(myMonster.toString());
        
        
    }
    
}
