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

/**
 * Creating a interface for other classes(ThrowPlayer and DoyuPlayer) to implement the beginBattle method.
 */
public interface Player {
	public int beginBattle(String strategy);
}
