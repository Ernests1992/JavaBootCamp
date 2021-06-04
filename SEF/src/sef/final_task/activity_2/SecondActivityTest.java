package sef.final_task.activity_2;
// Complete Code
import junit.framework.TestCase;
import sef.final_task.activity_2.SecondActivity;

public class SecondActivityTest extends TestCase {

	private SecondActivity theCalculator;

	protected void setUp() throws Exception {
		super.setUp();
		//	Initialize variables to be used here
		theCalculator = new SecondActivity();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}


	public void testGetSum() {
		int a = 5;
		int b = 10;			
		//	Checks the sum of two (2) positive values
		assertEquals(15, (theCalculator.getSum(a, b)));
		assertEquals(15, (theCalculator.getSum(b, a)));

		a = -5;		
		b = 10;		
		//	Checks the sum of a positive value and a negative value
		assertEquals(5, (theCalculator.getSum(a, b)));
		assertEquals(5, (theCalculator.getSum(b, a)));
		
		a = -5;		
		b = -10;		
		//	Checks the sum of two (2) negative values
		assertEquals(-15, (theCalculator.getSum(a, b)));
		assertEquals(-15, (theCalculator.getSum(b, a)));

		a = 5;
		b = 0;
		//	Checks the sum of a positive value and a zero (0)
		assertEquals(5, (theCalculator.getSum(a, b)));
		assertEquals(5, (theCalculator.getSum(b, a)));

		a = -5;
		b = 0;
		//	Checks the sum of a negative value and a zero (0)
		assertEquals(-5, (theCalculator.getSum(a, b)));
		assertEquals(-5, (theCalculator.getSum(b, a)));
	}

	public void testGetDifference() {
		
		int a = 3;
		int b = 2;		
		//	Checks the difference if b is lesser than a
		assertEquals(1, (theCalculator.getDifference(a, b)));
		//	Checks the difference if b is greater than a
		assertEquals(-1, (theCalculator.getDifference(b, a)));

		a = 5;
		b = -4;
		//	Checks if negative value is subtracted from positive value
		assertEquals(9, (theCalculator.getDifference(a, b)));
		//	Checks if positive value is subtracted from negative value
		assertEquals(-9, (theCalculator.getDifference(b, a)));
	
		a = -10;
		b = -5;
		//	Checks if negative value is subtracted from negative value: a < b
		assertEquals(-5, (theCalculator.getDifference(a, b)));
		//	Checks if negative value is subtracted from negative value: b > a
		assertEquals(5, (theCalculator.getDifference(b, a)));

		a = -10;
		b = 0;
		//	Checks if a negative value is subtracted from zero (0): a < b
		assertEquals(-10, (theCalculator.getDifference(a, b)));
		//	Checks if a negative value is subtracted from zero (0): b > a
		assertEquals(10, (theCalculator.getDifference(b, a)));
	}

	public void testGetProduct() {
		double a = 5;
		double b = 10;			
		//	Checks the product of two (2) positive values
		assertEquals(50, (theCalculator.getProduct(a, b)),0);
		assertEquals(50, (theCalculator.getProduct(b, a)),0);

		a = -5;		
		b = 10;		
		//	Checks the product of a positive value and a negative value
		assertEquals(-50, (theCalculator.getProduct(a, b)),0);
		assertEquals(-50, (theCalculator.getProduct(b, a)),0);
		
		a = -5;
		b = -10;		
		//	Checks the product of two (2) negative values
		assertEquals(50, (theCalculator.getProduct(a, b)),0);
		assertEquals(50, (theCalculator.getProduct(b, a)),0);

		a = 5;
		b = 0;
		//	Checks the product of a positive value and a zero (0)
		assertEquals(0, (theCalculator.getProduct(a,b)),0);
		assertEquals(0, (theCalculator.getProduct(b,a)),0);

		a = -5;
		b = 0;
		//	Checks the product of a negative value and a zero (0)
		assertEquals(0, (theCalculator.getProduct(a, b)),0);
		assertEquals(0, (theCalculator.getProduct(b, a)),0);
	}

	public void testGetQuotient() {

		double a = 10;
		double b = 5;
		//	Checks the division if b is lesser than a
		assertEquals(2, (theCalculator.getQuotient(a, b)),0);
		//	Checks the division if b is greater than a
		assertEquals(0.5, (theCalculator.getQuotient(b, a)),0);

		a = 9;
		b = -3;
		//	Checks if a positive value is divided with a negative value
		assertEquals(-3, (theCalculator.getQuotient(a, b)),0);
		//	Checks if a negative value is divided with a positive value
		assertEquals(-0.33, (theCalculator.getQuotient(b, a)),0.007);
	
		a = -10;
		b = -5;
		//	Checks if a negative value is divided with negative value: a < b
		assertEquals(2, (theCalculator.getQuotient(a, b)),0);
		//	Checks if negative value is divided with negative value: b > a
		assertEquals(0.5, (theCalculator.getQuotient(b, a)),0);

		// Checks if zero (0) is divided by a positive value
		a = 0;
		assertEquals(0, (theCalculator.getQuotient(a, b)),0);

	}

	public void testThrowException() {
		//Checks if division by zero (0) throws an exception
		try {
			theCalculator.getQuotient(1, 0);
			new SecondActivity();
		} catch (Exception e) {
			fail();
		}
		catch (Error e) {
			fail();
		}
	}
}


