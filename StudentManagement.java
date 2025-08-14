import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Student class to hold details
class Student {
    private String name;
    private int age;
    private String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setGrade(String grade) { this.grade = grade; }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Grade: " + grade;
    }
}

// Main class
public class StudentManagement {
    private HashMap<Integer, Student> studentMap = new HashMap<>();
    private Scanner sc = new Scanner(System.in);

    // Add student
    public void addStudent() {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        studentMap.put(id, new Student(name, age, grade));
        System.out.println("✅ Student added successfully!\n");
    }

    // Display all students
    public void displayStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No student records found.\n");
            return;
        }
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " → " + entry.getValue());
        }
        System.out.println();
    }

    // Update student
    public void updateStudent() {
        System.out.print("Enter Student ID to update: ");
        int id = sc.nextInt();
        sc.nextLine();
        if (studentMap.containsKey(id)) {
            System.out.print("Enter new Name: ");
            String name = sc.nextLine();
            System.out.print("Enter new Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter new Grade: ");
            String grade = sc.nextLine();

            studentMap.put(id, new Student(name, age, grade));
            System.out.println("✅ Student updated successfully!\n");
        } else {
            System.out.println("❌ Student ID not found.\n");
        }
    }

    // Remove student
    public void removeStudent() {
        System.out.print("Enter Student ID to remove: ");
        int id = sc.nextInt();
        if (studentMap.remove(id) != null) {
            System.out.println("✅ Student removed successfully!\n");
        } else {
            System.out.println("❌ Student ID not found.\n");
        }
    }

    // Menu-driven
    public void menu() {
        while (true) {
            System.out.println("=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Update Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: addStudent(); break;
                case 2: displayStudents(); break;
                case 3: updateStudent(); break;
                case 4: removeStudent(); break;
                case 5: 
                    System.out.println("Exiting... Goodbye!");
                    return;
                default: System.out.println("❌ Invalid choice.\n");
            }
        }
    }

    public static void main(String[] args) {
        StudentManagement sm = new StudentManagement();
        sm.menu();
    }
}
