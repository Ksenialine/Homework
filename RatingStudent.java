package by.academy.homework6;

import java.util.Iterator;

public class RatingStudent {
	public static void main(String[] args) {

		int n = 10;
		int[] rating = new int[n];
		for (int i = 0; i < rating.length; i++) {
			rating[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < rating.length; i++) {
			System.out.print(" " + rating[i] + " ");
		}

		int maxRat = 0;
		int temp;
		Iterator<Integer> itr = new Iterator<Integer>(rating);
		while (itr.hasNext()) {
			temp = itr.next();
			if (maxRat < temp) {
				maxRat = temp;
			}
		}
		System.out.println("Самая высокая оценка - " + maxRat);
	}
}
