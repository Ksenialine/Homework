package by.academy.homework2;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите слова для анализа:");
		String s = scanner.nextLine();

		String[] words = s.split("\\s+");
		for (int i = 0; i < words.length; i++) {
			words[i] = words[i].replaceAll("[^i*\\w+]", "");
		}

		String smallest = words[0];
		for (int x = 1; x < words.length; x++) {
			if (words[x].length() < smallest.length()) {
				smallest = words[x];
				System.out.println("Самое короткое слово: " + words[x]);
				break;
			}
		}
		scanner.close();

	}

}
