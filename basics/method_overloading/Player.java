package method_overloading;

public class Player {
    private String name;
    private int score;

    public Player(String name) {
        this.name = name;
    }

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String toString() {
        return "Name " + this.name + ", score: " + this.score;
    }

}
