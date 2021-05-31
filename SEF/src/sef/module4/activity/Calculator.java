/**
 * 
 */
package sef.module4.activity;

/**
 * @author Ernests Subhankulovs
 *
 */


public class Calculator {

	
	private String calculatorType;
	public static final String CALC_TYPE_BASIC = "Basic";
	
	// Default constructor
	public Calculator() {

	}
	
	// Parameterized constructor
	public Calculator(String calculatorType) {
		this.calculatorType = calculatorType;
	}

	// Getter for CalculatorType
	public String getCalculatorType() {
		return calculatorType;
	}

	// Setter for CalculatorType
	public void setCalculatorType(String calculatorType) {
		this.calculatorType = calculatorType;
	}
	
	// Add 
	public int add(int x, int y) {
		int sum = x + y;
		return sum;
	}

	// Subtract
	public int subtract(int x, int y) {
		int sub = x - y;
		return sub;
	}

	// Multiply
	public int multiply(int x, int y) {
		int mul = x * y;
		return mul;
	}

	// Divide
	public int divide(int x, int y) {
		int div;
		if (y == 0) {
			div = 0;
			System.out.println("Division by Zero is not allowed!");
		} else {
			div = x / y;
		}
		return div;
	}
}
