package by.academy.homework2;

import java.util.Scanner;

public class Task1 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите два слова для анализа:");
		String i = scanner.nextLine();
		String g = scanner.nextLine();
		
		char[] word1 = i.toCharArray();
		for (int x = 0; x < word1.length; x++)
			System.out.println("Element [" + x + "]:" + word1[x]);
		char[] word2 = g.toCharArray();
		for (int y = 0; y < word2.length; y++)
			System.out.println("Element [" + y + "]:" + word2[y]);
		
		int len1 = word1.length;
		int len2 = word2.length;
		
		for (var a = 0; a < len1; ++a) {
			var cac = word1[a];
			for (var b = 0; b < len2; ++b) {
				if(cac == word2[b]) {
					System.out.print("совпадение" + cac);
					break;
				}	
			}	
		}
        scanner.close();
	}
}
