package sef.module3.activity;

/**
 * @author Ernests Subhankulovs
 *
 */
public class OperatorActivity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// Declare numbers to be operated
		int i = 10;
		int j = 26;
		int result;

		if (i > 8) {
			result = i - j;
			System.out.println("Difference = " + result);
		}
		else {
			result = i + j;
			// Print result
			System.out.println("Addition = " + result);	
		}
		
	}

}
