//Written by: Francisco Valadez
//Assignment: HW06 - Pg. 113 - #3.24
//Class: CS 113
//Date: 5/15/2021
//Description: This program is a game that randomly picks a card from a deck and then displays
//             that card to the user.

public class Game 
{
    public static void main(String[] args)
    {
        String rankValue = "", suitValue = "";

        System.out.println("This game picks a random card from a deck! ");
      
        int suit = (int) (Math.random() * 4);
        int rank = (int) (Math.random() * 13); 

        switch (rank) {
            case 0:
                rankValue = "Ace";
                break;
            case 10:
                rankValue = "Jack";
                break;
            case 11:
                rankValue = "Queen";
                break;
            case 12:
                rankValue = "King";
                break;
            default:
                rankValue = String.valueOf(rank + 1);
        }

        switch (suit) {
            case 0:
                suitValue = "Clubs";
                break;
            case 1:
                suitValue = "Diamonds";
                break;
            case 2:
                suitValue = "Hearts";
                break;
            case 3:
                suitValue = "Spades";
                break;
        }

        System.out.println("The card you picked is " + rankValue + " of " + suitValue);
    }    
}
