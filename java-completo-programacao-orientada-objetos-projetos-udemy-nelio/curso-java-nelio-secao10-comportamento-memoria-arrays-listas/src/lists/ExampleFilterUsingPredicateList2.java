package lists;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sebastiao Fidencio
 * 
 *  filter predicates, removeIf, indexOf
 * using lambda function in predicates
 */
public class ExampleFilterUsingPredicateList2 {
	public static void main(String[] args) {
		try {
			List<String> names = new ArrayList<>(0);
			System.out.println("Adding elements");
			names.add("Fidencio");
			names.add("Henry");
			names.add("Talita");
			System.out.println("Current status of the list in memory.");
			names.forEach(item -> {
				System.out.println(item);
			});
			System.out.println();
			System.out.println("Here we will insert in position 0");
			names.add(0, "Sofia");
			System.out.println("Current status after inserted [Sofia].");
			names.forEach(item -> {
				System.out.println(item);
			});
			
			System.out.println("");
			System.out.println("Size: " + names.size());
			
			System.out.println("Remove with predicate.");
			System.out.println("Was Removed? => " + names.removeIf(x-> x.startsWith("Sofia")));
			System.out.println("Current status after removed [Sofia].");
			names.forEach(item -> {
				System.out.println(item);
			});
			
			System.out.println("");
			System.out.println("Size: " + names.size());
			
			System.out.println("");
			System.out.println("Testing indexOf: " + names.indexOf("Fidencio"));
			
					
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
