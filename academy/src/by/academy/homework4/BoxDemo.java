package by.academy.homework4;

import java.util.Arrays;

public class BoxDemo {
	public static void main(String[] args) {
		Integer[] arrInt = { 1, 2, 3, 4, 5, 6 };
		Box<Integer> obj = new Box<>(arrInt);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.add(7);
		System.out.println(Arrays.toString(obj.getItems()));
		obj.remove(0);
		obj.removeName(5);
		System.out.println(Arrays.toString(obj.getItems()));
		System.out.println(obj.get(0));
		System.out.println(obj.getLast());
		System.out.println(obj.getFirst());
		System.out.println(obj.getLength());
	}
}
