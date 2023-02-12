// Author: CodeNerdHQ
import java.util.ArrayList;

public class ArrayListExample{
    public static void main(String[] args) {
        // Initialize an ArrayList of 
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add elements in the array
        numbers.add(6);
        numbers.add(2);

        // Print content
        System.out.println(numbers);

        // Returns true
        System.out.println(numbers.contains(2));

        // Prints 1
        System.out.println(numbers.indexOf(2));

        // Prints false
        System.out.println(numbers.isEmpty());

        // Prints 2
        System.out.println(numbers.size());

        // Another ArrayList
        ArrayList<String> words = new ArrayList<>();

        // Add element
        words.add("World");

        // Add element in front
        words.add(0, "Hello");

        // Remove an element
        words.remove("Hello");

        // Print content
        System.out.println(words);
	}
}