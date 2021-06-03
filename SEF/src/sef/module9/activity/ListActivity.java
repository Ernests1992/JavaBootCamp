package sef.module9.activity;
//Needs to be completed

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;

public class ListActivity {

	public static void main(String[] args) {
		//1 - Type code to create a list of names. Use ArrayList.
		List namesList = new ArrayList();
		namesList.add("John");
		namesList.add("Mike");
		namesList.add("Shanti");
		namesList.add("Stacie");

		//2 - Call print method to print the list passed as its parameter.
		ListActivity listActivity = new ListActivity();
		listActivity.print(namesList);
	}
	
	public void print(List list)
	{
		//3 - Type code to print this list
		//Notice the order in which elements get printed.
		for (Object name: list) {
			System.out.println(name);
		}
	}
}
