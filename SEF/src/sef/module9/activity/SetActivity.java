package sef.module9.activity;

//Needs to be completed
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetActivity {

	public static void main(String[] args) {
		//1 - Type code to create a set of names.
		//Names must be sorted by their natural order.
		//Do research to find if you already have such a class. 
		//Also try adding a few duplicate entries to this set.
		Set nameSet = new HashSet();
		nameSet.add("Jair");
		nameSet.add("Jarrett");
		nameSet.add("Jay");
		nameSet.add("John");
		nameSet.add("Laurel");
		nameSet.add("Lia");
		nameSet.add("Mike");
		nameSet.add("Shanti");
		nameSet.add("Shanti");
		nameSet.add("Stacie");
		nameSet.add("Stacie");
		nameSet.add("Zachary");
		nameSet.add("Zachary");
		
		//2 - Call print method to print the set passed as its parameter.
		SetActivity setActivity = new SetActivity();
		setActivity.print(nameSet);
	}
	
	void print(Set set)
	{
		//3 - Type code to print this set
		//Notice the order in which elements get printed.
		Iterator i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
