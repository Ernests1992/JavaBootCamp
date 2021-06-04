package sef.final_task.bonus_activity;

import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {

    public static void main(String[] args) {
        boolean endProgram = false;
        Calculator calculator = new Calculator();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Choose the operation You would like to perform.");
            System.out.println();
            System.out.println("Enter the corresponding symbol and hit <ENTER>:");
            System.out.println("+ - addition");
            System.out.println("- - subtraction");
            System.out.println("* - multiplication");
            System.out.println("/ - division");
            System.out.println("! = close the program");
            String enteredSymbol = scanner.nextLine();

            switch (enteredSymbol) {
                case ("+") -> {
                    System.out.println("Addition:");
                    int a = calculator.operandInput("1st");
                    int b = calculator.operandInput("2nd");
                    System.out.println(a + " + " + b + " = " + calculator.getSum(a, b));
                }
                case ("-") -> {
                    System.out.println("Subtraction:");
                    int a = calculator.operandInput("1st");
                    int b = calculator.operandInput("2nd");
                    System.out.println(a + " - " + b + " = " + calculator.getDifference(a, b));
                }
                case ("*") -> {
                    System.out.println("Multiplication:");
                    int a = calculator.operandInput("1st");
                    int b = calculator.operandInput("2nd");
                    System.out.println(a + " * " + b + " = " + calculator.getProduct(a, b));
                }
                case ("/") -> {
                    System.out.println("Division:");
                    int a = calculator.operandInput("1st");
                    int b = calculator.operandInput("2nd");
                    System.out.println(a + " / " + b + " = " + calculator.getQuotient(a, b));
                }
                case ("!") -> {
                    System.out.println("Exiting program.");
                    System.out.println("Thank you!");
                    endProgram = true;
                }
                default -> System.out.println("Please enter one of the provided symbols!");
            }
        } while (!endProgram);
    }

    public int getSum(int a, int b) {
        return a + b;
    }

    public int getDifference(int a, int b) {
        return a - b;
    }

    public double getProduct(double a, double b) {
        return a * b;
    }

    public double getQuotient(double a, double b) {
        try {
            return a / b;
        }
        catch(ArithmeticException arrEx) {
            System.out.println("An arithmetic exception occurred. Detail: " + arrEx.getLocalizedMessage());
            System.out.println("Division by Zero is not allowed!");
            return 0;
        }
    }

    public int operandInput(String operandNumber) {
        int operand;
        boolean exceptionOccurred;
        Scanner scanner = new Scanner(System.in);
        do {
            exceptionOccurred = false;
            System.out.println("Enter " + operandNumber + " operand:");
            try {
                operand = Integer.parseInt(scanner.nextLine());
            }
            catch (InputMismatchException inEx) {
                System.out.println("Exception type: " + inEx.getClass());
                System.out.println("Exception detail: " + inEx.getLocalizedMessage());
                System.out.println("The value of the operand should be numeric!");
                exceptionOccurred = true;
                operand = 0;
            }
            catch (NumberFormatException nFEx) {
                System.out.println("Exception type: " + nFEx.getClass());
                System.out.println("Exception detail: " + nFEx.getLocalizedMessage());
                System.out.println();
                System.out.println("The value of the operand should be numeric!");
                System.out.println();
                exceptionOccurred = true;
                operand = 0;
            }
        } while (exceptionOccurred);
        return operand;
    }
}
