package by.academy.homework1;

import java.util.Scanner;

public class task2 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите тип данных: ");
		String i = scanner.nextLine();
		
		System.out.println("Введите переменную: ");
		int x = scanner.nextInt();
		
		switch (i) {
		case "int":
			System.out.println(x % 2);
			break;
		case "double":
			System.out.println(x*70/100);
			break;
		case "float":
			System.out.println(x*x);
			break;
		case "char":
			System.out.println((char)x);
			break;
		case "String":
			System.out.println("Hello " + x);
			break;
			default:
			System.out.println("Unsupported type");
		} scanner.close();
	}
}
