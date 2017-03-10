/* Version History  :
 Class   : Game
 Author     : Karthick
              Hung Le
              Heli
              Janani
 Description: Program provides an interface for Card classes
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    20-Feb-2017     Hung Le, Heli,                     2. Design a Card interface it let the game close to modification 
                           Janani, Karthick						but open for extension.
 --===========================================================================================================================
 --============================================================================================================================*/


package Card;



public interface Card {
	public String[][] getPlayerdeck();

	public void setPlayerdeck(String[][] playerdeck);

	public String[][] getCpudeck();

	public void setCpudeck(String[][] cpudeck);
}
