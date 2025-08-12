import java.util.Scanner;

class Calculator{
    public double add(double a, double b) {
        return a + b;
        
    }

    public double subtract(double a, double b){
        return a - b;
    }

    public double multiply(double a, double b){
        return a * b;
    }

    public double divide(double a, double b){
        try {
            if(b == 0){
                throw new ArithmeticException("Cannot divide by zero!");
            }
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return Double.NaN;
        }
    }
}






public class CalculatorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter Second number: ");
        double num2 = sc.nextDouble();
        
        
        System.out.println("\nResults:");
        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        System.out.println("Division: " + calc.divide(num1, num2));
        
        sc.close();
    

    }
}
