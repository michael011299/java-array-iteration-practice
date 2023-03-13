package iteration_practice;

public class iteration {

	public static void flowchart1(String args[]) {
		int a = 100;
		do {
			a++;
			System.out.println("A");
		} while (a >= 200);
	}

	public static void flowchart2(String args[]) {
		int a = 100;
		do {
			a += 2;
			if (a % 2 == 0) {
				System.out.println(".");
			} else {
				System.out.println("*");
			}
		} while (a <= 200);
	}

	public static void onetoten(String args[]) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
	}

}
