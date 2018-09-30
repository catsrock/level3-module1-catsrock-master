package _01_IntroToArrayLists;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		String[] carrot = new String[5];
		// 2. Add five Strings to your list
		carrot[0] = "blue";
		carrot[1] = "yellow";
		carrot[2] = "green";
		carrot[3] = "orange";
		carrot[4] = "red";
		// 3. Print all the Strings using a standard for-loop
		for (int i = 0; i < carrot.length; i++) {
			// System.out.println(carrot[i]);
		}

		// 4. Print all the Strings using a for-each loop
		for (String string : carrot) {
			// System.out.println(string);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < carrot.length; i += 2) {
			// System.out.println(carrot[i]);
		}
		// 6. Print all the Strings in reverse order.
		for (int i = carrot.length - 1; i >= 0; i--) {
			// System.out.println(carrot[i]);
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (String string : carrot) {
			if (string.contains("e")) {
				System.out.println(string);
			}
		}
	}
}
