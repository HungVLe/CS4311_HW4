/* Version History  :
 Inteface   : DoyuCard
 Author     : Karthick
              Hung Le
              Heli
              Janani
 Description: Class with getter and setter methods for accesing the shared variables
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --===========================================================================================================================
 -- 1.0    19-Jan-2017     Karthick                            1. Class with getter and setter methods for accessing the shared variables
 -- 2.0    05-Feb-2017     Hung Le, Heli,                     2. Increased accessor methods for few additional variables
                           Janani, Karthick                                              
 --===========================================================================================================================
 --============================================================================================================================*/

package Card;
import Move.DoyuMoves;

public class DoyuCard extends DoyuMoves implements Card {
	public int selectedchoice;
	public int CPUselectedchoice;
	public int playerhealth = 100, cpuhealth = 100;

	public int player_attack_pt = 0, player_defend_pt = 0, player_regeneration_pt = 0, player_karma_pt = 0,
			player_counter_pt = 0, player_SpecialAttack_pt = 0, player_SpecialDefend_pt = 0, player_poison_pt = 0;

	public int cpu_attack_pt = 0, cpu_defend_pt = 0, cpu_regeneration_pt = 0, cpu_karma_pt = 0, cpu_counter_pt = 0,
			cpu_SpecialAttack_pt = 0, cpu_SpecialDefend_pt = 0, cpu_poison_pt = 0;

	public DoyuCard() {
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
	 * @return the player_attack_pt
	 */
	public int getPlayer_attack_pt() {
		return player_attack_pt;
	}

	/**
	 * @return the player_defend_pt
	 */
	public int getPlayer_defend_pt() {
		return player_defend_pt;
	}

	/**
	 * @return the player_regeneration_pt
	 */
	public int getPlayer_regeneration_pt() {
		return player_regeneration_pt;
	}

	/**
	 * @return the player_karma_pt
	 */
	public int getPlayer_karma_pt() {
		return player_karma_pt;
	}

	/**
	 * @return the player_counter_pt
	 */
	public int getPlayer_counter_pt() {
		return player_counter_pt;
	}

	/**
	 * @return the player_SpecialAttack_pt
	 */
	public int getPlayer_SpecialAttack_pt() {
		return player_SpecialAttack_pt;
	}

	/**
	 * @return the player_SpecialDefend_pt
	 */
	public int getPlayer_SpecialDefend_pt() {
		return player_SpecialDefend_pt;
	}

	/**
	 * @return the player_poison_pt
	 */
	public int getPlayer_poison_pt() {
		return player_poison_pt;
	}

	/**
	 * @return the cpu_attack_pt
	 */
	public int getCpu_attack_pt() {
		return cpu_attack_pt;
	}

	/**
	 * @return the cpu_defend_pt
	 */
	public int getCpu_defend_pt() {
		return cpu_defend_pt;
	}

	/**
	 * @return the cpu_regeneration_pt
	 */
	public int getCpu_regeneration_pt() {
		return cpu_regeneration_pt;
	}

	/**
	 * @return the cpu_karma_pt
	 */
	public int getCpu_karma_pt() {
		return cpu_karma_pt;
	}

	/**
	 * @return the cpu_counter_pt
	 */
	public int getCpu_counter_pt() {
		return cpu_counter_pt;
	}

	/**
	 * @return the cpu_SpecialAttack_pt
	 */
	public int getCpu_SpecialAttack_pt() {
		return cpu_SpecialAttack_pt;
	}

	/**
	 * @return the cpu_SpecialDefend_pt
	 */
	public int getCpu_SpecialDefend_pt() {
		return cpu_SpecialDefend_pt;
	}

	/**
	 * @return the cpu_poison_pt
	 */
	public int getCpu_poison_pt() {
		return cpu_poison_pt;
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

	/**
	 * @param player_attack_pt the player_attack_pt to set
	 */
	public void setPlayer_attack_pt(int player_attack_pt) {
		this.player_attack_pt = player_attack_pt;
	}

	/**
	 * @param player_defend_pt the player_defend_pt to set
	 */
	public void setPlayer_defend_pt(int player_defend_pt) {
		this.player_defend_pt = player_defend_pt;
	}

	/**
	 * @param player_regeneration_pt the player_regeneration_pt to set
	 */
	public void setPlayer_regeneration_pt(int player_regeneration_pt) {
		this.player_regeneration_pt = player_regeneration_pt;
	}

	/**
	 * @param player_karma_pt the player_karma_pt to set
	 */
	public void setPlayer_karma_pt(int player_karma_pt) {
		this.player_karma_pt = player_karma_pt;
	}

	/**
	 * @param player_counter_pt the player_counter_pt to set
	 */
	public void setPlayer_counter_pt(int player_counter_pt) {
		this.player_counter_pt = player_counter_pt;
	}

	/**
	 * @param player_SpecialAttack_pt the player_SpecialAttack_pt to set
	 */
	public void setPlayer_SpecialAttack_pt(int player_SpecialAttack_pt) {
		this.player_SpecialAttack_pt = player_SpecialAttack_pt;
	}

	/**
	 * @param player_SpecialDefend_pt the player_SpecialDefend_pt to set
	 */
	public void setPlayer_SpecialDefend_pt(int player_SpecialDefend_pt) {
		this.player_SpecialDefend_pt = player_SpecialDefend_pt;
	}

	/**
	 * @param player_poison_pt the player_poison_pt to set
	 */
	public void setPlayer_poison_pt(int player_poison_pt) {
		this.player_poison_pt = player_poison_pt;
	}

	/**
	 * @param cpu_attack_pt the cpu_attack_pt to set
	 */
	public void setCpu_attack_pt(int cpu_attack_pt) {
		this.cpu_attack_pt = cpu_attack_pt;
	}

	/**
	 * @param cpu_defend_pt the cpu_defend_pt to set
	 */
	public void setCpu_defend_pt(int cpu_defend_pt) {
		this.cpu_defend_pt = cpu_defend_pt;
	}

	/**
	 * @param cpu_regeneration_pt the cpu_regeneration_pt to set
	 */
	public void setCpu_regeneration_pt(int cpu_regeneration_pt) {
		this.cpu_regeneration_pt = cpu_regeneration_pt;
	}

	/**
	 * @param cpu_karma_pt the cpu_karma_pt to set
	 */
	public void setCpu_karma_pt(int cpu_karma_pt) {
		this.cpu_karma_pt = cpu_karma_pt;
	}

	/**
	 * @param cpu_counter_pt the cpu_counter_pt to set
	 */
	public void setCpu_counter_pt(int cpu_counter_pt) {
		this.cpu_counter_pt = cpu_counter_pt;
	}

	/**
	 * @param cpu_SpecialAttack_pt the cpu_SpecialAttack_pt to set
	 */
	public void setCpu_SpecialAttack_pt(int cpu_SpecialAttack_pt) {
		this.cpu_SpecialAttack_pt = cpu_SpecialAttack_pt;
	}

	/**
	 * @param cpu_SpecialDefend_pt the cpu_SpecialDefend_pt to set
	 */
	public void setCpu_SpecialDefend_pt(int cpu_SpecialDefend_pt) {
		this.cpu_SpecialDefend_pt = cpu_SpecialDefend_pt;
	}

	/**
	 * @param cpu_poison_pt the cpu_poison_pt to set
	 */
	public void setCpu_poison_pt(int cpu_poison_pt) {
		this.cpu_poison_pt = cpu_poison_pt;
	}

	
}
