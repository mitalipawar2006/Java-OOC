class Employee{
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String f, String l, double salary) {
        firstName = f;
        lastName = l;
        if (salary > 0)
            monthlySalary = salary;
        else
            monthlySalary = 0.0;
    }

    public void setFirstName(String f) {
        firstName = f;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String l) {
        lastName = l;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonthlySalary(double salary) {
        if (salary > 0)
            monthlySalary = salary;
        else
            monthlySalary = 0.0;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }
}
public class EmployeeTest{
    public static void main(String[] args) {

        Employee e1 = new Employee("Rahul", "Sharma", 20000);
        Employee e2 = new Employee("Neha", "Patil", 30000);

        System.out.println("Yearly Salaries:");
        System.out.println(e1.getFirstName() + ": " + e1.getYearlySalary());
        System.out.println(e2.getFirstName() + ": " + e2.getYearlySalary());

        e1.setMonthlySalary(e1.getMonthlySalary() * 1.10);
        e2.setMonthlySalary(e2.getMonthlySalary() * 1.10);

        System.out.println("\nAfter 10% Raise:");
        System.out.println(e1.getFirstName() + ": " + e1.getYearlySalary());
        System.out.println(e2.getFirstName() + ": " + e2.getYearlySalary());
    }
}
