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
        // Default constructor.
        // If this is used,
        // num1 and num2 will be initialized
        // with 0
    }

    public int addition() {
        // Local variable
        int sum;  // sum only exist within this method
        sum = this.num1 + this.num2;
        return sum;
    }
    
    // THIS IS COMMENTED ON PURPOSE
    // THIS WOULD RETURN AN ERROR 
    // AS some_number DOES NOT GET 
    // A DEFAULT VALUE
    // public int addition() {
    //     int some_number;
    //     return some_number;
    // }

}

