package sef.final_task.bonus_activity;

import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        FibonacciNumbers fibonacciNumbers = new FibonacciNumbers();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the largest number for the Fibonacci sequence:");
        int initialNumber = scanner.nextInt();
        fibonacciNumbers.calculateFibonacciSequence(initialNumber);
    }

    public void calculateFibonacciSequence(int initialNumber) {
        int previousNumber = 0;
        int nextNumber = 1;
        int i = 1;
        System.out.println();
        System.out.println("Fibonacci number series for " + initialNumber + " is:");
        while (i <= initialNumber) {
            System.out.print(previousNumber + " ");
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            i++;
        }
    }
}
