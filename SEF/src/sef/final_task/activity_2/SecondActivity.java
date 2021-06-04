package sef.final_task.activity_2;

public class SecondActivity {

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
}
