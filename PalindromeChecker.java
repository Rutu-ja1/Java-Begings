import java.util.Scanner;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String input = scanner.nextLine();

        String original = input.toLowerCase();

        String reversed = "";
        for(int i = original.length() - 1; i >= 0; i--){
            reversed += original.charAt(i);


        }

        if(original.equals(reversed)){
            System.out.println("The string is a palindrome. ");

        } else {
            System.out.println("The string is not a Palindrome. ");
        }
        scanner.close();
    }
}
