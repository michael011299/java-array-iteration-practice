package arrays_practice;

public class arrays_practice {
	public static int[] task1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	public static void main(String args[]) {
		for (int i : task1)
			System.out.println("Number: " + i);

		for (int i = 1; i <= task1.length; i++) {
			int j = i * 10;
			System.out.println("Number " + j);
		}
	}
}
