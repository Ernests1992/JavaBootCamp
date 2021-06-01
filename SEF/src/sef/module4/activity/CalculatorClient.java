package sef.module4.activity;

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

		System.out.println("*** Calculations will be performed using "+normalCalc.getCalculatorType()+ " calculator ***");

		// Add
		int x = 4;
		int y = 5;
		int result = normalCalc.add(x, y);
		System.out.println("1) Addition result is: " + x + " + " + y + " = " + result);

		// Multiply
		int[] mul = {2, 3, 4};
		String multipliedNumbers = "";
		for (int i = 0; i < mul.length; i++) {
			multipliedNumbers = multipliedNumbers + mul[i];
			if (i < mul.length - 1) {
				multipliedNumbers = multipliedNumbers + " * ";
			}
		}
		result = normalCalc.multiply(mul);
		System.out.println("2) Multiplication result is: " + multipliedNumbers + " = " + result);

		// Subtract
		x = 5;
		y = 4;
		result = normalCalc.subtract(x, y);
		System.out.println("3) Subtraction result is: " + x + " - " + y + " = " + result);

		// Divide
		x = 4;
		y = 2;
		result = normalCalc.divide(x, y);
		System.out.println("4) Division result is: " + x + " / " + y + " = " + result);
	}

}