//Card class represents a playing card
public class Card {
	
	private String face;//face of a card ("Ace", "Deuce", ...)
	private String suit;//suit of a card ("Hearts", "Diamonds",...)
	
	//two-argument constructor initializes card`s face and suit
	public Card( String cardFace, String cardSuit ){
		face = cardFace;//initialize face of card
		suit = cardSuit;//initialize suit of a card
	}//end of two argument Card constructor
	
	//return String representation of Card
	public String toString(){
		return face + " of " + suit;
				
	}
	//end method toString

}//end class Card
