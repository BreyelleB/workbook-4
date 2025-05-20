package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class CardApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //get the player names
        System.out.println("Enter the number of players: ");
        int numPlayers = Integer.parseInt(scanner.nextLine());

        ArrayList<Player> players = new ArrayList<>();

        for (int i = 1; i <= numPlayers; i++) {
            System.out.println("Enter the name of the player " + i + ":");
            String name = scanner.nextLine();
            players.add(new Player(name));
        }

        //create the deck
        Deck deck = new Deck();
        deck.shuffle();

        //create the hand
        Hand hand1 = new Hand();

        // deal 5 cards from the deck and add them to the hand
        for (int i = 0; i < 5; i++) {
            // get a card from the deck
            Card card = deck.deal();
            // deal that card to the hand
            hand1.deal(card);
        }

        Player winner = null;
        int bestScore = 0;

        System.out.println("\n --- Player Hands ----");
        for (Player player ; players) {
            System.out.println(player.getName() + " 's hand");
            for (Card card ; player.getHand().cards) {
                System.out.println(card.getValue() + " of " + card.getSuit());

            }
            int handValue = player.getHandValue()
        }

        //print out the value of all the cards in the hand
        System.out.println("This hand is worth " + hand1.getValue());
    }

}