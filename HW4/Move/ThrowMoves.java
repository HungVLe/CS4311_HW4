/* Version History  :
 TestClass  : ThrowMoves
 Author     : Karthick
              Hung Le
              Heli
              Janani
 Description: Test cases to test getter and setter methods for accesing the shared variables
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    19-Feb-2017     Hung Le, Heli,                     1. Generates the deck for animation throwdown
                           Janani, Karthick
 --===========================================================================================================================
 --============================================================================================================================*/
package Move;

import Card.Card;

public class ThrowMoves extends Move {

	public ThrowMoves() {
		deck = new String[] { "Alchohol", "Blugerees", "Sport", "Music", "Restaurant" };

		playerdeck = new String[25][3];
		cpudeck = new String[25][3];
	}

	@Override
	public void generateCPUDeck(Card tc) {
		for (i = 0; i < 25; i++) {

			random = (int) ((Math.random() * 100) % deck.length);
			tmp_random = (x = (int) ((Math.random() * 100) % 2) * 4) > 0 ? x : 2;
			tmp1_random = (x = (int) ((Math.random() * 100) % 3) * 5) > 0 ? x : 3;
			cpudeck[i][0] = deck[random];
			cpudeck[i][1] = Integer.toString(tmp_random);
			cpudeck[i][2] = Integer.toString(tmp1_random);
		}
		tc.setCpudeck(cpudeck);
	}

	@Override
	public void generatePlayerDeck(Card tc) {
		for (i = 0; i < 25; i++) {
			random = (int) ((Math.random() * 100) % deck.length);
			tmp_random = (x = (int) ((Math.random() * 100) % 4) * 4) > 0 ? x : 2;
			tmp1_random = (x = (int) ((Math.random() * 100) % 4) * 5) > 0 ? x : 3;
			playerdeck[i][0] = deck[random];
			playerdeck[i][1] = Integer.toString(tmp_random); // as hammer
			playerdeck[i][2] = Integer.toString(tmp1_random); // as life
		}
		tc.setPlayerdeck(playerdeck);
	}

}