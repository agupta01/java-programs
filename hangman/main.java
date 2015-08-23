public class hangman {

	public static void main(String[] args) {
		
		GameSetup game = new GameSetup();
		game.life = 10;
		game.rightLetters = 0;
		game.SetArray();
		
		while (game.life > 0 && game.rightLetters < game.chosenWordLength){
			game.printHangman(game.life);
			game.printChosen(game.rightLetters);
			game.printLives(game.life);
			game.printLetters();
			game.chooseLetter();
		}
			
			game.endScreen();
			
	}

}
