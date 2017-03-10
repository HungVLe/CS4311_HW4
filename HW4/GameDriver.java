import Game.Game;
import Game.ProxyGame;

/* Version History  :
 Class   : GameDriver
 Author     : Karthick
              Hung Le
              Heli
              Janani
 Description: The test/run driver of the program 
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    20-Feb-2017     Hung Le                     1. Main driver of the program
 --===========================================================================================================================
 --============================================================================================================================*/

public class GameDriver {

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here

		Game game = null;
		ProxyGame proxy = new ProxyGame (game);
		proxy.option();
	}

}
