package sef.module4.activity;

import java.util.Scanner;

/**
 * @author Ernests Subhankulovs
 *
 */
public class CalculatorClient {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		/*Instantiate Normal Calculator. Note that CALC_TYPE_NORMAL is a public static
		 *final variable defined in Calculator class. 
		*/
		Calculator normalCalc = new Calculator(Calculator.CALC_TYPE_BASIC);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("*** Calculations will be performed using " + normalCalc.getCalculatorType() + " calculator ***");

		//Setting variables
		System.out.println("Enter x:");
		int x = scanner.nextInt();
		System.out.println("Enter y:");
		int y = scanner.nextInt();

		// Add
		int result = normalCalc.add(x, y);
		System.out.println("1) Addition result is: " + x + " + " + y + " = " + result);

		// Subtract
		result = normalCalc.subtract(x, y);
		System.out.println("2) Subtraction result is: " + x + " - " + y + " = " + result);

		// Multiply
		result = normalCalc.multiply(x, y);
		System.out.println("3) Multiplication result is: " + x + " * " + y + " = " + result);

		// Divide
		result = normalCalc.divide(x, y);
		System.out.println("4) Division result is: " + x + " / " + y + " = " + result);

	}
}
