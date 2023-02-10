package javaFinalProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	List<Card> cards = new ArrayList<Card>();
	
	Deck() {
		String[] suits = {"Diamonds", "Hearts", "Clubs", "Spades"};
		String[] names = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", 
						 "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
		for(String suit : suits) {
			int counter = 2;
			for(String name : names) {
				Card card = new Card(name, suit, counter);
				this.cards.add(card);
				counter++;
			}
		}
	}
	
	
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	public void describe() {
		for(Card card : this.cards) {
			card.describe();
		}
	}

	public void shuffle() {
		Collections.shuffle(this.cards);
	}
	
	public Card draw() {
		Card card = this.cards.remove(0);
		return card;
	}
	
	
}
