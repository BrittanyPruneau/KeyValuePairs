package keyValue;

import java.util.*;
import java.util.List;
/**
 * Demonstrates the use of Generic Class methods and the KeyValuePair class.
 * 
 * @author Brittany Pruneau 
 *
 */
public class TestClient
{
	public static void main(String[] args)
	{
		System.out.println("Part 1:\n-------");
		KeyValuePair<String, Integer> p1 = new KeyValuePair<>("SLC", 189899);
		KeyValuePair<String, Integer> p2 = new KeyValuePair<>("NY", 8244910);
		KeyValuePair<String, Integer> p3 = p2;
		System.out.println("p1: " + p1);
		System.out.println("p2: " + p2);
		System.out.println("p1.equals(p2): " + p1.equals(p2));
		System.out.println("p3: " + p3);
		System.out.println("p2.equals(p3): " + p2.equals(p3));
		System.out.println();
		
		System.out.println("Part 2:\n-------");
		KeyValuePair<String, Integer> p4 = new KeyValuePair<>("LA", 3819702);
		KeyValuePair<String, Integer> p5 = new KeyValuePair<>("SF", 189899);
		List<KeyValuePair<String, Integer>> cities = new ArrayList<>();
		cities.add(p1);
		cities.add(p2);
		cities.add(p3);
		cities.add(p4);
		cities.add(p5);
		System.out.println("Original list: ");
		cities.forEach(n -> System.out.println(n));
		System.out.println();
		System.out.println("Sorted list:  ");
		Collections.sort(cities);
		cities.forEach(n -> System.out.println(n));
		System.out.println();
		
		System.out.println("Part 3:\n-------");
		System.out.println("Cities with margin 5:");
		printWithMargin(cities,5);
		Set<KeyValuePair<Integer, String>> countryCodes = new TreeSet<>();
		countryCodes.add(new KeyValuePair<>(30, "Greece")); 
		countryCodes.add(new KeyValuePair<>(33, "France")); 
		countryCodes.add(new KeyValuePair<>(43, "France")); 
		System.out.println("Country codes with margin 3:");
		printWithMargin(countryCodes, 3);
	}

	/*
	 * Receives any type of Collection and prints each element with a user specified indentation. 
	 */
	public static <T> void printWithMargin(Collection<T> collection, int indentation)
	{
		String margin = ""; 
		for(int i = 0; i< indentation; i++)
		{
			margin+=" ";
		}
		final String margins = margin;
		collection.forEach(n-> System.out.println(margins+n));
	}
}
