package javaFinalProject;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Player 1 Name: ");
		Player player1 = new Player(sc.nextLine());

		System.out.println("Player 2 Name: ");
		Player player2 = new Player(sc.nextLine());

		
		Deck deck = new Deck();
		
		deck.shuffle();
		
		for (int i = 0; i < 52; i ++) {
			if (i % 2 == 0) {
				player1.deal(deck);
			} else {
				player2.deal(deck);
			}
		}
		
		player1.describe();
		player2.describe();
		
		System.out.println("----------Game ON------------");
		
		for (int turn = 0; turn < 26; turn++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
					
			if(card1.getValue() > card2.getValue()) {
				player1.incrementScore();
				System.out.println(player1.playerName + " gets a point.");
			} else if (card1.getValue() < card2.getValue()){
				player2.incrementScore();
				System.out.println(player2.playerName + " gets a point.");
			} else {
				System.out.println("Tie, no points awarded.");
			}
			System.out.print("Score: ");
			System.out.println(player1.playerName + "- " + player1.score);
			System.out.println("       " + player2.playerName + "- " + player2.score);
			System.out.println();
		}
		
		System.out.println("Final Score: \n" + 
							player1.playerName + "- " + player1.score +
							"\n" + player2.playerName + "- " + player2.score);
		if(player1.score > player2.score) {
			System.out.println(player1.playerName + " WINS!");
		} else if (player1.score < player2.score) {
			System.out.println(player2.playerName + " WINS!");
		} else {
			System.out.println("Game ends in a draw.");
		}
		
		sc.close();
	}
	
//	public static String choosePlayers(String name1, String name2) {
//		Scanner sc2 = new Scanner(System.in);
//		
//		System.out.println("Player 1 Name: ");
//		name1 = sc2.nextLine();
//		System.out.print("Player 2 Name: ");
//		name2 = sc2.nextLine(); 
//		
//		return name1
//	}

}
