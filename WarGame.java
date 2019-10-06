public class WarGame {


	public static void main(String[] args){
		//Create a deck of cards
		List<Card> deck = new ArrayList<Card>();

		//Add cards to deck(52)
		for (int suits=0; suits<4 suits++){
			for (int ranks=0; ranks<15; rank++){
				deck.add(new card(x,y));
			}
		}

        // create 2 decks for each player
		List<card> p1deck = new ArrayList<>();
		List<card> p2deck = new ArrayList<>();

		//add half of all cards to both decks
		p1deck.addAll(deck.sublist(0,25));
		p2deck.addAll(deck.sublist(26, cardDeck.size()));


		//loop until break
		while(true){
		    //create current cards and get them from bottm
			Card p1card = p1deck.get(p1deck.size()-1);
			Card p2card = p2deck.get(p2deck.size()-1);

			//print out card
			System.out.println("Player 1's card is " + p1card.stringCombiner);
			System.out.println("Player 2's card is " + p1card.stringCombiner);

			//check who would win a round assuming no war
			if (card1.getRank() < card2.getRank()){
				p2deck.add(p1card);
				p2deck.add(p2card) ;
				System.out.println("Player 2 wins")
			} else if (card1.getRank() < card2.getRank()){
				p1deck.add(p1card);
				p2deck.add(p2card);
				System.out.println("Player 1 wins")
			} else {
			    //war case
                //war rules will be draw two cards add them highest sum gets all the cards
				System.out.println("WAR");
				List<Card> p1war = new ArrayList<Card>();
                List<Card> p2war = new ArrayList<Card>();

                //make sure we have 3 cards minimum
				for (int i = 0; i <= 3; i++) {
					if (p1deck.size() == 0  || p2deck.size() == 0){
						break;
					}

					//add last cards to the war deck that we will use
					p1war.add(p1deck.get(p1deck.size()-1);
					p2war.add(p2deck.get(p2deck.size()-1);

				}

                //make sure there are enough cards
				if (war1.size() > 2 && war2.size >2) {
					int p1sum = p1war.get(2) + p1war.get(1);
					int p2sum = p2war.get(2) + p2war.get(1);
					if (p1sum > p2sum) {
						for (int i = 0; i <= p1war.size(); i++) {
							p1deck.add(p1war.get(i));
							p1deck.add(p2war.get(i));
							System.out.println("Player 1 has wins war  round ");
						}

					} else {
						for (int i = 0; i <= p1war.size(); i++) {
							p1deck.add(p1war.get(i));
							p1deck.add(p2war.get(i));
							System.out.println("Player 2 wins war round");
						}
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