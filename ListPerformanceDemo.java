import java.util.*;


public class ListPerformanceDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Add Element");
            System.out.println("2. Remove Element");
            System.out.println("3. Retrieve Element");
            System.out.println("4. Display Lists");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            String element;
            int index;
            long startTime, endTime;

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    element = sc.nextLine();

                    startTime = System.nanoTime();
                    arrayList.add(element);
                    endTime = System.nanoTime();
                    System.out.println("ArrayList Add Time: " + (endTime - startTime) + " ns");

                    startTime = System.nanoTime();
                    linkedList.add(element);
                    endTime = System.nanoTime();
                    System.out.println("LinkedList Add Time: " + (endTime - startTime) + " ns");
                    break;

                case 2:
                    System.out.print("Enter index to remove: ");
                    index = sc.nextInt();

                    if (index >= 0 && index < arrayList.size()) {
                        startTime = System.nanoTime();
                        arrayList.remove(index);
                        endTime = System.nanoTime();
                        System.out.println("ArrayList Remove Time: " + (endTime - startTime) + " ns");
                    } else {
                        System.out.println("Invalid index for ArrayList!");
                    }

                    if (index >= 0 && index < linkedList.size()) {
                        startTime = System.nanoTime();
                        linkedList.remove(index);
                        endTime = System.nanoTime();
                        System.out.println("LinkedList Remove Time: " + (endTime - startTime) + " ns");
                    } else {
                        System.out.println("Invalid index for LinkedList!");
                    }
                    break;

                case 3:
                    System.out.print("Enter index to retrieve: ");
                    index = sc.nextInt();

                    if (index >= 0 && index < arrayList.size()) {
                        startTime = System.nanoTime();
                        System.out.println("ArrayList Element: " + arrayList.get(index));
                        endTime = System.nanoTime();
                        System.out.println("ArrayList Retrieve Time: " + (endTime - startTime) + " ns");
                    } else {
                        System.out.println("Invalid index for ArrayList!");
                    }

                    if (index >= 0 && index < linkedList.size()) {
                        startTime = System.nanoTime();
                        System.out.println("LinkedList Element: " + linkedList.get(index));
                        endTime = System.nanoTime();
                        System.out.println("LinkedList Retrieve Time: " + (endTime - startTime) + " ns");
                    } else {
                        System.out.println("Invalid index for LinkedList!");
                    }
                    break;

                case 4:
                    System.out.println("ArrayList: " + arrayList);
                    System.out.println("LinkedList: " + linkedList);
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
