package by.academy.homework1;

import java.util.Scanner;

public class task3 {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner (System.in); {
		System.out.println("������� ����� �� 1 �� 10:");
		int x = scanner.nextInt();
		
		if (x >= 1 && x <= 10) {
			
			int i = x; /*�����*/
			int y = 1; /*���������*/
			int r = 1; /*���������*/
			
			while (y<=10) {
				r = i * y;
				System.out.println(i + "*" + y + "=" + r);
				y++;
				}
		} else
			System.out.println("������, ����� ������ ���� �� 1 �� 10.");
		} scanner.close();
	}
}