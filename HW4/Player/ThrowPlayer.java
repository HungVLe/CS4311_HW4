/* Version History  :
 Class      : DoyuPlayer
 Author     : Karthick
 Hung Le
 Heli
 Janani
 Description: Creates a game between the player and CPU.
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description
 --===========================================================================================================================
 -- 1.0    20-Feb-2017     Hung Lee, Heli,                     1. Created player package which would initiate the battle
                           Janani, Karthick						  between the player and the CPU.
 --===========================================================================================================================
 --============================================================================================================================*/

package Player;

import java.util.Scanner;

import Card.ThrowCard;
import Move.ThrowMoves;
import Strategy.StrategyInterface;

public class ThrowPlayer implements Player {

	Scanner sc = new Scanner(System.in);
	StrategyInterface throwAttack;
	ThrowMoves tm;
	ThrowCard tc;
	String mode;
	int hold = 5, saveIndex = 0;

	public ThrowPlayer() {

		throwAttack = Factory.creatStrategy("Throw");
		tm = new ThrowMoves();
		tc = new ThrowCard();
		tm.generateCPUDeck(tc);
		tm.generatePlayerDeck(tc);
	}

    /**
     * Battle starts between the player and the CPU for Card Animation game.
     */
	@Override
	public int beginBattle(String strategy) {
		// TODO Auto-generated method stub
		int choice;
		int hand = hold;

		int i = saveIndex;
		String s[][] = tc.getCpudeck();

		System.out.println("Ready to Battle...");
		System.out.println("You and CPU will take turn to attack");

		for (; i < 24; i++) {
			System.out.println("Select the card listed below ...");

			for (int j = 0; j < 5; j++) {
				System.out.print(j + 1 + ")");
				for (int k = 0; k < 3; k++) {
					System.out.print(tc.getPlayerdeck()[j][k] + " ");
				}
				System.out.print("   ");
			}
			System.out.println("\nPress 0 to save game");

			choice = sc.nextInt();

			if (choice > 5 || choice < 0) {
				System.out.println("Quitting battle");
				break;
			} else if (choice == 0) {
				System.out.println("Saving battle");
				saveIndex = i;
				hold = hand;
				return 1;
			}

			tc.setSelectedchoice(choice);
			tc.setCPUselectedchoice(i + 1);

			System.out.println("Opponent battles with  " + s[i][0] + " " + s[i][1] + " " + s[i][2]);

			if ((i % 2) == 0) {
				throwAttack.performStrategy(tc, "cpu");

				if (tc.getCpuhealth() <= 0) {
					System.out.println("CONGRATS..GAME OVER...YOU WON!!!");
					break;
				}
				System.out.println("CPU attacks next, chose card to defend\n");
			} else if ((i % 2) == 1) {

				throwAttack.performStrategy(tc, "player");

				if (tc.getPlayerhealth() <= 0) {
					System.out.println("HaHa!! YOU ARE DEAD..BETTER LUCK NEXT TIME!!!");
					break;
				}
				System.out.println("Your turn to attack\n");
			}

			if (hand < 24) {
				tc.playerdeck[choice - 1][0] = tc.playerdeck[hand + 1][0];
				tc.playerdeck[choice - 1][1] = tc.playerdeck[hand + 1][1];
				tc.playerdeck[choice - 1][2] = tc.playerdeck[hand + 1][2];
			}
			hand++;

		}

		System.out.println("Sorry!!We ran out of battle card");
		if (tc.getCpuhealth() > tc.getPlayerhealth()) {
			System.out.println("HaHa!! YOU ARE DEAD..BETTER LUCK NEXT TIME!!!");
		} else {
			System.out.println("CONGRATS..GAME OVER...YOU WON!!!");
		}

		System.out.println();

		return 0;
	}

	/**
	 * @return the throwAttack
	 */
	public StrategyInterface getThrowAttack() {
		return throwAttack;
	}

	/**
	 * @return the tm
	 */
	public ThrowMoves getTm() {
		return tm;
	}

	/**
	 * @return the tc
	 */
	public ThrowCard getTc() {
		return tc;
	}

	/**
	 * @param throwAttack the throwAttack to set
	 */
	public void setThrowAttack(StrategyInterface throwAttack) {
		this.throwAttack = throwAttack;
	}

	/**
	 * @param tm the tm to set
	 */
	public void setTm(ThrowMoves tm) {
		this.tm = tm;
	}

	/**
	 * @param tc the tc to set
	 */
	public void setTc(ThrowCard tc) {
		this.tc = tc;
	}

	
}
