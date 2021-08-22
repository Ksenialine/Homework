package by.academy.homework6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class Task1_2_3_5main {

	// 1 задача
	public static <T> Collection<T> removeDuplicates(Collection<T> collection) {
		return new HashSet<>(collection);
	}

	// 2 задача
	public static void compare2Lists() {
		ArrayList<Double> arrayList = new ArrayList<>();
		LinkedList<Double> linkedList = new LinkedList<>();
		final int N = 1_000_000;
		final int M = 1000;
		for (int i = 0; i < N; i++) {
			arrayList.add(Math.random());
			linkedList.add(Math.random());
		}
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < M; i++) {
			arrayList.get((int) (Math.random() * (N - 1)));
		}
		System.out.println(System.currentTimeMillis() - startTime);

		startTime = System.currentTimeMillis();
		for (int i = 0; i < M; i++) {
			linkedList.get((int) (Math.random() * (N - 1)));
		}
		System.out.println(System.currentTimeMillis() - startTime);
	}

	// 3 задача - проверка
	public static void main(String[] args) {

		Integer[][] twoArray = { { 1, 2, 3 }, { 2, 0, 2 }, { 8, 7, 6 } };

		ArrayTwoIterator<Integer> iter = new ArrayTwoIterator<Integer>(twoArray);
		while (iter.hasNext()) {
			System.out.println(iter.next());

		}
	}

	// 5 задача
	void dictionary(String text) {
		text = text.toLowerCase();

		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < text.length(); i++) {
			char ch = text.charAt(i);

			if ((ch >= 'а' && ch <= 'я') || ch == 'ё') {
				map.compute(ch, (character, integer) -> integer == null ? 1 : integer + 1);
			}
		}

		ArrayList<Map.Entry<Character, Integer>> entries = new ArrayList<>(map.entrySet());
		entries.sort((o1, o2) -> Character.compare(o1.getKey(), o2.getKey()));
		for (Map.Entry<Character, Integer> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
}
