package by.academy.homework2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите 2 слова для анализа:");
		String word1 = scanner.nextLine();
		String word2 = scanner.nextLine();

		char[] word1Array = word1.toCharArray();
		char[] word2Array = word2.toCharArray();
		int[] letters = new int[128];

		if (word1.length() != word2.length()) {
			System.out.println("Не перестановка!");
		} else {
			for (char c : word1Array) {
				letters[c]++;
			}
			for (char c : word2Array) {
				letters[c]--;
			}
			boolean isPermutation = true;
			for (int i : letters) {
				if (i != 0) {
					System.out.println("Не перестановка!");
					isPermutation = false;
					break;
				}
			}
			if (isPermutation) {
				System.out.println("Перестановка!");

			}

		}
		scanner.close();
	}
}