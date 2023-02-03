package superclasses;

public class Driver extends Person {
    private int position;

    public Driver(String name, int age, 
                    int position) {
        super(name, age);
        this.position = position;
    }

    public int getPosition() {
        return this.position;
    }

    @Override
    public String toString() {
        return super.toString() + 
                " , championship Position: " + 
                    this.getPosition();
    }
}