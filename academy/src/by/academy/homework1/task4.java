package by.academy.homework1;

public class task4 {
	public static void main (String[] args) {
		int x = 2;
		int s = 1; /*�������*/
		int r = x; /*���������*/
		
		do {
			System.out.println(x + " � ������� " + s + " = " + r);
			s++;
			r = r * x;
		}
		while (r<1000000);
		}
	}
