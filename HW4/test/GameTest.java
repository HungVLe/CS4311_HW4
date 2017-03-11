/* Version History  :
 TestClass  : GameTest
 Author     : Karthick
              Hung Lee
              Heli
              Janani
 Description: Test cases to test the return values of player's health after applying card effects 
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    20-Feb-2017     Hung Lee, Heli,                     1. Created test cases to test the return values of player's  effects   
                           Janani, Karthick						  health after applying card
 --===========================================================================================================================

 --============================================================================================================================*/

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import Card.DoyuCard;
import Card.ThrowCard;
import Player.DoyuPlayer;
import Player.Player;
import Player.ThrowPlayer;
import Strategy.DoyuAttack;
import Strategy.ThrowAttack;

public class GameTest {

	Player p1;
	Player p2;

	DoyuPlayer dp;
	ThrowPlayer tp;

	DoyuCard dc;
	ThrowCard tc;

	DoyuAttack da;
	ThrowAttack ta;

	@Before
	public void setUp() throws Exception {
		p1 = new DoyuPlayer(1);
		p2 = new ThrowPlayer();

		dp = (DoyuPlayer) p1;
		tp = (ThrowPlayer) p2;

		dc = new DoyuCard();
		tc = new ThrowCard();

		da = new DoyuAttack();
		ta = new ThrowAttack();


	}

	@Test
	public void testDoyu() {
		String deck[][] = new String[1][2];
		deck[0] = new String[] { "Damage", "100" };
		dc.setPlayerdeck(deck);
		
		dp.setDc(dc);
		
		dc.setSelectedchoice(1);
		da.performStrategy(dc,"cpu");
		
		System.out.println("Doyu cpu's health: " +dc.getCpuhealth());
		assertTrue(dc.getCpuhealth() == 0);
	}

	@Test

	public void testThrow() {
		String deck[][] = new String[1][3];
		deck[0] = new String[] { "Alchohol", "100", "100" };
		tc.setPlayerdeck(deck);

		String cpudeck[][] = new String[1][3];
		cpudeck[0] = new String[] { "Restaurant", "0", "0" };
		tc.setCpudeck(cpudeck);
		
		tp.setTc(tc);
		
		ta.range = 1;
		tc.setSelectedchoice(1);
		tc.setCPUselectedchoice(1);
		ta.performStrategy(tc,"cpu");
		
		System.out.println("Throw cpu's health: " + tc.getCpuhealth());
		assertTrue(tc.getCpuhealth() == 0);
	}

}
