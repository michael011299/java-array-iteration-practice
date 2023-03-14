package arraylistpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylistpractice {

	public static void main(String[] args) {

		public List<String> foods = new ArrayList<>();

		foods.add("Chicken");
		foods.add("Burgers");
		foods.add("cereal");
		foods.add("Sandwiches");

		System.out.println("Added: " + foods);

		for (int i = 0; i < foods.size(); i++) {
			System.out.println(foods.get(i));
		}

		foods.remove("cereal");
		foods.remove("Chicken");
		System.out.println("Removed" + foods);

		foods.add("Chicken");
		foods.add("Burgers");
		foods.add("cereal");
		foods.add("Sandwiches");
		Collections.sort(foods);
		System.out.println("Sorted: " + foods);

		foods.set(0, "BLT");
		foods.set(1, "tuna mayo");
		System.out.println("Set: " + foods);
	}
}