import java.util.Scanner;

public class GamePlay {
	
	static Player[] player = new Player[2];
	
	static Scanner holder = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		playerSetup();
		
		while (player[0].shipsLeft != 0 && player[1].shipsLeft != 0)
		{
			for (int t = 0; t < 2; t++)
			{
				System.out.println("Player: " + player[t].name);
				player[1 - t].printOffenseGrid();	//TODO separate between players not working
				System.out.println("_______________________________________\n");
				player[t].printDefenseGrid();
				System.out.println("_______________________________________\n");
				player[1 - t].printDefenseGrid();
				fireMissile(t);
			}
		}
	}
	
	
	// Players give names and setup ship positions
	public static void playerSetup() {
		for (int p = 0; p <= 1; p++)
		{
			// Set player name
			player[p] = new Player(p);
		}
	}
	
	
	public static void fireMissile(int turn) {
		System.out.println("Enter shot:");
		
		System.out.print("X: ");
		int targetY = holder.nextInt() - 1;
		
		System.out.print("Y: ");
		int targetX = holder.nextInt() - 1;
		
		int opponentDefense = player[1 - turn].defenseGrid[targetX][targetY];
		
		if (opponentDefense == 1 | opponentDefense == 2 | opponentDefense == 3 | 
				opponentDefense == 4 | opponentDefense == 5)
		{
			System.out.println("Hit!");
			player[turn].offenseGrid[targetX][targetY] = 9;
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			
			player[1 - turn].ships[opponentDefense - 1].shipSpaces--;
		} else {
			System.out.println("Miss.");
			player[turn].offenseGrid[targetX][targetY] = 8;
		}			
	}
}
