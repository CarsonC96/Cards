//DeckOfCards class represents a deck of playing cards.
import java.util.Random;

public class DeckOfCards {
	
	private Card[] deck;//array of Cards objects
	private int currentCard;//index of next Card to be dealt (0-51)
	private static final int NUMBER_OF_CARDS = 52;//constant # of cards
	//random number generator
	private static final Random randomNumbers = new Random();
	
	//constructor fills deck of Cards
	public DeckOfCards(){
		String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six", 
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades"};
		
		deck = new Card[ NUMBER_OF_CARDS ];//create array of Card Objects
		currentCard = 0;//set currentCard so first Card dealt is deck[0]
		
		//populate deck with Card objects
		for ( int count = 0; count < deck.length; count++ )
		{
			for(int suitsCount = 0; suitsCount < 4; suitsCount++) //Makes clean distribution of Suits
				deck[ count ] =
				new Card( faces[ count % 13], suits[ suitsCount % 4]); 
		}
		
		}//end DeckOfCards
	
	//shuffle deck of Cards with one-pass algorithm
	public void shuffle(){
		
		//after shuffling, dealing should start at deck[ 0 ] again
		currentCard = 0;//reinitialize currentCard
		
		//for each Card, pick another random Card (0-51) and swap them
		for ( int first = 0; first < deck.length; first++){
			
			//select a random number between 0 and 51
			int second = randomNumbers.nextInt( NUMBER_OF_CARDS);
			
			//swap current card with randomly selected Card
			Card temp = deck[ first ];
			deck[ first ] = deck[ second ];
			deck[ second ] = temp;
		}//end for
	}// end method shuffle
	
	//deal one Card
	public Card dealCard(){
		
		//determine whether Cards remain to be dealt
		if ( currentCard < deck.length)
			return deck[ currentCard++ ];//return next card in array
		else
			return null;//return null to indicate that all Cards were dealt 
	}//end method dealCard
}//end class DeckOfCards
	
	


