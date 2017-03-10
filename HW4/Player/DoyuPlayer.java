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
 -- 2.0    7-march-2017    Hung Le, Heli,	                   2. saving points automatically using map data strcuture extended
                           Janani, Karthick                       save option here
 --===========================================================================================================================
 --============================================================================================================================*/

package Player;

import java.util.Map;
import java.util.Scanner;

import Card.DoyuCard;
import Move.DoyuMoves;
import Strategy.DoyuAttack;
import Strategy.StrategyInterface;

public class DoyuPlayer implements Player {

	Scanner sc = new Scanner(System.in);
	StrategyInterface defend;
	StrategyInterface attack;
	DoyuMoves dm;
	DoyuCard dc;
	String mode;
	int hold = 5, saveIndex = 0;
	boolean saved = false;

	public DoyuPlayer(int campaign_choice) {

		defend = Factory.creatStrategy("Defend");
		attack = Factory.creatStrategy("Attack");
		dm = new DoyuMoves(campaign_choice);
		dc = new DoyuCard();
		dm.generateCPUDeck(dc);
		dm.generatePlayerDeck(dc);
	}

	/**
	 * Battle starts between the player and the CPU for doyuAttack and
	 * DoyuDefend.
	 */
	@Override
	public int beginBattle(String strategy) {

		int hand = hold;
		int state;

		int i = saveIndex;

		if (!saved)
			mode = strategy;

		System.out.println(saveIndex);

		if (mode == "Attack") {

			for (; i < 30; i++) {
				System.out.println("\n" + ".........PLAYER's ATTACK TURN........");
				state = playerTurn(dc, i, hand);
				if (state == -1) {
					saveIndex = i;
					hold = hand;
					saved = true;
					return 1;
				} else if (state == 1)
					break;

				hand++;

				System.out.println(".........OPPONENT's DEFEND TURN........");
				if (cpuTurn(dc, i) == 1)
					break;
			}
		} else if (mode == "Defend") {
			for (; i < 30; i++) {
				System.out.println("\n" + ".........OPPONENT's ATTACK TURN........");
				if (cpuTurn(dc, i) == 1)
					break;

				System.out.println("\n" + ".........PLAYER's DEFEND TURN........");
				state = playerTurn(dc, i, hand);
				if (state == -1) {
					saveIndex = i;
					hold = hand;
					saved = true;
					return 1;
				} else if (state == 1)
					break;

				hand++;
			}
		}

		System.out.println("Point Record:");
		for (Map.Entry<String, Integer> pair : DoyuAttack.pointMap.entrySet()) {
			System.out.println("Player : " + pair.getKey() + " Points : " + pair.getValue());
		}

		return 0;
	}

	/**
	 * Player could select an option from the given set of cards.
	 */
	public int playerTurn(DoyuCard dc, int i, int hand) {
		int choice, state = 0;
		System.out.println("Select the card listed below to Attack..");
		for (int j = 0; j < 5; j++) {
			System.out.print(j + 1 + ")");
			System.out.print(dc.playerdeck[j][0] + " " + dc.playerdeck[j][1]);
			System.out.print("   ");
		}

		System.out.println("\nPress 0 to save game");
		choice = sc.nextInt();

		if (choice > 5 || choice < 0) {
			System.out.println("Quitting battle");
			return 1;
		} else if (choice == 0) {
			System.out.println("Saving battle");
			return -1;
		}

		dc.setSelectedchoice(choice);
		attack.performStrategy(dc, "cpu"); // Attacking CPU
		state = defend.performStrategy(dc, "cpu"); // CPU defending

		if (hand < 29) {
			dc.playerdeck[choice - 1][0] = dc.playerdeck[hand + 1][0];
			dc.playerdeck[choice - 1][1] = dc.playerdeck[hand + 1][1];
		}

		return state;
	}

	/**
	 * CPU would attack or defend the player.
	 */
	public int cpuTurn(DoyuCard dc, int i) {

		String s[][] = dc.getCpudeck();
		System.out.println("Opponent battles with  " + s[i][0] + " " + s[i][1]);
		dc.setCPUselectedchoice(i + 1);
		attack.performStrategy(dc, "player"); // Attacking player
		return defend.performStrategy(dc, "player"); // player defending
	}

	/**
	 * @return the defend
	 */
	public StrategyInterface getDefend() {
		return defend;
	}

	/**
	 * @return the attack
	 */
	public StrategyInterface getAttack() {
		return attack;
	}

	/**
	 * @return the dm
	 */
	public DoyuMoves getDm() {
		return dm;
	}

	/**
	 * @return the dc
	 */
	public DoyuCard getDc() {
		return dc;
	}

	/**
	 * @param defend
	 *            the defend to set
	 */
	public void setDefend(StrategyInterface defend) {
		this.defend = defend;
	}

	/**
	 * @param attack
	 *            the attack to set
	 */
	public void setAttack(StrategyInterface attack) {
		this.attack = attack;
	}

	/**
	 * @param dm
	 *            the dm to set
	 */
	public void setDm(DoyuMoves dm) {
		this.dm = dm;
	}

	/**
	 * @param dc
	 *            the dc to set
	 */
	public void setDc(DoyuCard dc) {
		this.dc = dc;
	}

}
