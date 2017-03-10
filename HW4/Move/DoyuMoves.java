/* Version History  :
 Class      : DoyuMoves
 Author     : Karthick
              Hung Le
              Heli
              Janani
 Description: Generates a random deck for player and CPU
 --===========================================================================================================================
 -- Rev      Date            By                                                        Description                                                 
 --=========================================================================================================================== 
 -- 1.0    20-Feb-2017     Hung Le, Heli,                     1. Generates a random deck for player and CPU
                           Janani, Karthick                                             
 --===========================================================================================================================
 --============================================================================================================================*/

package Move;

import Card.Card;

public class DoyuMoves extends Move {
       public DoyuMoves(){
           
       } 
	
	public DoyuMoves (int campaign_choice) {
             if(campaign_choice==1){
                 deck=new String[]{"Drain", "Attack", "Defense", "Heal", "Damage"};
             }
             else if(campaign_choice==2){
                 deck=new String[]{"Drain", "Attack", "Defense", "Heal","Poison", "CurePoison"};
             }
             else if(campaign_choice==3){
                 deck=new String[]{"Drain", "Attack", "Defense", "Heal","Drainkarma", "Karma"};
             }
             else if(campaign_choice==4 || campaign_choice>4){
                 deck = new String[] {"Drain", "Attack", "Defense", "Heal", "Damage", "Regeneration", "Paralysis",
				"Drainkarma", "Karma", "Poison", "CurePoison", "Counter", "SpecialAttack", "SpecialDefend",
				"Dispell" };
             }
		
		
		playerdeck = new String[30][2];
		cpudeck = new String[30][2];
	}
	
	@Override
	public void generateCPUDeck(Card dc) {
		for (i = 0; i < 30; i++) {
			random = (int) ((Math.random() * 100) % deck.length);
			tmp_random = (x = (int) ((Math.random() * 100) % 4) * 5) > 0 ? x : 5;
			cpudeck[i][0] = deck[random];
			cpudeck[i][1] = Integer.toString(tmp_random);

		}
		dc.setCpudeck(cpudeck);
	}

	@Override
	public void generatePlayerDeck(Card dc) {
		for (i = 0; i < 30; i++) {
			random = (int) ((Math.random() * 100) % deck.length);
			tmp_random = (x = (int) ((Math.random() * 100) % 4) * 5) > 0 ? x : 5;
			playerdeck[i][0] = deck[random];
			playerdeck[i][1] = Integer.toString(tmp_random);

		}
		dc.setPlayerdeck(playerdeck);
	}
}
