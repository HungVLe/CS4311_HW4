/* Version History  :
 Inteface   : ThrowCard
 Author     : Karthick
              Hung Le
              Heli
              Janani
 Description: Class with getter and setter methods for accesing the shared variables
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    20-Feb-2017     Hung Le, Heli,                     1. Class with getter and setter methods for accesing the shared variables
                           Janani, Karthick                                              
 --===========================================================================================================================
 --============================================================================================================================*/

package Card;

import Move.ThrowMoves;

public class ThrowCard extends ThrowMoves implements Card{

	public int selectedchoice;
	public int CPUselectedchoice;
	public int playerhealth = 100, cpuhealth = 100;
	
	
	/**
	 * @return the selectedchoice
	 */
	public int getSelectedchoice() {
		return selectedchoice;
	}

	/**
	 * @return the cPUselectedchoice
	 */
	public int getCPUselectedchoice() {
		return CPUselectedchoice;
	}

	/**
	 * @return the playerhealth
	 */
	public int getPlayerhealth() {
		return playerhealth;
	}

	/**
	 * @return the cpuhealth
	 */
	public int getCpuhealth() {
		return cpuhealth;
	}

	/**
	 * @param selectedchoice the selectedchoice to set
	 */
	public void setSelectedchoice(int selectedchoice) {
		this.selectedchoice = selectedchoice;
	}

	/**
	 * @param cPUselectedchoice the cPUselectedchoice to set
	 */
	public void setCPUselectedchoice(int cPUselectedchoice) {
		CPUselectedchoice = cPUselectedchoice;
	}

	/**
	 * @param playerhealth the playerhealth to set
	 */
	public void setPlayerhealth(int playerhealth) {
		this.playerhealth = playerhealth;
	}

	/**
	 * @param cpuhealth the cpuhealth to set
	 */
	public void setCpuhealth(int cpuhealth) {
		this.cpuhealth = cpuhealth;
	}

	public ThrowCard() {
		super();
	}

	@Override
	public String[][] getPlayerdeck() {
		return playerdeck;
	}

	@Override
	public void setPlayerdeck(String[][] playerdeck) {
		this.playerdeck = playerdeck;
	}

	@Override
	public String[][] getCpudeck() {
		return cpudeck;
	}

	@Override
	public void setCpudeck(String[][] cpudeck) {
		this.cpudeck = cpudeck;
	}

	
}
