/*
 *This java program report the number of days where gambler winning and also loosing. 
 */
package gambler;

public class WinorLooseDay {

	public static void main(String[] args) {
		/*
		 * To start game with 100$ toatal amount and 1$ at stake
		 */

		int totalAmount = 100;

		int betAmount = 1, lowLimit = 10, highLimit = 100, winDay = 0, looseDay = 0;

		/*
		 * To put the stake on game and start the game
		 */

		/*
		 * To play the game for 20 days in month.
		 */

		for (int day = 1; day < 21; day++) {

			int lostAmount = 0, winAmount = 0;

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
			if (winAmount > lostAmount) {
				winDay++;
			} else {
				looseDay++;
			}
		}
		System.out.println("Winnig days in month " + winDay);
		System.out.println("Loosing days in month " + looseDay);
	}
}
