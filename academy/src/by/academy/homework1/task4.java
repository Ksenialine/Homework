package by.academy.homework1;

public class task4 {
	public static void main (String[] args) {
		int x = 2;
		int s = 1; /*степень*/
		int r = x; /*результат*/
		
		do {
			System.out.println(x + " в степени " + s + " = " + r);
			s++;
			r = r * x;
		}
		while (r<1000000);
		}
	}
