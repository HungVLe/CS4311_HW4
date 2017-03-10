/* Version History  :
 Class      : Factory
 Author     : Karthick
              Hung Le
              Heli
              Janani
 Description: Factory that returns the object of the selected class
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    05-Feb-2017     Karthick, Hung Le,                                  1. Factory class that implements Factory pattern
                           Janani, Heli
 --===========================================================================================================================
 --============================================================================================================================*/

package Player;
import Strategy.DoyuAttack;
import Strategy.DoyuDefend;
import Strategy.StrategyInterface;
import Strategy.ThrowAttack;

/**
 * Factory method generates objects based on the type of Strategy.
 */
public class Factory {
    public static StrategyInterface creatStrategy(String type){
        if(type=="Attack"){
        return new DoyuAttack(); 
        }
        else if(type=="Defend"){
            return new DoyuDefend();
        }
        else if (type == "Throw")
        	return new ThrowAttack();
        return null;
    }

}
