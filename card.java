class Card { 
	private int rank;
	private int suit;


	//define a card constructor as well as geter and setter methods for ranks and suits
	public card(int suit, int rank){
		this.suit = suit;
		this.rank = rank;
	}
	public int getRank(){
		return rank;
	}
	public int setRank(int rank){
		this.rank = rank;
	}
	public int getSuit(){
		return suit;
	}
	public int setSuit(int suit){
		this.suit = suit;
	}

	//create a tostring function that converts numbers to strings
	public String stringCombiner(){

		StringBuilder cardName = new StringBuilder()long

		numberToRank(rank){
			if (rank = 11){
				cardName.append("Jack");
			}
			if (rank = 12){
				cardName.append("Queen");
			}
			if (rank = 13){
				cardName.append("King");
			}
			if (rank = 14){
				cardName.append("Ace");
			} 
			else {
				cardName.append(rank);
			}
		}

		numberToSuit(suit){
			if (suit = 0){
				cardName.append("Clubs")
			}
			if (suit = 1){
				cardName.append("Diamonds")
			}
			if (suit = 2){
				cardName.append("Hearts")
			}
			if (suit = 3){
				cardName.append("Spades")
			} else {
				break;
			}
		}
		return cardName.stringCombiner();
	}


}
