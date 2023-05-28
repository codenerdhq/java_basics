package shadowing;


public class App {
    public static void main(String[] args) throws Exception {
        Shadowing shadow = new Shadowing();
        System.out.println(shadow.number);
        System.out.println(shadow.get_number_with_local_var());
        System.out.println(shadow.get_number_with_arg(3));
        shadow.print_numbers();
    }
}

