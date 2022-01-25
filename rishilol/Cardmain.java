public class Cardmain
{
    public static void main (String[] args)
    {
        War wargame = new War();
	wargame.play();
    }
}

class Deck
{
    static final int numberOfCards = 52;
    Card[] cards = new Card[numberOfCards];
    int index;
    
    public Deck()
    {
        // Constructs all 52 Card objects

	for (int i = 0;i < numberOfCards; i++)
	    cards[i] = new Card(i);
    }
    
    public void shuffle()
    {
        // Shuffles the deck.
	Card temp;
	int a;
	for (int x = 0; x < numberOfCards; x++)
	{
	    a = (int)(Math.random() * numberOfCards);
	    temp = cards[x];
	    cards[x] = cards[a];
	    cards[a] = temp;
	}
    }
    
    public Card getNextCard()
    {
        // Gets the next card in the deck.
	
	if (index >= numberOfCards)
	   index = 0;
	int temp = index;
	index++;
	return cards[temp];
    }
}

class Card 
{    
    // The values 0-12 represent clubs, 13-25 diamonds, 
    // 26-38 hearts, and 39-51 spades. Within each suit,
    // the lowest value is the ace and highest is the king.
    int suit = 0; // 0 through 3
    int rank = 0; // 0 through 12
    
    public Card(int s, int r) 
    {
        // Sets suit and rank
	if (s <= 12)
	{
	    suit = 0;
	    rank = r;
	}
	else if (s >= 13 && s <= 25)
	{
	    suit = 1;
	    rank = r % 13;
	}
	else if (s >= 26 && s <= 38)
	{
	    suit = 2;
	    rank = r % 26;
	}
	else if (s >= 39 && s <= 51)
	{
	    suit = 3;
	    rank = r % 39;
	}
    }
    
    public Card(int number) 
    {
        this(number, number);
    }
    
    public String toString()
    {
        // Returns a string representation of a Card in
        // a format like so: The Ace of Clubs
        String theCard;
	String[] cardRank = {"Ace","Two","Three","Four","Five","Six","Seven",
	                     "Eight","Nine","Ten","Jack","Queen","King"};
	String[] cardSuit = {"Clubs","Diamonds","Hearts","Spades"};
	
	// cardSuit is not needed for War:
	theCard = (cardRank[rank]);
	
	return theCard;
    }
    
    public int compareWar(Card other)
    {
        if ((rank == 0) && (other.rank != 0))
	   return 1;
	else if ((other.rank == 0) && (rank != 0))
	   return -1;
	else if (rank > other.rank)
	   return 1;
	else if (other.rank > rank)
	   return -1;
	else
	   return 0;
    }
}

public class War
{
    public final int END_LIMIT = 8;
    private Deck warDeck;
    private Vector pileAbe = new Vector(30,22); //set capacity at 30
    private Vector pileBob = new Vector(30,22); //increment by 22 if needed
    
    public War(Deck gameDeck)
    {
        warDeck = gameDeck;
	warDeck.shuffle(); //Shuffles deck
    }
    
    public void play()
    {
        for(int i = 0;i < Deck.numberOfCards; i+=2)
	    pileAbe.addElement(warDeck.getNextCard());
	for(int i = 0;i < Deck.numberOfCards; i+=2)
	    pileBob.addElement(warDeck.getNextCard());
	
	System.out.println("Abe = " + (Card)pileAbe.elementAt(0));
	System.out.println("Bob = " + (Card)pileBob.elementAt(0));
	
	int test = ((Card)pileAbe.firstElement()).compareWar((Card)pileBob.firstElement());
	if (test < 0)
	   System.out.println("Bob wins!");
	else if (test > 0)
	   System.out.println("Abe wins!");
	else
	   System.out.println("Battle!"); //The 2 cards match
	System.out.println("==========");
    }
}