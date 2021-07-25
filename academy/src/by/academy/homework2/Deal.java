package by.academy.homework2;

import java.util.Scanner;

public class Deal {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите кол-во игроков в покер: ");
		int players = scanner.nextInt();
		int cardsPerPlayer = 5;

		if (players <= 1) {
			System.out.println("Игры не получится :(");
		} else if (players >= 2 && players <= 10) {
			System.out.println("Играем :)");
		}

		String[] suits = { "Пика", "Буба", "Черва", "Треф" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз" };

		int n = suits.length * rank.length;

		String[] coloda = new String[n];
		for (int x = 0; x < rank.length; x++) {
			for (int y = 0; y < suits.length; y++) {
				coloda[suits.length * x + y] = rank[x] + " " + suits[y];
			}
		}
		for (int i = 0; i < n; i++) {
			int r = i + (int) (Math.random() * (n - i));
			String temp = coloda[r];
			coloda[r] = coloda[i];
			coloda[i] = temp;
		}
		for (int i = 0; i < players * cardsPerPlayer; i++) {
			System.out.println(coloda[i]);
			if (i % cardsPerPlayer == cardsPerPlayer - 1)
				System.out.println();
		}
		scanner.close();
	}
}
