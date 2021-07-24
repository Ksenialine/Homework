package by.academy.homework2;

import java.util.Scanner;

public class Deal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите кол-во игроков в покер: ");
		int players = sc.nextInt();
		int cardsPerPlayer = 5;

		String[] suits = { "Пика", "Бубен", "Черв", "Крестя" };

		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Валет", "Королева", "Король", "Туз" };

		int n = suits.length * rank.length; // количество карт

		if (players == 0) {
			System.out.println("Игра прекращена.");
			break;

		} else if (players < 0) {

			System.out.println("Число игроков не может быть меньше 0");

		} else {

			System.out.println("Слишком много игроков!");
		}
	}

	}else{System.out.println("Вы ввели не число, или Ваше число слишком большое!");

	}}

	// часть 3 - инициализация колоды
	String[] deck = new String[n];for(
	int i = 0;i<rank.length;i++)
	{
		for (int j = 0; j < suits.length; j++) {
			deck[suits.length * i + j] = rank[i] + " " + suits[j];
		}
	}

	// часть 4 - перетасовка колоды
	for(
	int i = 0;i<n;i++)
	{
		int r = i + (int) (Math.random() * (n - i)); // случайная карта в колоде
		String temp = deck[r];
		deck[r] = deck[i];
		deck[i] = temp;
	}

	// часть 5 - перетасованная колода выводится на экран
	for(
	int i = 0;i<players*cardsPerPlayer;i++)
	{
		System.out.println(deck[i]);
		if (i % cardsPerPlayer == cardsPerPlayer - 1)
			System.out.println();
	}
}

}
