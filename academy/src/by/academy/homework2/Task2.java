package by.academy.homework2;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Введите слова для анализа:");
	String s = scanner.nextLine();

	String[] words = s.split("\\s+");
	for (int i = 0; i < words.length; i++) {
	    words[i] = words[i].replaceAll("[^\\w]", "");
	    
	    Arrays.sort(words);
	    System.out.println(Arrays.toString(words));
	    
	}scanner.close();
	}
}
	

