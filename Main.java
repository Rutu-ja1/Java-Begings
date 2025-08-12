import java.util.ArrayList;
import java.util.List;

// Generic CustomerList Class
class CustomerList<T> {
    private List<T> items;

    public CustomerList() {
        items = new ArrayList<>();
    }

    // Add element to the list
    public void add(T element) {
        items.add(element);
    }

    // Get element by index
    public T get(int index) {
        if (index >= 0 && index < items.size()) {
            return items.get(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }

    // Display list contents
    public void display() {
        if (items.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            System.out.println("Customer List Contents:");
            for (T item : items) {
                System.out.println(item);
            }
        }
    }
}

// Main class to test CustomerList
public class Main {
    public static void main(String[] args) {
        // Using CustomerList for Strings
        CustomerList<String> customerNames = new CustomerList<>();
        customerNames.add("Alice");
        customerNames.add("Bob");
        customerNames.add("Charlie");

        customerNames.display();

        System.out.println("\nCustomer at index 1: " + customerNames.get(1));

        // Using CustomerList for Integers
        CustomerList<Integer> customerIDs = new CustomerList<>();
        customerIDs.add(101);
        customerIDs.add(102);
        customerIDs.add(103);

        customerIDs.display();

        System.out.println("\nCustomer ID at index 2: " + customerIDs.get(2));
    }
}

