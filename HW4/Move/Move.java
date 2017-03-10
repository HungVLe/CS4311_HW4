/* Version History  :
 Class   : Game
 Author     : Karthick
              Hung Le
              Heli
              Janani
 Description: Program provides an interface for Move classes
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    20-Feb-2017     Hung Le, Heli,                     2. Design a Move interface it let the game close to modification 
                           Janani, Karthick						but open for extension.
 --===========================================================================================================================
 --============================================================================================================================*/

package Move;

import Card.Card;

public abstract class Move {
	
	public String deck[];
	int i, j, random, tmp_random, x, tmp1_random;
	public String playerdeck[][];
	public String cpudeck[][];

   

	public abstract void generateCPUDeck(Card dc);

	public abstract void generatePlayerDeck(Card dc);
}
