/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  Teo Espero
//  BS Cloud and Systems Administration
//  BS Software Development
//  Western Governors University
//  DeckOfCards -   This Java program is created to simulate drawing 4 cards from a deck of
//                  52 cards...
//  Date written: 08 30 2022
/////////////////////////////////////////////////////////////////////////////////////////////////////////////

//  array function
import java.util.Arrays;

//  for input functions
import java.util.Arrays;
import java.util.Scanner;

//  data mismatch
import java.util.InputMismatchException;

/////////////////////////////////////////////////////////////////////////////////////////////////////////////
//  DeckOfCards class declaration
public class DeckOfCards {

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  main class declaration
    public static void main(String[] args){

        //  declare the vars we need
        int[] deckOfCard = new int[52];

        //  call the methods needed
        shuffleCards(deckOfCard);
        pick4Cards(deckOfCard);

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  pick4Cards method declaration
    //  -   this is to pick the first 4 cards from the shuffled deck
    private static void pick4Cards(int[] deckOfCard) {

        //  vars for determining the card value
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] cardFace =  {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "6", "10", "Jack", "Queen", "King"};

        //  show the cards picked
        System.out.println();
        for (int i = 0; i < 4; i++) {
            String suit = suits[deckOfCard[i] / 13];
            String rank = cardFace[deckOfCard[i] % 13];
            System.out.println( rank + " of " + suit);
        }
        System.out.println();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //  shuffleCards method declaration
    //  -   generate our deck and then shuffle
    private static void shuffleCards(int[] deckOfCard) {
        int cardValue = 0;

        //  to generate the cards we assign a value from 0 to 51 to the array deckOfCard
        System.out.println("Card generation");
        for (int myCards = 0; myCards < 52; myCards++)
            deckOfCard[myCards] = myCards;

        //  shuffling the cards randomly
        System.out.println("Shuffling...");
        for (int cardIdx = 0; cardIdx < 52; cardIdx++){

            //  generate our random shuffle point
            int index = (int)(Math.random() * deckOfCard.length);

            //  swap the card positions
            int temp = deckOfCard[cardIdx];
            deckOfCard[cardIdx] = deckOfCard[index];
            deckOfCard[index] = temp;
        }
    }
}
