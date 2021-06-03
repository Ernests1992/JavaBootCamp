package sef.module8.activity;

import java.io.FileNotFoundException;
import java.io.FileReader;

//Needs to be completed
//1 - Find out the error in this program and share your finding with the instructor
public class ExceptionSequenceActivity {

	public static void main(String[] args) {

		ExceptionSequenceActivity exceptionSequenceActivity = new ExceptionSequenceActivity();
		ArithmeticExceptionActivity arithmeticExceptionActivity = new ArithmeticExceptionActivity();
		CustomExceptionActivityTest customExceptionActivityTest = new CustomExceptionActivityTest();
		SQLExceptionActivity sqlExceptionActivity = new SQLExceptionActivity();
		TryCatchFinallyActivity tryCatchFinallyActivity = new TryCatchFinallyActivity();

		System.out.println();
		System.out.println("Main sample:");
		exceptionSequenceActivity.divide(10, 0);
		System.out.println();
		System.out.println("Arithmetic exception:");
		arithmeticExceptionActivity.catchMe(10, 0);
		System.out.println();
		System.out.println("SQL exception:");
		sqlExceptionActivity.sqlTest();
		System.out.println();
		System.out.println("Custom exception:");
		try {
			customExceptionActivityTest.validateUser("James");
		}
		catch(CustomExceptionActivity e) {
			System.out.println("Exception type: " + e.getClass());
			System.out.println("Exception message: " + e.getMessage());
		}
		System.out.println();
		System.out.println("Array element out of bounds exception:");
		tryCatchFinallyActivity.arrayExceptionExample();
		System.out.println();
		System.out.println("File not found exception:");
		exceptionSequenceActivity.fileNotFoundTest();
	}

	void divide(int num1, int num2) {
		try {
			System.out.println(num1 / num2);
		}
		catch(Exception e) {
			try {
				System.out.println("Exception!!!");
				System.out.println(num1 / num2);
				//Added the previous line repeatedly, so that the nested try-catch is activated
			}
			catch(ArithmeticException a) {
				System.out.println("Division by zero is not allowed");
			}
		}
	}

	void fileNotFoundTest() {
		String fileName = "SomeFileThatDoesNotExist.txt";
		FileReader reader ;

		try {
			reader = new FileReader(fileName);
		}
		catch (FileNotFoundException e) {
			System.out.println("File " + fileName + " not found");
			System.out.println("Exception type: " + e.getClass());
			System.out.println("Exception message: " + e.getLocalizedMessage());
		}
	}
}
