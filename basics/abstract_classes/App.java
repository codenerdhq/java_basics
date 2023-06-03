package abstract_classes;


public class App {
    public static void main(String[] args) throws Exception {
        Shape circle = new Circle();
        circle.printName();
        System.out.println("Circle area: " + circle.calculateArea());

        Shape rectangle = new Rectangle();
        rectangle.printName(); // Outputs: This is a shape.
        System.out.println("rectangle area: " + rectangle.calculateArea());

        // This is an error
        // Shape cannot be directly instantiated with new
        // Shape someshape = new Shape();
    }
}
