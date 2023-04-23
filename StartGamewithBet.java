package gambler;

/**
 * 
 * @author Kaif
 *
 */

public class StartGamewithBet {

	/**
	 * This is the starting point of program and main function
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/*
		 * To start game with 100$ toatal amount and 1$ at stake
		 */

		int totalAmount = 100;

		int betAmount = 1;

		/*
		 * To put the stake on game and start the game
		 */

		int result = (int) Math.floor(Math.random() * 2);

		if (result == 1) {
			totalAmount += betAmount;
			System.out.println("Gambler won the game");
		} else {
			totalAmount -= betAmount;
			System.out.println("Gambler lost the game");
		}
	}
}
