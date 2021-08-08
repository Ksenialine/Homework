package by.academy.homework4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<>();
		arrayList.add("H");
		arrayList.add("E");
		arrayList.add("L");
		arrayList.add("L");
		arrayList.add("O");

		Iterator<String> iterator = arrayList.iterator();

		while (iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element + " ");
		}

	}

}
