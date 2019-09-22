public class WarGame {
	public static void main(String[] args){
		//Create a "deck"
		List<Card> deck = new ArrayList<Card>();

		//Add cards to deck(52)
		for (int suits=0; suits<4 suits++){
			for (int ranks=0; ranks<15; rank++){
				deck.add(new card(x,y));
			}
		}

		/**
		Logic
		create 2 decks for each player
		add 26 cards to each deck
		play each card(maybe have user input saying "play card and have to type yes)
		compare the rank between the two cards
			higher rank wins both carrd
			place card at bottom og deck
			print who won the round
		if ranks are equal than war occurs
			make up rules for what happens when war occurs
			do war
			end war
			print whoever wins the  when the cards are all gone for one person
		*/

	}
}