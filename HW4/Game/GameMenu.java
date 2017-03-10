/* Version History  :
 Class   : GameMenu
 Author     : Karthick
              Hung Le
              Heli
              Janani
 Description: Program that provides options to user to either begin/quit battle. This game covers 16 battle cards features.
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    19-Jan-2017     Karthick                           1. Provides options to user to either  
 -- 2.0    05-Feb-2017     Hung Le, Heli,                     2. Added new options to user to choose between attack and defend
                           Janani, Karthick
 -- 3.0    20-Feb-2017     Hung Le                     		  3. Added new options to user to choose save and restore
 --===========================================================================================================================
 --============================================================================================================================*/

package Game;

import Player.DoyuPlayer;
import Player.Player;
import Player.ThrowPlayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class GameMenu implements Game {

	Scanner sc = new Scanner(System.in);
	List<Player> savedGame;
	boolean existSave = false;

	public GameMenu() {
		savedGame = new ArrayList<Player>();
	}

	@Override
	public int option() {

		Player player = null;
		int choice = 0;

		while (choice != 3) {
			if (existSave) {
				System.out.println("1 - New game  OR  2 - Continue?  OR  3 - Exit");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					run(player);
					break;
				case 2:
					player = restore();
					if (player.beginBattle("") == 1)
						save(player);
					break;
				case 3:
					System.out.println("Exiting from Game...");
					System.exit(0);
				default:
					System.out.println("Invalid option entered");
					option();
				}
			} else
				run(player);
		}
		return 0;
	}

	public void run(Player p) {
		int choice, strategy;
                
		System.out.println("Select the Game to play.. 1) DoyuBattle   2) Animation Throwdown  3) Quit");
		choice = sc.nextInt();
		if (choice == 1) {
			System.out.println("You chose DoyuBattle to play");
			System.out.println(
					"Please select the campaign in which you would like to play: 1)Asia   2)Africa   3)America   4) Australia");
			int campaign_choice = sc.nextInt();
			if (campaign_choice == 1)
				System.out.println("You have chosen Asia to play");
			else if (campaign_choice == 2)
				System.out.println("You have chosen Africa to play");
			else if (campaign_choice == 3)
				System.out.println("You have chosen America to play");
			else if (campaign_choice == 4)
				System.out.println("You have chosen Australia to play");
			System.out.println("Shall we begin/quit the battle(Enter the number): 1)Begin   2)Quit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Please select your Strategy: 1)Attack   2)Defend");
				strategy = sc.nextInt();
				if (strategy == 1) {
					System.out.println("You opted to  ATTACK in battle!!Get Ready");
					p = new DoyuPlayer(campaign_choice);
					if (p.beginBattle("Attack") == 1)
						save(p);
				} else if (strategy == 2) {
					System.out.println("You opted to DEFEND in battle!!Get Ready!!");
					p = new DoyuPlayer(campaign_choice);
					if (p.beginBattle("Defend") == 1)
						save(p);
				}
				break;
			case 2:
				System.out.println("Quitting battle");
				System.exit(0);
				break;
			default:
				System.out.println("Invalid option entered");
				run(p);
			}

		} else if (choice == 2) {
			System.out.println("You chose Animation throwdown to play");
			p = new ThrowPlayer();
			if (p.beginBattle("") == 1)
				save(p);
		} else if (choice == 3) {
			System.out.println("Exiting from Game...");
			System.exit(0);
		}

	}

	public void save(Player p) {
		savedGame.add((Player)p);
		existSave = true;
	}

	public Player restore() {
		existSave = false;
		return savedGame.remove(0);
	}
}
