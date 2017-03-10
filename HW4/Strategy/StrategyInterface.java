/* Version History  :
 Inteface   : StrategyInterface
 Author     : Karthick
              Hung Le
              Heli
              Janani
 Description: Interface that generates the deck for player and opponent
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    19-Jan-2017     Karthick                            1. Interface to offer specific feature to certain class  
 -- 2.0    05-Feb-2017     Hung Le, Heli,                      2. Fixed the interface pattern and added few new methods
                           Janani, Karthick
 -- 3.0    20-Feb-2017 	   Hung Le, Heli,	                   3. Fixed the interface pattern and added few new methods
                           Janani, Karthick										   
 --===========================================================================================================================
 --============================================================================================================================*/

package Strategy;
import Card.Card;

public interface StrategyInterface {

	public int performStrategy(Card in, String target);
}
