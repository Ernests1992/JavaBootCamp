package sef.module8.activity;
//Needs to be completed
//The following program, when run, results in an exception.
//1 - Use try catch appropriately to make sure that the exception is caught and a user friendly message is displayed. 

public class TryCatchFinallyActivity {
	public static void main(String[] args) {
		TryCatchFinallyActivity obj = new TryCatchFinallyActivity();
		obj.catchMeIfYouCan(); //This failed

		System.out.println("You are visitor Number 100");
	}

	void catchMeIfYouCan()
	{
		try {
			int [] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

			for(int i = 0; i <= 10; i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(Exception e) {
			System.out.println("You have entered catch block");
			System.out.println("An exception has occurred. Exception detail: " + e.getLocalizedMessage());
			try {
				System.out.println(10 / 0);
			}
			catch(ArithmeticException a) {
				System.out.println("Division by Zero is not allowed!");
			}
			finally {
				System.out.println("This is a finally block inside the catch statement.");
			}
		}
		finally {
			System.out.println("This is finally block");
			System.out.println("This should get printed even if there is an exception");
		}
	}

	public void arrayExceptionExample() {
		try {
			int [] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

			for(int i = 10; i <= 11; i++)
			{
				System.out.println(arr[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException arrEx) {
			System.out.println("Exception type: " + arrEx.getClass());
			System.out.println("Exception detail: " + arrEx.getLocalizedMessage());
		}
	}
}
