import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class GameSetup {
	

	String[] wordBank = {"zephyr", "business", "everlasting",
			"apparatus", "consume", "flinch",
			"calibrate", "blooper", "disrupt",
			"nebula", "jinx", "jazz",
			"capturing", "muzzle", "parachute"};
	
	Random randomGenerator = new Random();
	int wordNum = randomGenerator.nextInt(15);
	
	String chosenWord = wordBank[wordNum];
	int chosenWordLength = chosenWord.length();
	
	String[] word = chosenWord.split("");
	boolean[] right = new boolean[12];
	boolean[] chosenLetters = new boolean[29];
	String[] letters = "abcdefghijklmnopqrstuvwxyz".split("");
	
	int rightLetters;
	int life;
	
	
	public void SetArray(){
		
		Arrays.fill(right, false);
		Arrays.fill(chosenLetters, false);
		
	}
	
	
	@SuppressWarnings("resource")
	public void chooseLetter(){
		
		boolean chosen = false;
		boolean actualLetter = false;
		String inputs = "a";
		boolean correct = false;
		Scanner letterChosen = new Scanner(System.in);
		
		while (chosen == false || actualLetter == false){
			chosen = false;
			actualLetter = false;
			System.out.print("Enter a letter: ");
			inputs = letterChosen.next();
			for (int i = 0; i < 26; i++)
			{
				if (inputs.equalsIgnoreCase(letters[i]))
				{
					actualLetter = true;
					if (chosenLetters[i] == false)
					{
						chosen = true;
						chosenLetters[i] = true;
					}
					else
					{
						System.out.println("Your letter has already been chosen. Please enter another one.");
					}
				}
			}
			if (actualLetter == false){
				System.out.println("Your input is not a lowercase letter. Please try again.");
			}
			
		}
		
		
		for (int i = 0; i < chosenWordLength; i++){
			
			if (inputs.equals(word[i])){
				right[i] = true;
				correct = true;
				rightLetters++;
			}
		}
		
		if (correct == false){
			life--;
		}
		for (int i = 0; i < 26; i++){
			if (inputs.equals(letters[i])){
				chosenLetters[i] = true;
			}
		}
		
	}
	
	
	public void printHangman(int life){
		
		if (life == 10){
			System.out.println("       __________"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n   ____|______");
		}
		if (life == 9){
			System.out.println("       __________"
					+ "       \n       |        |"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n   ____|______");
		}
		if (life == 8){
			System.out.println("       __________"
					+ "       \n       |        |"
					+ "       \n       |        O"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n   ____|______");
		}
		if (life == 7){
			System.out.println("       __________"
					+ "       \n       |        |"
					+ "       \n       |       _O"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n   ____|______");
		}
		if (life == 6){
			System.out.println("       __________"
					+ "       \n       |        |"
					+ "       \n       |       _O_"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n   ____|______");
		}
		if (life == 5){
			System.out.println("       __________"
					+ "       \n       |        |"
					+ "       \n       |       _O_"
					+ "       \n       |       	|"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n   ____|______");
		}
		if (life == 4){
			System.out.println("       __________"
					+ "       \n       |        |"
					+ "       \n       |       _O_"
					+ "       \n       |      / |"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n   ____|______");
		}
		if (life == 3){
			System.out.println("       __________"
					+ "       \n       |        |"
					+ "       \n       |       _O_"
					+ "       \n       |      / | \\"
					+ "       \n       |"
					+ "       \n       |"
					+ "       \n   ____|______");
		}
		if (life == 2){
			System.out.println("       __________"
					+ "       \n       |        |"
					+ "       \n       |       _O_"
					+ "       \n       |      / | \\"
					+ "       \n       |        |"
					+ "       \n       |"
					+ "       \n   ____|______");
		}
		if (life == 2){
			System.out.println("       __________"
					+ "       \n       |        |"
					+ "       \n       |       _O_"
					+ "       \n       |      / | \\"
					+ "       \n       |        |"
					+ "       \n       |       /"
					+ "       \n   ____|______");
		}
	
	}
	
	
	public void printChosen(int rightLetters){
		
		int left = chosenWordLength - rightLetters;
		int count = 0;
		System.out.println("There are " + left + " letters left.");
		System.out.print("Already chosen: ");
		
		for (int i = 0; i < 26; i++){
			if (chosenLetters[i] == true){
				count++;
				System.out.print(letters[i] + " ");
			}
		}
		
		if (count == 0){
			System.out.print("Nothing yet!");
		}
		
		System.out.println("");
		
	}
	
	
	public void printLetters (){
		
		for (int i = 0; i < chosenWordLength; i++){
			if (right[i] == true){
				System.out.print(word[i] + " ");
			}else{
				System.out.print("_ ");
			}
		}
		System.out.println("");
		
	}
	

	public void printLives(int life){
		
		if (life != 1){
			System.out.println("You have " + life + " lives left.");
		}else{
			System.out.println("You have 1 life left.");
		}
		
	}
	
	
	public void endScreen(){
		
		if (life == 0){
			System.out.println("Game Over!");
			System.out.print("The word was: " + chosenWord);
		}else{
			System.out.println(word);
			System.out.print("Congratulations! You have guessed the word!");
		}
	}
	
}
