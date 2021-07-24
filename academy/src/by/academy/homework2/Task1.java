package by.academy.homework2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите 2 слова для анализа:");
		String word1 = scanner.nextLine();
		String word2 = scanner.nextLine();}
		
		public boolean permutation (String word1, String word2) {

		char[] word1Array = word1.toCharArray();
		char[] word2Array = word2.toCharArray();
		int[] letters = new int[128];

		if (word1.length() != word2.length()) {
			return false;
		}
		for (char c : word1Array) {
			letters[c]++;
		}
		for (int i = 0; i < word2.length(); i++) {
			int c = (int) word2.charAt(i);
			letters[c]--;
			if (letters[c] < 0) {
				return false;
			}
			
			
		}
		
		return true;
		
	}

}