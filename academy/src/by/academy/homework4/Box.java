package by.academy.homework4;

public class Box<T> {
	private T[] items;
	private int size;

	@SuppressWarnings("unchecked")
	public Box() {
		super();
		items = (T[]) new Object[16];
	}

	public Box(int initCap) {
		super();
		items = (T[]) new Object[initCap];
	}

	public Box(T[] items) {
		super();
		this.items = items;
		size = items.length;
	}

	public T[] getItems() {
		return items;
	}

	public void setItems(T[] items) {
		this.items = items;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@SuppressWarnings("unchecked") // Увеличение массива
	private void growth() {
		T[] temp = (T[]) new Object[2 * items.length + 1];
		System.arraycopy(items, 0, temp, 0, items.length);
		items = temp;
	}

	public void add(T item) { // Добавление элемента
		if (size >= items.length) {
			growth();
		}
		items[size++] = item;
	}

	public void set(int index, T item) {

	}

	public T get(int index) { // Вызов элемента по индексу
		if (index >= size || index < 0) {
			System.out.println("Элемента с таким индексом нет");
			return null;
		} else {
			return items[index];
		}
	}

	public T getLast() { // Вызов последнего элемента массива
		return items[size - 1];
	}

	public T getFirst() { // Вызов первого элемента массива
		return items[0];
	}

	public int getLength() { // Вывод размера массива
		return items.length;
	}

	public int indexOf(Object o) { // Вызов последнего заполненного элемента в массиве
		return indexOfRange(o, 0, size);
	}

	int indexOfRange(Object o, int start, int end) {
		Object[] es = items;
		if (o == null) {
			for (int i = start; i < end; i++) {
				if (es[i] == null) {
					return i;
				}
			}
		} else {
			for (int i = start; i < end; i++) {
				if (o.equals(es[i])) {
					return i;
				}
			}
		}
		return -1;
	}

	public void remove(int index) { // Удаление элемента по индексу
		if (index >= size || index < 0) {
			System.out.println("Элемента с таким индексом нет");
			return;
		}
		if (index < size) {
			System.arraycopy(items, index + 1, items, index, size - index - 1);
		}
		items[--size] = null;
	}

	public void removeName(T obj) { // Удаление элемента по названию
		for (int i = 0; i < size - 1; i++) {
			if (items[i].equals(obj)) {
				System.arraycopy(items, i + 1, items, i, size - i - 1);
				items[--size] = null;
			}
		}
	}
}
