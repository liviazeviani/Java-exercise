import java.util.Date;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public String paymentDate;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        this.grossSalary += grossSalary * percentage/100.00;
    }


    public String toString() {
        return name + ", $" + String.format("%.2f", netSalary()) + " in the date: " + paymentDate;
    }
}
