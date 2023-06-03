package abstract_classes;

class Rectangle extends Shape {
    private double length = 5.0;
    private double width = 10.0;

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public void printName() {
        System.out.println("I am a rectangle!!!");
    }
}