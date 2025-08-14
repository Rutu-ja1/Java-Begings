public class Product {
    private String name;
    private double price;
    private int quantity;

//Constructor 

public Product (String name) {
   this.name = name;
   this.price = 0.0;
   this.quantity = 0;
   
}

//constructor 

public Product(String name, double price){
    this.name = name;
    this.price = price; 
    this.quantity =0;

}

//constructor

public void displayProduct(String name, double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;

}

public Product(String name, double price, int quantity){
    this.name = name;
    this.price = price;
    this.quantity = quantity;
}

public void displayProduct(){
    System.out.println("Product Name: " + name);
    System.out.println("Price: " + price);
    System.out.println("Quantity: " + quantity);
    System.out.println("---------------------------");
}

//main method for testing
public static void main(String[] args) {
    Product p1 = new Product("Laptop");
    Product p2 = new Product("Phone", 699.99);
    Product p3 = new Product("Tablet", 299.99, 5);


    p1.displayProduct();
    p2.displayProduct();
    p3.displayProduct();
}



}