import java.util.Scanner;



public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Input from user
        System.out.println("Enter employee name: ");
        String name = sc.nextLine();

        System.out.println("Enter hours worked: ");
        double hoursWorked = sc.nextDouble();

        System.out.println("Enter Hourly rate: ");
        double hourlyRate = sc.nextDouble();

        double regularHours = 40;
        double overtimeRate = 1.5;
        double totalPay;

        //Pay roll calculation 

        if(hoursWorked <= regularHours){
            totalPay = hoursWorked * hourlyRate;
        } else{
            double overtimeHours = hoursWorked - regularHours;
            totalPay = (regularHours * hourlyRate) + (overtimeHours * hourlyRate * overtimeRate);
        }

        //Display result

        System.out.println("\n============= Payroll Details ===============");
        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: $" + hourlyRate);
        System.out.println("Total Pay: $" + totalPay);

        sc.close();
    }
}
