package by.academy.homework6;

public class ArraySmall {

	public static void main(String[] args) {
		int x = 8;
		int nums[] = new int[x];

		try {
			nums[0] = 1;
			nums[1] = 1;
			nums[2] = 1;
			nums[3] = 1;
			nums[4] = 1;
			nums[5] = 1;
			nums[6] = 1;
			nums[7] = 1;
			nums[8] = 1;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is to small, expand the array");
		}
	}
}
