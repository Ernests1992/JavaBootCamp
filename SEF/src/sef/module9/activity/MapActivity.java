package sef.module9.activity;
//Needs to be completed

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;

public class MapActivity {

	static String temp = "My Testing";
	static Map<String, String> namesMap = new HashMap<String, String>();

	public static void main(String[] args) {
		//1 - Type code to create a HashMap of key value pair
		//where key is id of type String and value is a name
		namesMap.put("1", "John");
		namesMap.put("2", "Mike");
		namesMap.put("3", "Shanti");
		namesMap.put("4", "Stacie");
		namesMap.put("5", "Zachary");
		namesMap.put("6", "Jarrett");
		namesMap.put("7", "Jair");
		namesMap.put("8", "Lia");
		namesMap.put("9", "Laurel");
		namesMap.put("10", "Jay");

		Set<String> keySet = namesMap.keySet();
		Iterator it = keySet.iterator();

		//2 - Call print method to print the map passed as its parameter.

		System.out.println("With a for-each loop:");
		System.out.println(("Key \t:\t Value"));
		for (String key: keySet) {
			print((key) + " \t:\t " + namesMap.get(key) + "\n");
		}

		System.out.println();

		System.out.println("With a for loop:");
		print1(10);

		System.out.println("With an iterator:");
		System.out.println(("Key \t:\t Value"));
		while (it.hasNext()) {
			String key = (String) it.next();
			String printableString = key + "\t:\t" + namesMap.get(key);
			print2(printableString);
		}
		System.out.println();

		System.out.println("With a for-each loop, with the HasMap being passed to the method as a parameter:");
		print3(namesMap);
	}
		
	static void print(String test) {
		System.out.print(test.toUpperCase());
	}
	static void print1(int a) {
		//int a = 10;
		System.out.println(("Key \t:\t Value"));
		for (int i = 0 ; i < a; i++) {
			System.out.println((i + 1) + " \t:\t " + namesMap.get(String.valueOf(i + 1)));
		}
		System.out.println();
		
	}

	static void print2(String test) {
		System.out.println(test.toUpperCase());
	}

	static void print3(Map map) {
		System.out.println(("Key \t:\t Value"));
		Set<String> keySet = namesMap.keySet();
		for (String key : keySet) {
			System.out.println((key) + " \t:\t " + namesMap.get(key));
		}
		System.out.println();
	}
}
