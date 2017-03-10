/* Version History  :
 TestClass  : ThrowAttack
 Author     : Karthick
              Hung Le
              Heli
              Janani
 Description: Test cases to test getter and setter methods for accesing the shared variables
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    20-Feb-2017     Hung Le, Heli,                     1. Attack strategy for Animation throwdown
                           Janani, Karthick
 -- 2.0    7-march-2017    Hung Le, Heli,	                  2. saving points automatically using map data strcuture extended save option here
                           Janani, Karthick      
 --===========================================================================================================================
 --============================================================================================================================*/

package Strategy;

import java.util.HashMap;
import java.util.Map;

import Card.Card;
import Card.ThrowCard;

public class ThrowAttack implements StrategyInterface {

	public int range = 5;
	public static Map<String, Integer> pointMap = new HashMap<String, Integer>();
	public static String winner = "";

	public ThrowAttack() {
	}

	@Override
	public int performStrategy(Card in, String target) {
		// TODO Auto-generated method stub

		ThrowCard tc = (ThrowCard) in;

		int random = (int) ((Math.random() * 100) % range);

		int target_health = 0;

		String s[][] = null;
		String s1[][] = null;
		int tmp_select = 0;
		int tmp1_select = 0;
		/**
		 * if player is CPU this will happen
		 */
		if (target == "cpu") {
			tmp_select = tc.getSelectedchoice();
			tmp1_select = tc.getCPUselectedchoice();
			s = tc.getPlayerdeck();
			s1 = tc.getCpudeck();

			target_health = tc.getCpuhealth();

			/**
			 * if player is Player this will happen
			 */

		} else if (target == "player") {
			tmp_select = tc.getCPUselectedchoice();
			tmp1_select = tc.getSelectedchoice();
			s = tc.getCpudeck();
			s1 = tc.getPlayerdeck();

			target_health = tc.getPlayerhealth();

		}
		/**
		 * selecting the card form the deck
		 */
		System.out.println(("Type of card can attack in this turn is " + tc.deck[random]));
		if (s[tmp_select - 1][0].equals(tc.deck[random]))

		/**
		 * if player has more hammer than CPU's life player card damage the
		 * cpu's card otherwise fail to do.
		 */
		{

			int damage = Integer.parseInt(s[tmp_select - 1][1]) - Integer.parseInt(s1[tmp1_select - 1][2]);
			if (damage > 0) {
				System.out.println("Reducing the opponent's life " + damage + " points");
				target_health -= damage;
				pointMap.put("Damage", target_health);

			} else
				System.out.println("Your damage is too low.");
		} else
			System.out.println("Fail to attack");

		/**
		 * saving the cpu and player's health
		 */

		if (target == "cpu")
			tc.setCpuhealth(target_health);
		else if (target == "player")
			tc.setPlayerhealth(target_health);

		System.out.println("CPU Health-->" + tc.getCpuhealth() + "  Player Health-->" + tc.getPlayerhealth());

		return 0;
	}

}
