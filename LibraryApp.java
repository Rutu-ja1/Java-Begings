import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    boolean isAvailable;

    //Constructor

    public Book(String title){
        this.title = title;
        this.isAvailable = true;


    }

}

 class Library {
    private ArrayList<Book> books = new ArrayList<>();

    //Add a new book

    public void addBook(String title){
        books.add(new Book(title));
        System.out.println("Book \""+ title + "\" added to the library.");

    }

    //Display available books

    public void displayAvailableBooks(){
        System.out.println("\n Available Books: ");
        boolean found = false;
        for(Book book : books){
            if(book.isAvailable){
                System.out.println("- "+ book.title);
                found = true;
            }
        }
        if (!found){
            System.out.println("No books available.");

        }
    }

    //Check out a book

    public void checkOutBook(String title){
        for(Book book : books){
            if(book.title.equalsIgnoreCase(title) && book.isAvailable){
                book.isAvailable = false;
                System.out.println("you Checked out \"" + book.title + "\".");
                return;
            }
        }
        System.out.println(" Book not available or doesn't exist. ");


    }
    //Return a book

    public void returnBook(String title){
        for(Book book : books){
            if(book.title.equalsIgnoreCase(title) && !book.isAvailable){
                book.isAvailable = true;
                System.out.println("Book \""+ book.title + "\" returned.");
                return; 
            }
        }
        System.out.println("Invalid return . Book not found or already returned.");

    }
    
}

public class LibraryApp {
    public static void main(String[] args){
     Scanner scanner = new Scanner(System.in);
     Library library = new Library();
     int choice;

     do{
        System.out.println("\n== Library Menu ==");
        System.out.println("1. Add Book");
        System.out.println("2. Check out Book");
        System.out.println("3. Return Book");
        System.out.println("4. Display Available Books");
        System.out.println("5. Exit");

        choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1 :
            System.out.println("Enter book title to add: ");
            String addTitle = scanner.nextLine();
            library.addBook(addTitle);
            break;

            case 2 :
            System.out.println("Enter book title to check out: ");
            String checkoutTitle = scanner.nextLine();
            library.checkOutBook(checkoutTitle);
            break;

            case 3 :
            System.out.println("Enter book title to return: ");
            String returnTitle = scanner.nextLine();
            library.returnBook(returnTitle);
            break;

            case 4 :
            library.displayAvailableBooks();
            
            break;
           case 5:
                    System.out.println("👋 Exiting the library. Goodbye!");
                    break;
                default:
                    System.out.println("⚠️ Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}



