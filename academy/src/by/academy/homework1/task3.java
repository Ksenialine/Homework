package by.academy.homework1;

import java.util.Scanner;

public class task3 {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in); {
		System.out.println("¬ведите число от 1 до 10:");
		int x = scanner.nextInt();
		
		if (x >= 1 && x <= 10) {
			
			int i = x; /*число*/
			int y = 1; /*умножение*/
			int r = 1; /*результат*/
			
			while (y<=10) {
				r = i * y;
				System.out.println(i + "*" + y + "=" + r);
				y++;
				}
		} else
			System.out.println("ќшибка, число должно быть от 1 до 10.");
		} scanner.close();
	}
}