package method_overloading;


public class App {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();
        // Example 1
        System.out.println(calc.add(1, 3)); 
        System.out.println(calc.add(1.0 , 1.5));

        // Example 2
        System.out.println(calc.add(7)); 
        System.out.println(calc.add(5, 6 , 3));

        // Example 3
        Player p1 = new Player("John");
        System.out.println(p1);
        Player p2 = new Player("Ben", 10);
        System.out.println(p2);
    }
}
