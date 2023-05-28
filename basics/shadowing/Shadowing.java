package shadowing;

public class Shadowing {

    public int number = 1;

    public int get_number_with_local_var() {
        int number = 2;
        return number;
    }

    public int get_number_with_arg(int number) {
        return number;
    }
    
    public void print_numbers() {
        int number = 8;
        System.out.println("Instance var: " + this.number);
        System.out.println("Local var: " + number);
    }
    
}
