/*
 * This java program gives the total amount of winning and loose
 */

package gambler;
/**
 * 
 * @author Kaif
 *
 */

public class GamblerGame4 {
	
	/**
	 * This is main function of program and starting point of program
	 * @param args
	 */

	public static void main(String[] args) {

		/*
		 * To start game with 100$ toatal amount and 1$ at stake
		 */

		int totalAmount = 100;

		int betAmount = 1, lowLimit = 10, highLimit = 100, lostAmount = 0, winAmount = 0;

		/*
		 * To put the stake on game and start the game
		 */

		/*
		 * To play the game for 20 days in month.
		 */

		for (int day = 1; day < 21; day++) {

			while (winAmount <= 100 && totalAmount >= 10) {

				int result = (int) Math.floor(Math.random() * 2);

				if (result == 1) {
					totalAmount += betAmount;
					winAmount++;
				} else {
					totalAmount -= betAmount;
					lostAmount++;
				}
			}
			/*
			 * As mentioned in problem either win or loose 50% stake will resign after game
			 */
			totalAmount = totalAmount / 2;
		}
		System.out.println("Total winning amount in month " + winAmount);
		System.out.println("Total lost amount in month " + lostAmount);
	}
}
