package loopforeach;

import java.util.Arrays;
import java.util.List;
/**
 * @author Sebastiao Fidencio
 * 
 *  uses for, foreach, foreach(functional lambda)
 */
public class Main {
	public static void main(String[] args) {
		String[] fruits = new String[] { "Banana", "Apple", "Kiwi", "Pear", "Lemon", "Orange", "Grape" };
		System.out.println("");
		System.out.println("Listing using for index simple");
		// Using a simple for loop, this uses index to access element.
		for (int i = 0; i < fruits.length; i++) {
			System.out.println(fruits[i]);
		}
		System.out.println("");
		System.out.println("Listing using for each simple");
		// Using for each(interact with objects) loop
		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// Using for each functional
		System.out.println("");
		System.out.println("Listing using for each funcional");
		List<String> fruitsList = Arrays.asList(fruits); // Convert Array[vector] of string in ArrayList
		fruitsList.forEach(item -> {
			System.out.println(item);
		});
	}
}
