public class Person {
    // Private attributes (data hiding)
    private String name;
    private int age;
    private String id;

    // Constructor
    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        // You can add validation here if needed
        this.name = name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("Invalid age! Please enter a valid age.");
        }
    }

    // Getter for ID
    public String getId() {
        return id;
    }

    // Setter for ID
    public void setId(String id) {
        this.id = id;
    }

    // Display person details
    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID: " + id);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create Person object
        Person p1 = new Person("John Doe", 25, "P12345");

        // Display details
        p1.displayPersonInfo();

        // Modify attributes using setters
        p1.setName("Jane Doe");
        p1.setAge(30);
        p1.setId("P67890");

        // Display updated details
        System.out.println("\nAfter update:");
        p1.displayPersonInfo();
    }
}
