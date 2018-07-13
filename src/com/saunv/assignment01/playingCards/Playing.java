package com.saunv.assignment01.playingCards;

import java.util.Scanner;

public class Playing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Amount Player: ");
		int amountPlayer = sc.nextInt();
		DeckCards deckCards = new DeckCards();
		System.out.println("Card Lists of " + amountPlayer+" Players: \n");
		deckCards.mistributeCards(amountPlayer);
	}

}
