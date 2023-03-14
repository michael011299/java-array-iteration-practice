package advancedloops;

public class advancedloops {
	public String[] nameArray = { "Matthew", "John", "Joseph", "Judas" };

	public void printStringArray(String[] nameArray) {
		for (String str : nameArray) {
			System.out.println(str);
		}
	}

	public int[] numArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

	public void printNumArray(int[] intArray) {
		for (int i : numArray) {
			int j = i * i;
			System.out.println(j);
		}
	}

	public void trueFalse(int[] intArray) {
		for (int i : numArray) {
			if (i % 2 == 0)
				System.out.println("true " + i);
			else
				System.out.println("false " + i);

		}
	}

	public void squareOrCube(int[] intArray) {
		for (int i : numArray) {
			if (i % 2 == 0) {
				int j = i * i * i;
				System.out.println(j);
			} else {
				int j = i * i;
				System.out.println(j);
			}
		}
	}

}
