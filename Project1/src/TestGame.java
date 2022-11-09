import java.util.Scanner;

public class TestGame {

	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		String character;
		
		System.out.print("[1]Mage\n[2]Hunter\n[3]Warrior\nSelect your character: ");
		int chara = input.nextInt();
		
		System.out.print("Enter character name: ");
		String charName = input.next();
		
		if(chara == 1)
			character = "Mage";
		else if (chara == 2)
			character = "Hunter";
		else
			character = "Warrior";
		
		System.out.println("\n\n**********************\n" + "Welcome " + charName + " the " + character + "\n**********************");
		
		
		input.close();
		
	}
}
