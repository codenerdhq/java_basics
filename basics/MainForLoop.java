public class MainForLoop{
	public static void main(String[] args) {
        // Our Array of integers
        int[] numbers = new int[] {10, 5, 12, 6, 9};

        // For loop in Java
        for (int i=0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Enhanced for loop in Java
        for (int i : numbers) {
            System.out.println(i);
        }
	}
}




