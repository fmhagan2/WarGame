package javaFinalProject;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	List<Card> hand = new ArrayList<Card>();
	int score;
	String playerName;
	
	Player(String playerName) {
		this.playerName = playerName;
		hand = new ArrayList<Card>();
		setScore(0);
	}
	
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void describe() {
		System.out.println("Player: " + this.playerName);
		System.out.println("----------------------------");
		for (Card card : hand) {
			card.describe();
		}
		System.out.println();
	}
	
	public Card flip() {
		Card card = this.hand.remove(0);
		System.out.print(playerName + "- ");
		card.describe();
		return card;
	}
	
//	public List<Card> draw(Deck deck) {
//		deck.draw();
//		hand.add(deck.draw());
//		return hand;
//	}
	public void deal(Deck deck) {
		Card cardDrawn = deck.draw();
		hand.add(cardDrawn);
	}
	
	public void incrementScore() {
		this.score += 1;
	}
	
	
}

