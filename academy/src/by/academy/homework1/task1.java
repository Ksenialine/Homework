package by.academy.homework1;

import java.util.Scanner;

public class task1 {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите сумму покупки: ");
		int i = scanner.nextInt();
		
		System.out.println("Введите возраст покупателя: ");
		int x = scanner.nextInt();
		
		if (i>0 && i<100) {
			System.out.println("Итоговая стоимость с учетом скидки " + (i*95)/100 + " руб.");
		} else if (i>=100 && i<200) {
			System.out.println("Итоговая стоимость с учетом скидки " + (i*93)/100 + " руб.");
		} else if (i>=200 && i<300 && x<=18) {
			System.out.println("Итоговая стоимость с учетом скидки " + (i*91)/100 + " руб.");
		} else if (i>=200 && i<300 && x>=18) {
			System.out.println("Итоговая стоимость с учетом скидки " + (i*84)/100 + " руб.");
		} else if (i>=300 && i<400) {
			System.out.println("Итоговая стоимость с учетом скидки " + (i*85)/100 + " руб.");
		} else if (i>=400) {
			System.out.println("Итоговая стоимость с учетом скидки " + (i*80)/100 + " руб.");
		}	scanner.close(); 
	 } 

}
