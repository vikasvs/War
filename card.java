class card {
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
	public void setRank(int rank){
		this.rank = rank;
	}
	public int getSuit(){
		return suit;
	}
	public void setSuit(int suit){
		this.suit = suit;
	}

	//create a  function that converts numbers to strings


	public void numberToRank(int arank, StringBuilder cardname){
		if (rank == 11){
			cardname.append("Jack");
		}
		if (rank == 12){
			cardname.append("Queen");
		}
		if (rank == 13){
			cardname.append("King");
		}
		if (rank == 14){
			cardname.append("Ace");
		}
		else {
			cardname.append(rank);
		}
	}

	public void numberToSuit(int asuit, StringBuilder cardname) {
		if (suit == 0) {
			cardname.append("Clubs");
		}
		if (suit == 1) {
			cardname.append("Diamonds");
		}
		if (suit == 2) {
			cardname.append("Hearts");
		}
		if (suit == 3) {
			cardname.append("Spades");
		}
	}


	public StringBuilder stringCombiner(card newCard){

		StringBuilder cardName = new StringBuilder();
		int currRank = newCard.getRank();
		int currSuit = newCard.getSuit();

		numberToRank(currRank, cardName);
		numberToSuit(currSuit, cardName);
		return cardName;
	}


}
