import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RestaurantMenu {
    private HashMap<String, Double> menu;

    public RestaurantMenu() {
        menu = new HashMap<>();
    }

    // Add a new dish
    public void addDish(String name, double price) {
        menu.put(name, price);
        System.out.println("Dish added successfully!");
    }

    // Update price of a dish
    public void updatePrice(String name, double price) {
        if (menu.containsKey(name)) {
            menu.put(name, price);
            System.out.println("Price updated successfully!");
        } else {
            System.out.println("Dish not found in menu!");
        }
    }

    // Display the menu
    public void displayMenu() {
        if (menu.isEmpty()) {
            System.out.println("Menu is empty.");
        } else {
            System.out.println("\n--- Restaurant Menu ---");
            for (Map.Entry<String, Double> entry : menu.entrySet()) {
                System.out.println(entry.getKey() + " - ₹" + entry.getValue());
            }
        }
    }

    // Remove a dish
    public void removeDish(String name) {
        if (menu.remove(name) != null) {
            System.out.println("Dish removed successfully!");
        } else {
            System.out.println("Dish not found in menu!");
        }
    }

    public static void main(String[] args) {
        RestaurantMenu restaurantMenu = new RestaurantMenu();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Restaurant Menu Operations ---");
            System.out.println("1. Add Dish");
            System.out.println("2. Update Price");
            System.out.println("3. Display Menu");
            System.out.println("4. Remove Dish");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter dish name: ");
                    String dishName = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    restaurantMenu.addDish(dishName, price);
                    break;

                case 2:
                    System.out.print("Enter dish name to update: ");
                    dishName = sc.nextLine();
                    System.out.print("Enter new price: ");
                    price = sc.nextDouble();
                    restaurantMenu.updatePrice(dishName, price);
                    break;

                case 3:
                    restaurantMenu.displayMenu();
                    break;

                case 4:
                    System.out.print("Enter dish name to remove: ");
                    dishName = sc.nextLine();
                    restaurantMenu.removeDish(dishName);
                    break;

                case 5:
                    System.out.println("Exiting... Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
