package abstract_classes;

class Circle extends Shape {
    private double radius = 10.0;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

