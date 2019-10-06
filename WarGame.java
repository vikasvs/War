import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class WarGame {


	public static void main(String[] args){
		//Create a deck of cards
		List<card> deck = new ArrayList<card>();

		//Add cards to deck(52)
		for (int suits=0; suits<4; suits++){
			for (int ranks=0; ranks<15; ranks++){
				deck.add(new card(suits,ranks));
			}
		}

        // create 2 decks for each player
		List<card> p1deck = new ArrayList<>();
		List<card> p2deck = new ArrayList<>();

		//add half of all cards to both decks
        for (int i = 0; i<= 52; i++){
            if (i<=25){
                p1deck.add(deck.get(i));
            } else {
                p2deck.add(deck.get(i));
            }
        }
		//p1deck.addAll(deck.sublist(0,25));
		//p2deck.addAll(deck.sublist(26, deck.size()));


		//loop until break
		while(true){
		    //create current cards and get them from bottm
            card p1card = p1deck.get(p1deck.size()-1);
            card p2card = p2deck.get(p2deck.size()-1);

			//print out card
			System.out.println("Player 1's card is " + p1card.stringCombiner(p1card));
			System.out.println("Player 2's card is " + p1card.stringCombiner(p2card));

			//check who would win a round assuming no war
			if (p1card.getRank() < p2card.getRank()){
				p2deck.add(p1card);
				p2deck.add(p2card) ;
				System.out.println("Player 2 wins");
			} else if (p1card.getRank() < p2card.getRank()){
				p1deck.add(p1card);
				p2deck.add(p2card);
				System.out.println("Player 1 wins");
			} else {
			    //war case
                //war rules will be draw two cards add them highest sum gets all the cards
				System.out.println("WAR");
				List<card> p1war = new ArrayList<card>();
                List<card> p2war = new ArrayList<card>();

                //make sure we have 3 cards minimum
				for (int i = 0; i <= 2; i++) {
					if (p1deck.size() == 0  || p2deck.size() == 0){
						break;
					}

					//add last cards to the war deck that we will use
					p1war.add(p1deck.get(p1deck.size()-1));
					p2war.add(p2deck.get(p2deck.size()-1));

				}

                //make sure there are enough cards
				if (p1war.size() == 2 && p2war.size() == 2) {
					int p1sum = p1war.get(2).getRank() + p1war.get(1).getRank();
					int p2sum = p2war.get(2).getRank() + p2war.get(1).getRank();
					if (p1sum > p2sum) {
                        for (int i = 0; i <= p1war.size(); i++) {
                            p1deck.add(p1war.get(i));
                            p1deck.add(p2war.get(i));
                        }
                        System.out.println("Player 1 has won war round ");
                    }else {
						for (int i = 0; i <= p1war.size(); i++) {
							p1deck.add(p1war.get(i));
							p1deck.add(p2war.get(i));
						}
                        System.out.println("Player 2 has won war round");

                    }
				}
                //check to see if someone has won the game
				if (p1deck.size() == 0){
                    System.out.println("Player 1 has won the game");
                    break;
                } else if (p2deck.size() == 0){
                    System.out.println("Player 2 has won the game");
                    break;
                }
			}
        }

	}
}