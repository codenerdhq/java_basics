package static_members;

public class Counter {
    static int total = 0;
    public Counter() {
        total ++;
    }
    public static int getTotal(){return total;}
}
