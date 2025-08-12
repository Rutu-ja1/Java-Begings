class Car {
    // Attributes
    private String make;
    private String model;
    private int year;

    // Method to set car details
    public void setDetails(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Make: " + make);
        System.out.println("Car Model: " + model);
        System.out.println("Car Year: " + year);
        System.out.println("-----------------------");
    }
}

// Main class
public class CarDemo {
    public static void main(String[] args) {
        // Create first car object
        Car car1 = new Car();
        car1.setDetails("Toyota", "Camry", 2020);
        
        // Create second car object
        Car car2 = new Car();
        car2.setDetails("Honda", "Civic", 2022);

        // Display car details
        System.out.println("Car 1 Details:");
        car1.displayDetails();

        System.out.println("Car 2 Details:");
        car2.displayDetails();
    }
}
