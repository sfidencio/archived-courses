package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sebastiao Fidencio
 * 
 * filter predicates, removeIf, indexOf,elseThrow, Arrays.asList(..)
 */
public class ExampleFilterUsingPredicateList {
	public static void main(String[] args) {
		try {
		// Array(Vector) of fruits(strings or alfanumerics)
		String[] fruits = new String[] { "Banana", "Apple", "Kiwi", "Pear", "Lemon", "Orange", "Grape" };
		Integer[] numbers = new Integer[] { 1, 2, 3, 4, 5, 6, 7 };

		// Transform Array(Vector) in List(Interface), ArrayList implementation...
		List<String> fruitsList = Arrays.asList(fruits);
		List<Integer> numbersList = Arrays.asList(numbers);

		System.out.println("Filter list based on predicate (Feature java8+)");
		// Filter list based on predicate (Feature java8+) -
		// An integral part of the functional paradigm
		List<String> fruitsFilters1 = fruitsList
				.stream()
				.filter(x -> x.contains("iw") || x.contains("ea"))
				.collect(Collectors.toList());
		System.out.println(fruitsFilters1);

		System.out.println();
		System.out.println("Filter list using simple foreach");
		// Filter list using simple foreach -
		List<String> fruitsFilters2 = new ArrayList<>(0);
		for (String item : fruitsList) {
			if (item.contains("iw") || item.contains("ea")) {
				fruitsFilters2.add(item);
			}
		}
		System.out.println(fruitsFilters2);

		System.out.println();
		// Find first ocorrence with based in predicate
		Integer fruitsFilters3;
	
			fruitsFilters3 = numbersList
					.stream()
					.filter(x -> x < 2) //Change for 1, force exception
					.findFirst()
					//.orElse(null);
					.orElseThrow(()->new Exception("Nenhum numero encontrado!"));
			System.out.println(fruitsFilters3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}


	}
}
