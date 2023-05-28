package static_members;


public class App {
    public static void main(String[] args) throws Exception {
        new Counter();
        new Counter();
        System.out.println(Counter.total);


        new Counter();
        new Counter();
        System.out.println(Counter.getTotal());

        // System.out.println(Hello.world);
        Hello.world = "Hello hello";
        System.out.println(Hello.world);

        System.out.println("g acceleration is " + Accelerate.G_ACC);
        // Accelerate.G_ACC = 10.0f; // This is an error!
    }
}
