/* Version History  :
 Inteface   : DoyuAttack
 Author     : Karthick
              Hung Le
              Heli
              Janani
 Description: Actions for all the battle attack cards are described and the running total gets computed
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    19-Jan-2017     Karthick                            1. Actions for all the battle cards are described and the running total gets computed
 -- 2.0    05-Feb-2017     Hung Le, Heli,                      2. Splitted attack and defend strategy into separate class
                           Janani, Karthick              
 -- 3.0    20-Feb-2017 	   Hung Le, Heli,	                   3. saving all the points and health for cpu and player 
                           Janani, Karthick                       and All the Attack operation performed here as depending on card
 -- 4.0    7-march-2017    Hung Le, Heli,	                   4. saving points automatically using map data strcuture extended save option here
                           Janani, Karthick                       
                          
 --===========================================================================================================================
 --============================================================================================================================*/

package Strategy;

import java.util.HashMap;
import java.util.Map;

import Card.Card;
import Card.DoyuCard;

public class DoyuAttack implements StrategyInterface {

	public DoyuAttack() {
	}

	public static Map<String, Integer> pointMap = new HashMap<String, Integer>();
	public static String winner = "";

	@Override
	public int performStrategy(Card in, String target) {

		DoyuCard dc = (DoyuCard) in;

		int health = 0, attack_pt = 0, defend_pt = 0, regeneration_pt = 0, karma_pt = 0, poison_pt = 0, counter_pt = 0,
				sp_attack_pt = 0, sp_defend_pt = 0;

		int target_health = 0, target_attack_pt = 0, target_defend_pt = 0, target_regeneration_pt = 0,
				target_karma_pt = 0, target_poison_pt = 0, target_counter_pt = 0;

		String s[][] = null;
		int tmp_select = 0;

		if (target == "cpu") {
			tmp_select = dc.getSelectedchoice();
			s = dc.getPlayerdeck();

			health = dc.getPlayerhealth();
			attack_pt = dc.player_attack_pt;
			defend_pt = dc.player_defend_pt;
			regeneration_pt = dc.player_regeneration_pt;
			karma_pt = dc.player_karma_pt;
			poison_pt = dc.player_poison_pt;
			counter_pt = dc.player_counter_pt;
			sp_attack_pt = dc.player_SpecialAttack_pt;
			sp_defend_pt = dc.player_SpecialDefend_pt;

			target_health = dc.getCpuhealth();
			target_attack_pt = dc.cpu_attack_pt;
			target_defend_pt = dc.cpu_defend_pt;
			target_regeneration_pt = dc.cpu_regeneration_pt;
			target_karma_pt = dc.cpu_karma_pt;
			target_poison_pt = dc.cpu_poison_pt;
			target_counter_pt = dc.cpu_counter_pt;

		} else if (target == "player") {
			tmp_select = dc.getCPUselectedchoice();
			s = dc.getCpudeck();

			health = dc.getCpuhealth();
			attack_pt = dc.cpu_attack_pt;
			defend_pt = dc.cpu_defend_pt;
			regeneration_pt = dc.cpu_regeneration_pt;
			karma_pt = dc.cpu_karma_pt;
			poison_pt = dc.cpu_poison_pt;
			counter_pt = dc.cpu_counter_pt;
			sp_attack_pt = dc.cpu_SpecialAttack_pt;
			sp_defend_pt = dc.cpu_SpecialDefend_pt;

			target_health = dc.getPlayerhealth();
			target_attack_pt = dc.player_attack_pt;
			target_defend_pt = dc.player_defend_pt;
			target_regeneration_pt = dc.player_regeneration_pt;
			target_karma_pt = dc.player_karma_pt;
			target_poison_pt = dc.player_poison_pt;
			target_counter_pt = dc.player_counter_pt;

		}
		/**
		 * When throwing drain card, points will be drain by either cpu or
		 * player
		 */

		if (s[tmp_select - 1][0] == "Drain") {
			System.out.println("Draining the opponent by " + Integer.parseInt(s[tmp_select - 1][1]) + " points");
			target_health -= Integer.parseInt(s[tmp_select - 1][1]);
			health += Integer.parseInt(s[tmp_select - 1][1]);
			pointMap.put("Player-Drain", target_health);
			pointMap.put("Computer-Drain", health);

			/**
			 * When throwing Attack card, increasing the attack level
			 */

		} else if (s[tmp_select - 1][0] == "Attack") {
			attack_pt = Integer.parseInt(s[tmp_select - 1][1]);
			System.out.println("Increasing the attack level by " + attack_pt + " points in next one Attack");

			pointMap.put("Computer-Attack", attack_pt);

			/**
			 * When throwing DEfence card, Decreasing the attack level of
			 * opponent
			 */

		} else if (s[tmp_select - 1][0] == "Defense") {
			defend_pt = Integer.parseInt(s[tmp_select - 1][1]);
			System.out
					.println("Decreases the attack level of opponent by " + defend_pt + " points for next one Attack");
			pointMap.put("Computer-Attack", defend_pt);

			/**
			 * When throwing Heal card, either player or cpu will heal by points
			 */

		} else if (s[tmp_select - 1][0] == "Heal") {
			health += Integer.parseInt(s[tmp_select - 1][1]);
			System.out.println("Healing by " + Integer.parseInt(s[tmp_select - 1][1]) + " points");
			// pointMap.put("Player1-Drain",target_health );
			pointMap.put("Computer-Heal", health);

			/**
			 * When throwing damage card, damaging the opponent
			 */

		} else if (s[tmp_select - 1][0] == "Damage") {
			target_health -= (Integer.parseInt(s[tmp_select - 1][1]) + attack_pt + sp_attack_pt);
			System.out.println("Damaging the opponent by " + Integer.parseInt(s[tmp_select - 1][1]) + " points");
			pointMap.put("Player1-Damage", target_health);

			/**
			 * When throwing regeneration card, this will give the extra health
			 */

		} else if (s[tmp_select - 1][0] == "Regeneration") {
			regeneration_pt = Integer.parseInt(s[tmp_select - 1][1]);
			System.out.println("Regeneration card will give the extra health point every turn");
			System.out.println("Increasing the health points " + regeneration_pt);
			pointMap.put("Computer-Attack", regeneration_pt);

			/**
			 * When throwing Paralysis card, No affect will happen
			 */

		} else if (s[tmp_select - 1][0] == "Paralysis") {
			System.out.println("When you throw this card no any effect will happen");

			/**
			 * When throwing drainkarma card, drainig the opponent's karma point
			 */

		} else if (s[tmp_select - 1][0] == "Drainkarma") {
			if (karma_pt < 100) {
				karma_pt += Integer.parseInt(s[tmp_select - 1][1]);
				target_karma_pt -= Integer.parseInt(s[tmp_select - 1][1]);
				System.out.println("Draining the opponent by " + Integer.parseInt(s[tmp_select - 1][1]) + " points");
				pointMap.put("plaayer1-DrainKarma", target_attack_pt);
				pointMap.put("Computer-DrainKarma", attack_pt);

			} else {
				System.out.println("Generate new card");
				karma_pt -= (100 - Integer.parseInt(s[tmp_select - 1][1]));
				target_karma_pt -= Integer.parseInt(s[tmp_select - 1][1]);
				pointMap.put("plaayer1-DrainKarma", target_attack_pt);
				pointMap.put("Computer-DrainKarma", attack_pt);
			}

			/**
			 * When throwing Karma card, karma point will be incresed
			 */

		} else if (s[tmp_select - 1][0] == "Karma") {
			if (karma_pt < 100) {
				karma_pt += Integer.parseInt(s[tmp_select - 1][1]);
				System.out.println("Increase karma point");
				pointMap.put("Computer-karma", attack_pt);

			} else {
				System.out.println("Generate new card");
				karma_pt -= (100 - Integer.parseInt(s[tmp_select - 1][1]));
				pointMap.put("Computer-karma", attack_pt);

			}

			/**
			 * When throwing poision card, this will posion the opponent
			 */

		} else if (s[tmp_select - 1][0] == "Poison") {
			target_poison_pt = Integer.parseInt(s[tmp_select - 1][1]);
			System.out.println("Poisoning the opponent by" + Integer.parseInt(s[tmp_select - 1][1]) + " points");
			pointMap.put("player-poison", attack_pt);

			/**
			 * When throwing Curepoison card, thi will help to curing the poison
			 */

		} else if (s[tmp_select - 1][0] == "CurePoison") {
			poison_pt = 0;
			System.out.println("Curing the poison");

			/**
			 * When throwing counter card, this will apply counter attack
			 */

		} else if (s[tmp_select - 1][0] == "Counter") {
			counter_pt = Integer.parseInt(s[tmp_select - 1][1]);
			System.out.println("Apply counter attack level by " + counter_pt + " points");
			pointMap.put("Counter", counter_pt);

			/**
			 * When throwing SpecialAttack card, peremently increase the attack
			 * level
			 */

		} else if (s[tmp_select - 1][0] == "SpecialAttack") {
			sp_attack_pt = Integer.parseInt(s[tmp_select - 1][1]);
			System.out.println(
					"Increasing pernamently the attack level by " + sp_attack_pt + " points in next one Attack");
			pointMap.put("speciaL-Attack", sp_attack_pt);

			/**
			 * When throwing SpecialDefend card, peremently decrease the attack
			 * level
			 */

		} else if (s[tmp_select - 1][0] == "SpecialDefend") {
			sp_defend_pt = Integer.parseInt(s[tmp_select - 1][1]);
			System.out.println("Decreases pernamently the attack level of opponent by "
					+ Integer.parseInt(s[tmp_select - 1][1]) + " points for next one Attack");
			pointMap.put("SPECIAL-DEFEND", sp_defend_pt);

		} else if (s[tmp_select - 1][0] == "Dispell") {
			target_counter_pt = 0;
			target_attack_pt = 0;
			target_defend_pt = 0;
			target_regeneration_pt = 0;
			System.out.println("Erase all non-pernament positive effect of player");

		}

		if (target == "cpu") {

			dc.setPlayerhealth(health);
			dc.player_attack_pt = attack_pt;
			dc.player_defend_pt = defend_pt;
			dc.player_regeneration_pt = regeneration_pt;
			dc.player_karma_pt = karma_pt;
			dc.player_poison_pt = poison_pt;
			dc.player_counter_pt = counter_pt;
			dc.player_SpecialAttack_pt = sp_attack_pt;
			dc.player_SpecialDefend_pt = sp_defend_pt;

			dc.setCpuhealth(target_health);
			dc.cpu_attack_pt = target_attack_pt;
			dc.cpu_defend_pt = target_defend_pt;
			dc.cpu_regeneration_pt = target_regeneration_pt;
			dc.cpu_karma_pt = target_karma_pt;
			dc.cpu_poison_pt = target_poison_pt;
			dc.cpu_counter_pt = target_counter_pt;

		} else if (target == "player") {

			dc.setCpuhealth(health);
			dc.cpu_attack_pt = attack_pt;
			dc.cpu_defend_pt = defend_pt;
			dc.cpu_regeneration_pt = regeneration_pt;
			dc.cpu_karma_pt = karma_pt;
			dc.cpu_poison_pt = poison_pt;
			dc.cpu_counter_pt = counter_pt;
			dc.cpu_SpecialAttack_pt = sp_attack_pt;
			dc.cpu_SpecialDefend_pt = sp_defend_pt;

			dc.setPlayerhealth(target_health);
			dc.player_attack_pt = target_attack_pt;
			dc.player_defend_pt = target_defend_pt;
			dc.player_regeneration_pt = target_regeneration_pt;
			dc.player_karma_pt = target_karma_pt;
			dc.player_poison_pt = target_poison_pt;
			dc.player_counter_pt = target_counter_pt;

		}

		return 0;
	}
}
