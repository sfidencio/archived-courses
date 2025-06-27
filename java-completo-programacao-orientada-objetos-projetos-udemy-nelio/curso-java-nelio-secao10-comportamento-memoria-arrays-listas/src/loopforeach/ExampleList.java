package loopforeach;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Sebastiao Fidencio
 * 
 *  uses insert, remove,size
 */
public class ExampleList {
	public static void main(String[] args) {
		// Locale.setDefault(Locale.US);
		List<Double> ages = new ArrayList<Double>(0);// inialize zero
		ages.add(Math.random() * Math.PI);
		ages.add(Math.random() * Math.PI);
		ages.add(Math.random() * Math.PI);
		ages.add(Math.random() * Math.PI);
		ages.add(Math.random() * Math.PI);
		ages.add(Math.random() * Math.PI);
		ages.add(Math.random() * Math.PI);
		ages.add(Math.random() * Math.PI);
		ages.add(Math.random() * Math.PI);
		ages.add(Math.random() * Math.PI);

		System.out.println();
		ages.forEach(item -> {
			System.out.println(item);
		});

		System.out.println();
		System.out.println("Size list: " + ages.size());
		System.out.println();
		System.out.println("Get element position 2: " + ages.get(1));// index start zero, in java, c/c++
		System.out.println();
		System.out.println("Insert element with <<add>>: " + ages.add(2.99));
		System.out.println();
		ages.add(0,2.25);
		System.out.println("Get insert in positon zero <<get>>: " + ages.get(0));
		System.out.println();
		System.out.println("Remove element(index) position zero: " + ages.remove(0));
		System.out.println();
		System.out.println("Remove element object: " + ages.remove(ages.get(0)));
		
		
		
		
	}
}
