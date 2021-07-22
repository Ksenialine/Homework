package by.academy.homework2;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Введите два слова для сравнения:");
		String w1 = scanner.nextLine();
		String w2 = scanner.nextLine();
		
		int w12 = w1.length();
		int w22 = w2.length();
		
		String w13 = w1.substring(0, (w12/2));
		String w23 = w2.substring((w22/2),w22);
		
		w13 = w13.concat(w23);
		System.out.println("Результат: " + w13);

		scanner.close(); 
	} 
}
