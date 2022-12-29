import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Name: " );
        employee.name = scan.nextLine();
        System.out.println("Gross salary: " );
        employee.grossSalary = scan.nextDouble();
        System.out.println("Payment date: " );
        employee.paymentDate = scan.next();
        System.out.println("Tax: " );
        employee.tax = scan.nextDouble();


        System.out.println();
        System.out.println("Employee: " + employee);
        System.out.println();
        System.out.println("Which percentage to increase salary? " );
        double percentage = scan.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Updated data: " + employee);

        scan.close();
    }
}


