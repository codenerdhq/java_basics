package method_overloading;

public class Calculator {
    // Example 1
    public int add(int num1, int num2) {
        System.out.println("I return an INT");
        return num1 + num2;
    }
    // Example 1
    public double add(double num1, double num2) {
        System.out.println("I return a DOUBLE");
        return num1 + num2;
    }

    // Example 2
    public int add(int num1) {
        System.out.println("Sum of 1 number");
        return num1;
    }
    // Example 2
    public int add(int num1, int num2, int num3) {
        System.out.println("Sum of 3 numbers");
        return num1 + num2 + num3;
    }
}
