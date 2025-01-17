import java.util.*;

public class CardDeck
{
    // method to initialize the deck of cards
    public static String[] initializeDeck()
    {
		//take the suits and ranks in string array
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        
        int index = 0;
        for (String suit : suits)
        {
            for (String rank : ranks)
            {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // method to shuffle the deck of cards
    public static String[] shuffleDeck(String[] deck)
    {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++)
        {
            // random card number between i and the last card
            int randomCardNumber = i + random.nextInt(deck.length - i);
            // swap the current card with the random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    // method to distribute the deck of cards to players
    public static String[][] distributeCards(String[] deck, int numOfCards, int numOfPlayers)
    {
        // check if the number of cards can be evenly distributed among players
        if (numOfCards % numOfPlayers != 0)
        {
            System.out.println("Cards cannot be evenly distributed among players.");
            return null;
        }
        
        // create a 2D array to store the players and their cards
        String[][] players = new String[numOfPlayers][numOfCards / numOfPlayers];
        
        // distribute the cards to the players
        int cardIndex = 0;
        for (int i = 0; i < numOfPlayers; i++)
        {
            for (int j = 0; j < numOfCards / numOfPlayers; j++)
            {
                players[i][j] = deck[cardIndex++];
            }
        }
        return players;
    }

    // method to print the players and their cards
    public static void printPlayersCards(String[][] players)
    {
        for (int i = 0; i < players.length; i++)
        {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i])
            {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // initialize the deck of cards
        String[] deck = initializeDeck();
        
        // shuffle the deck
        deck = shuffleDeck(deck);

        // ask for number of players
        System.out.print("Enter the number of players: ");
        int numOfPlayers = scanner.nextInt();

        // ask for number of cards to be distributed
        System.out.print("Enter the number of cards to distribute: ");
        int numOfCards = scanner.nextInt();

        // distribute the cards
        String[][] players = distributeCards(deck, numOfCards, numOfPlayers);
        
        // if cards were successfully distributed, print players' cards
        if (players != null)
        {
            printPlayersCards(players);
        }

        scanner.close();
    }
}
