import java.util.Arrays;
import java.util.List;

public class WildcardExample {
   // Method with unbounded wildcard
    public static void displayList(List<?> list) {
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        // List of Integers
        List<Integer> intList = Arrays.asList(10, 20, 30, 40);

        // List of Strings
        List<String> stringList = Arrays.asList("Apple", "Banana", "Cherry");

        // List of Doubles
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);

        System.out.println("Integer List:");
        displayList(intList);

        System.out.println("\nString List:");
        displayList(stringList);

        System.out.println("\nDouble List:");
        displayList(doubleList);
    } 
}
