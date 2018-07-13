package com.saunv.assignment01.playingCards;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;

public class DeckCards {
	private int amountPlayer;
	private ArrayList<Card> mDeckCards;
	private String[] mSuit = { "Spades", "Hearts", "Diamonds", "Clubs" };
	private String[] mRank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
	Stack<Card> stack;

	public DeckCards() {

		mDeckCards = new ArrayList<>();
		for (int i = 0; i < mSuit.length; i++) {
			for (int j = 0; j < mRank.length; j++) {
				mDeckCards.add(new Card(mSuit[i], mRank[j]));
			}
		}
	}

	public void shuffleCards() {
		Random mRandom = new Random();
		stack = new Stack();
		int size = mDeckCards.size();
		for (int i = 0; i < size; i++) {
			int temp = mRandom.nextInt(mDeckCards.size());
			stack.push(mDeckCards.get(temp));
			mDeckCards.remove(temp);
		}
	}

	public void mistributeCards(int amountPlayer) {

		shuffleCards(); // Shuffle Cards
		int amountCarsPlayer =13;
		int temp1 = 0;
		int temp2 = amountCarsPlayer;
		for (int i = 0; i < amountPlayer; i++) {
			System.out.println("Card Lists of Player " + (i + 1) + " :");
			for (int j = temp1; j < temp2; j++) {
				System.out.print(stack.get(j).toString() + "     ");
			}
			temp1 = temp2;
			temp2 += amountCarsPlayer;
			System.out.println("\n---------------------------------------------------------");
		}
	}

	public void showDeckCards() {
		for (int i = 0; i < mDeckCards.size(); i++) {
			System.out.println(mDeckCards.get(i).getRank() + "---" + mDeckCards.get(i).getSuit());
		}
	}

	public void showDecks() {
		for (int i = 0; i < stack.size(); i++) {
			System.out.println(stack.get(i).toString());
		}

	}

}
