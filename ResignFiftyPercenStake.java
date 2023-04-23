/*
 * This java program stimulate the gambling game and resign  50% of stake after game.
 */
package gambler;

/**
 * 
 * @author Kaif
 *
 */

public class ResignFiftyPercenStake {

	/**
	 * This is main function of program and starting point of program
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/*
		 * To start game with 100$ toatal amount and 1$ at stake
		 */

		int totalAmount = 100;

		int betAmount = 1, lowLimit = 10, highLimit = 100, winAmount = 0;

		/*
		 * To put the stake on game and start the game
		 */

		/*
		 * To play gambling game till upper limit or lower limit of player
		 */

		while (winAmount <= 100 && totalAmount >= 10) {

			int result = (int) Math.floor(Math.random() * 2);

			if (result == 1) {
				totalAmount += betAmount;
				winAmount++;
			} else {
				totalAmount -= betAmount;
			}
		}

		/*
		 * As mentioned in problem either win or loose 50% stake will resign after game
		 */

		totalAmount = totalAmount / 2;
		System.out.println("Amount resigned " + totalAmount);
	}
}
