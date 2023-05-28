package instance_local_vars;

public class Calculator {
    // Instance variables
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculator() {
        
    }

    public int addition() {
        // Local variable
        int sum;
        sum = this.num1 + this.num2;
        return sum;
    }
    
}

