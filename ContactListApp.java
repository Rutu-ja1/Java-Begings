import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Contact class
class Contact {
    private String phone;
    private String email;

    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Phone: " + phone + ", Email: " + email;
    }
}

// Main class
public class ContactListApp {
    private static HashMap<String, Contact> contactList = new HashMap<>();

    // Add Contact
    public static void addContact(String name, String phone, String email) {
        contactList.put(name, new Contact(phone, email));
        System.out.println("Contact added successfully!");
    }

    // Retrieve Contact
    public static void getContact(String name) {
        Contact contact = contactList.get(name);
        if (contact != null) {
            System.out.println("Name: " + name + " → " + contact);
        } else {
            System.out.println("Contact not found!");
        }
    }

    // Remove Contact
    public static void removeContact(String name) {
        if (contactList.remove(name) != null) {
            System.out.println("Contact removed successfully!");
        } else {
            System.out.println("Contact not found!");
        }
    }

    // Display All Contacts
    public static void displayAllContacts() {
        if (contactList.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (Map.Entry<String, Contact> entry : contactList.entrySet()) {
                System.out.println("Name: " + entry.getKey() + " → " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\n--- Contact List Menu ---");
            System.out.println("1. Add Contact");
            System.out.println("2. Retrieve Contact");
            System.out.println("3. Remove Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Phone: ");
                    String phone = sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email = sc.nextLine();
                    addContact(name, phone, email);
                    break;

                case 2:
                    System.out.print("Enter Name to Retrieve: ");
                    String searchName = sc.nextLine();
                    getContact(searchName);
                    break;

                case 3:
                    System.out.print("Enter Name to Remove: ");
                    String removeName = sc.nextLine();
                    removeContact(removeName);
                    break;

                case 4:
                    displayAllContacts();
                    break;

                case 5:
                    System.out.println("Exiting Contact List App...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Try again.");
            }
        }
    }
}
