package sef.module8.sample;
// Needs to be completed
public class ArrayExceptionSample {

	public static void main(String[] args) {
		
		//The valid indices for this array are from 0 to 4
		int[] scores = new int[5];
		
		//But the the loop below will run from 0 to 5.
		//Last index is 4 so accessing scores[5] will cause an exception
		//1 - Create a for loop that runs from 0-5. Print elements of this array inside the loop.
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(scores[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException arrEx) {
			System.out.println("Array element is out of bounds. Details: " + arrEx.getLocalizedMessage());
		}
		catch (ArithmeticException arithmEx) {
			System.out.println("An arithmetic exception occured. Details: " + arithmEx.getLocalizedMessage());
		}

		// The above loop is a logical error in the program which results in
		// ArrayIndexOutOfBoundsException. This is an example of Unchecked Exception.
		
	}
}
